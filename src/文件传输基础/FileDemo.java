package �ļ��������;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// alt+/�ɲ鿴����
		File file = new File("G:\\java_study\\code\\�ļ��������Ŀ¼\\hello.txt");
		// �ж��ļ��Ƿ����
		System.out.println(file.exists());
		if (!file.exists()) {
			// ���ļ����ļ�Ŀ¼�����ڣ�ֱ�Ӵ���Ŀ¼
			// file.mkdir();
			// ���Ҫ�����༶Ŀ¼�������·���
			// file.mkdirs();
			// ���ļ����ļ�Ŀ¼�����ڣ�ֱ�Ӵ����ļ�
			file.createNewFile();
		} else {
			// ���ļ����ڣ�ɾ��Ŀ¼
			file.delete();
		}
		// �ж��Ƿ���Ŀ¼
		System.out.println(file.isDirectory());
		// �ж��Ƿ����ļ�
		System.out.println(file.isFile());

		// ����д���� ����һ����
		File file2 = new File("G:\\java_study\\code\\�ļ��������Ŀ¼\\���.txt");
		File file3 = new File("G:\\java_study\\code\\�ļ��������Ŀ¼", "���.txt");
		System.out.println(file2.exists());
		System.out.println(file3.exists());

		// ����api
		System.out.println(file3);// ��ӡĿ¼ �൱��file.toString()
		System.out.println(file3.getAbsolutePath());// String
		System.out.println(file3.getName());// String
		System.out.println(file3.getParent());// �õ����׵�Ŀ¼,������String
		System.out.println(file3.getParentFile());// �õ����׵�Ŀ¼����������File
	}

}
