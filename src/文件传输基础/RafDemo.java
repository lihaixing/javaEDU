package �ļ��������;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class RafDemo {

	public static void main(String[] args) throws IOException {
		// ���û��д����·�����Ǿ���һ�����·��������Ŀ�ĸ�Ŀ¼
		File demo = new File("demo");
		if (!demo.exists()) {
			demo.mkdir();
		}
		File file = new File(demo, "raf.dat");
		if (!file.exists()) {
			file.createNewFile();
		}

		RandomAccessFile raf = new RandomAccessFile(file, "rw");
		// ָ���λ��
		System.out.println(raf.getFilePointer());// 0

		// д����
		raf.write('A');// ֻд��һ���ֽڣ���8λ�����ܺ��λ�Ѿ��ܹ���ʾ����ַ��ˣ���Ϊ����ǰ��λ����0������û�а�һ���ַ���д��ȥ,char��2���ֽ�
		System.out.println(raf.getFilePointer());// 1
		raf.write('B');
		System.out.println(raf.getFilePointer());// 2

		int i = 0x7fffffff;// ��д�Ĵ�
		raf.write(i >>> 24);// ��8λ
		raf.write(i >>> 16);
		raf.write(i >>> 8);
		raf.write(i);
		// ������wirteInt����
		// raf.writeInt(i);
		System.out.println(raf.getFilePointer());// 6

		String s = "����";
		byte[] gbk = s.getBytes("gbk");
		raf.write(gbk);// ����ֱ��д�ֽ�����
		System.out.println(raf.getFilePointer());// 10
		System.out.println(raf.length());// 10

		// ���ļ�ʱ�������ָ���ƶ���ͷ��
		raf.seek(0);
		// һ���Զ�ȡ,���ļ��е����ݶ������ֽ�������
		byte[] buf = new byte[(int) raf.length()];
		// byte a = (byte) raf.read();// ֻ��һ���ֽ�
		// System.out.println(a);//65
		raf.read(buf);// һ���Զ���
		System.out.println(Arrays.toString(buf));
		String str = new String(buf, "gbk");
		System.out.println(str);

	}

}
