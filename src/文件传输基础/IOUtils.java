package 文件传输基础;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOUtils {
	// 读取指定文件内容，按照16进制输出到控制台
	// 没输出10个byte换行
	public static void printHex(String fileName) throws IOException {
		// 把文件作为字节流进行读操作
		FileInputStream in = new FileInputStream(fileName);
		int b;
		int i = 1;
		while ((b = in.read()) != -1) {
			if (b <= 0xf) {
				// 单位数前面补0
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
		// 从in中读取字节，放入到buf这个字节数组中
		int bytes = in.read(buf, 0, buf.length);// 有可能没有放满
		int j=1;
		System.out.println(bytes);// 10
		for (int i = 0; i < bytes; i++) {
			if (buf[i] <= 0xf && buf[i] >= 0) { // 不懂以后要弄清楚
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
		// 如果该文件不存在，则直接创建，如果存在，删除后创建
		// 如果有true,则在文件内容中追加
		FileOutputStream out = new FileOutputStream("G:/java_study/code/文件传输基础目录/out.dat", true);
		out.write('A');// 低八位
		out.write('B');// 低八位
		int a = 10;
		out.write(a >>> 24);
		out.write(a >>> 16);
		out.write(a >>> 8);
		out.write(a);
		byte[] gbk = "中国".getBytes("gbk");
		out.write(gbk);
		out.close();
		printHex("G:/java_study/code/文件传输基础目录/out.dat");
	}

	public static void copyFile(File srcFile, File destFile) throws IOException {
		if(!srcFile.exists()){
			throw new IllegalArgumentException("文件:" + srcFile + "不存在");
		}
		if (!srcFile.isFile()) {
			throw new IllegalArgumentException(srcFile + "是文件");
		}
		FileInputStream in = new FileInputStream(srcFile);
		FileOutputStream out = new FileOutputStream(destFile);
		byte[] buf = new byte[8 * 1024];
		int b;
		while ((b = in.read(buf, 0, buf.length)) != -1) {
			out.write(buf, 0, b);
			out.flush();// 清空缓冲流
		}
		in.close();
		out.close();
		System.out.println("same?");
		printHex("G:/java_study/code/文件传输基础目录/out2.dat");
	}

	public static void DosDemo() throws IOException {
		String file = "G:/java_study/code/文件传输基础目录/DosDemo.dat";
		// 转换后就可以用writeInt等函数
		DataOutputStream dos = new DataOutputStream(new FileOutputStream(file));
		dos.writeInt(10);
		dos.writeInt(-10);
		dos.writeLong(10l);
		dos.writeDouble(10.5);
		dos.writeUTF("中国");// 采用UTF-8编码写出
		dos.writeChars("中国");// 采用utf-16be编码写出
		dos.close();
		printHex(file);
	}

	public static void DosDemoRead() throws IOException {
		String file = "G:/java_study/code/文件传输基础目录/DosDemo.dat";
		// 转换后就可以用writeInt等函数
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
			throw new IllegalArgumentException("文件:" + srcFile + "不存在");
		}
		if (!srcFile.isFile()) {
			throw new IllegalArgumentException(srcFile + "是文件");
		}
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));
		int c;
		while ((c = bis.read()) != -1) {
			bos.write(c);
			bos.flush();// 刷新缓冲区，否则不能写入
		}
		bis.close();
		bos.close();
		System.out.println("same?");
		printHex(destFile.getAbsolutePath());
	}
}
