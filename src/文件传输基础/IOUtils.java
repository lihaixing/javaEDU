package �ļ��������;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOUtils {
	// ��ȡָ���ļ����ݣ�����16�������������̨
	// û���10��byte����
	public static void printHex(String fileName) throws IOException {
		// ���ļ���Ϊ�ֽ������ж�����
		FileInputStream in = new FileInputStream(fileName);
		int b;
		int i = 1;
		while ((b = in.read()) != -1) {
			if (b <= 0xf) {
				// ��λ��ǰ�油0
				System.out.print("0");
			}
			System.out.print(Integer.toHexString(b) + "-");
			if (i++ % 10 == 0) {
				System.out.println();
			}
		}
		in.close();
	}

	public static void printHexByteArray(String fileName) throws IOException {
		FileInputStream in = new FileInputStream(fileName);
		byte[] buf = new byte[20 * 1024];
		// ��in�ж�ȡ�ֽڣ����뵽buf����ֽ�������
		int bytes = in.read(buf, 0, buf.length);// �п���û�з���
		int j=1;
		System.out.println(bytes);// 10
		for (int i = 0; i < bytes; i++) {
			if (buf[i] <= 0xf && buf[i] >= 0) { // �����Ժ�ҪŪ���
				System.out.print("0");
			}
			System.out.print(Integer.toHexString(buf[i] & 0xff) + "-");
			if (j++ % 10 == 0) {
				System.out.println();
			}
		}
		in.close();
	}

	public static void FileOutputDemo1() throws IOException {
		// ������ļ������ڣ���ֱ�Ӵ�����������ڣ�ɾ���󴴽�
		// �����true,�����ļ�������׷��
		FileOutputStream out = new FileOutputStream("G:/java_study/code/�ļ��������Ŀ¼/out.dat", true);
		out.write('A');// �Ͱ�λ
		out.write('B');// �Ͱ�λ
		int a = 10;
		out.write(a >>> 24);
		out.write(a >>> 16);
		out.write(a >>> 8);
		out.write(a);
		byte[] gbk = "�й�".getBytes("gbk");
		out.write(gbk);
		out.close();
		printHex("G:/java_study/code/�ļ��������Ŀ¼/out.dat");
	}

	public static void copyFile(File srcFile, File destFile) throws IOException {
		if(!srcFile.exists()){
			throw new IllegalArgumentException("�ļ�:" + srcFile + "������");
		}
		if (!srcFile.isFile()) {
			throw new IllegalArgumentException(srcFile + "���ļ�");
		}
		FileInputStream in = new FileInputStream(srcFile);
		FileOutputStream out = new FileOutputStream(destFile);
		byte[] buf = new byte[8 * 1024];
		int b;
		while ((b = in.read(buf, 0, buf.length)) != -1) {
			out.write(buf, 0, b);
			out.flush();// ��ջ�����
		}
		in.close();
		out.close();
		System.out.println("same?");
		printHex("G:/java_study/code/�ļ��������Ŀ¼/out2.dat");
	}

	public static void DosDemo() throws IOException {
		String file = "G:/java_study/code/�ļ��������Ŀ¼/DosDemo.dat";
		// ת����Ϳ�����writeInt�Ⱥ���
		DataOutputStream dos = new DataOutputStream(new FileOutputStream(file));
		dos.writeInt(10);
		dos.writeInt(-10);
		dos.writeLong(10l);
		dos.writeDouble(10.5);
		dos.writeUTF("�й�");// ����UTF-8����д��
		dos.writeChars("�й�");// ����utf-16be����д��
		dos.close();
		printHex(file);
	}

	public static void DosDemoRead() throws IOException {
		String file = "G:/java_study/code/�ļ��������Ŀ¼/DosDemo.dat";
		// ת����Ϳ�����writeInt�Ⱥ���
		DataInputStream dirs = new DataInputStream(new FileInputStream(file));
		int i = dirs.readInt();
		System.out.println(i);
		i = dirs.readInt();
		System.out.println(i);
		long l = dirs.readLong();
		System.out.println(l);
		double d = dirs.readDouble();
		System.out.println(d);
		String s = dirs.readUTF();
		System.out.println(s);
		dirs.close();
	}

	public static void copyFileByBufferd(File srcFile, File destFile) throws IOException {
		if (!srcFile.exists()) {
			throw new IllegalArgumentException("�ļ�:" + srcFile + "������");
		}
		if (!srcFile.isFile()) {
			throw new IllegalArgumentException(srcFile + "���ļ�");
		}
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));
		int c;
		while ((c = bis.read()) != -1) {
			bos.write(c);
			bos.flush();// ˢ�»�������������д��
		}
		bis.close();
		bos.close();
		System.out.println("same?");
		printHex(destFile.getAbsolutePath());
	}
}
