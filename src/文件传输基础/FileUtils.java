package 文件传输基础;

import java.io.File;
import java.io.IOException;

//列出File的一些常用操作，比如过滤、遍历等擦偶作
public class FileUtils {
	/*
	 * 列出指定目录下（包括其子目录）的所有文件
	 */
	public static void listDirectory(File dir) throws IOException {
		if (!dir.exists()) {
			throw new IllegalArgumentException("目录：" + dir + "不存在.");
		}
		if (!dir.isDirectory()) {
			throw new IllegalArgumentException(dir + "不是目录");
		}
		
		// 列出该目录下的子目录和文件，不包含二级目录，返回的是字符串数组
		String[] filenames = dir.list();
		// System.out.println(Arrays.toString(filenames));
		for (String str : filenames) {
			System.out.println(dir + "\\" + str);
		}
		
		// 列出该目录下的子目录和文件对象，不会做递归
		File[] files = dir.listFiles();
		// System.out.println(Arrays.toString(files));
		if(files!=null&&files.length>0){
			for (File file : files) {
				if (file.isDirectory()) {
					// 递归操作
					listDirectory(file);
				} else {
					System.out.println(file);
				}
			}
		}
	}

}
