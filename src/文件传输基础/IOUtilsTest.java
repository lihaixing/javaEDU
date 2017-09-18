package 文件传输基础;

import java.io.File;
import java.io.IOException;

public class IOUtilsTest {

	public static void main(String[] args) throws IOException {
		IOUtils.printHex("G:\\java_study\\code\\imooc\\demo\\raf.dat");
		// IOUtils.printHexByteArray("G:\\java_study\\code\\imooc\\demo\\raf.dat");
		IOUtils.FileOutputDemo1();
		long start = System.currentTimeMillis();
		IOUtils.copyFile(new File("G:/java_study/code/文件传输基础目录/out.dat"),
				new File("G:/java_study/code/文件传输基础目录/out2.dat"));
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		System.out.println("__________dosdemo__________");
		IOUtils.DosDemo();
		System.out.println("__________dosdemoRead__________");
		IOUtils.DosDemoRead();
		System.out.println("__________copyFileByBufferd__________");
		long start1 = System.currentTimeMillis();
		IOUtils.copyFileByBufferd(new File("G:/java_study/code/文件传输基础目录/out2.dat"),
				new File("G:/java_study/code/文件传输基础目录/out3.dat"));
		long end1 = System.currentTimeMillis();
		System.out.println(end1 - start1);
	}
}
