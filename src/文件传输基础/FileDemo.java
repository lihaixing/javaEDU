package 文件传输基础;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// alt+/可查看帮助
		File file = new File("G:\\java_study\\code\\文件传输基础目录\\hello.txt");
		// 判断文件是否存在
		System.out.println(file.exists());
		if (!file.exists()) {
			// 若文件或文件目录不存在，直接创建目录
			// file.mkdir();
			// 如果要创建多级目录，用以下方法
			// file.mkdirs();
			// 若文件或文件目录不存在，直接创建文件
			file.createNewFile();
		} else {
			// 若文件存在，删除目录
			file.delete();
		}
		// 判断是否是目录
		System.out.println(file.isDirectory());
		// 判断是否是文件
		System.out.println(file.isFile());

		// 两种写法， 都是一样的
		File file2 = new File("G:\\java_study\\code\\文件传输基础目录\\你好.txt");
		File file3 = new File("G:\\java_study\\code\\文件传输基础目录", "你好.txt");
		System.out.println(file2.exists());
		System.out.println(file3.exists());

		// 常用api
		System.out.println(file3);// 打印目录 相当于file.toString()
		System.out.println(file3.getAbsolutePath());// String
		System.out.println(file3.getName());// String
		System.out.println(file3.getParent());// 得到父亲的目录,类型是String
		System.out.println(file3.getParentFile());// 得到父亲的目录对象，类型是File
	}

}
