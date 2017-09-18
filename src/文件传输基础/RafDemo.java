package 文件传输基础;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class RafDemo {

	public static void main(String[] args) throws IOException {
		// 如果没有写绝对路径，那就是一个相对路径，在项目的根目录
		File demo = new File("demo");
		if (!demo.exists()) {
			demo.mkdir();
		}
		File file = new File(demo, "raf.dat");
		if (!file.exists()) {
			file.createNewFile();
		}

		RandomAccessFile raf = new RandomAccessFile(file, "rw");
		// 指针的位置
		System.out.println(raf.getFilePointer());// 0

		// 写操作
		raf.write('A');// 只写了一个字节（后8位，可能后八位已经能够表示这个字符了，因为可能前八位都是0），并没有把一个字符都写进去,char是2个字节
		System.out.println(raf.getFilePointer());// 1
		raf.write('B');
		System.out.println(raf.getFilePointer());// 2

		int i = 0x7fffffff;// 得写四次
		raf.write(i >>> 24);// 高8位
		raf.write(i >>> 16);
		raf.write(i >>> 8);
		raf.write(i);
		// 可以用wirteInt代替
		// raf.writeInt(i);
		System.out.println(raf.getFilePointer());// 6

		String s = "中是";
		byte[] gbk = s.getBytes("gbk");
		raf.write(gbk);// 可以直接写字节数组
		System.out.println(raf.getFilePointer());// 10
		System.out.println(raf.length());// 10

		// 读文件时，必须把指针移动到头部
		raf.seek(0);
		// 一次性读取,把文件中的内容都读到字节数组中
		byte[] buf = new byte[(int) raf.length()];
		// byte a = (byte) raf.read();// 只读一个字节
		// System.out.println(a);//65
		raf.read(buf);// 一次性读完
		System.out.println(Arrays.toString(buf));
		String str = new String(buf, "gbk");
		System.out.println(str);

	}

}
