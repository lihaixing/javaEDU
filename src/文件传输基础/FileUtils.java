package �ļ��������;

import java.io.File;
import java.io.IOException;

//�г�File��һЩ���ò�����������ˡ������Ȳ�ż��
public class FileUtils {
	/*
	 * �г�ָ��Ŀ¼�£���������Ŀ¼���������ļ�
	 */
	public static void listDirectory(File dir) throws IOException {
		if (!dir.exists()) {
			throw new IllegalArgumentException("Ŀ¼��" + dir + "������.");
		}
		if (!dir.isDirectory()) {
			throw new IllegalArgumentException(dir + "����Ŀ¼");
		}
		
		// �г���Ŀ¼�µ���Ŀ¼���ļ�������������Ŀ¼�����ص����ַ�������
		String[] filenames = dir.list();
		// System.out.println(Arrays.toString(filenames));
		for (String str : filenames) {
			System.out.println(dir + "\\" + str);
		}
		
		// �г���Ŀ¼�µ���Ŀ¼���ļ����󣬲������ݹ�
		File[] files = dir.listFiles();
		// System.out.println(Arrays.toString(files));
		if(files!=null&&files.length>0){
			for (File file : files) {
				if (file.isDirectory()) {
					// �ݹ����
					listDirectory(file);
				} else {
					System.out.println(file);
				}
			}
		}
	}

}
