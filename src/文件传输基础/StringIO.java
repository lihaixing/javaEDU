package 文件传输基础;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class StringIO {
	public static void main(String[] args) throws IOException {
		FileInputStream in = new FileInputStream("G:/java_study/code/文件传输基础目录/out2.dat");
		InputStreamReader isr = new InputStreamReader(in, "gbk"); // 默认项目编码

		FileOutputStream out = new FileOutputStream("G:/java_study/code/文件传输基础目录/联.txt");
		OutputStreamWriter osw = new OutputStreamWriter(out);

		// int c;
		// while ((c = isr.read()) != -1) {
		// System.out.print((char) c);
		// }

		char[] buffer = new char[8 * 1024];
		int c;
		// 返回的是字符的个数
		while ((c = isr.read(buffer, 0, buffer.length)) != -1) {
			String s = new String(buffer, 0, c);
			System.out.println(s);
			osw.write(buffer, 0, c);
			osw.flush();
		}

		FileReader fr = new FileReader("G:/java_study/code/文件传输基础目录/联.txt");
		FileWriter fw = new FileWriter("G:/java_study/code/文件传输基础目录/联2.txt", true);// 有true,表示追加，不会删除重来
		char[] buffer1 = new char[2056];
		int c1;
		while ((c1 = fr.read(buffer1, 0, buffer1.length)) != -1) {
			fw.write(buffer1, 0, c1);
			fw.flush();
		}
		fr.close();
		fw.close();
		
		System.out.println("..............BufferedReader...............");
//		字符流过滤
		BufferedReader br = new BufferedReader(
				new InputStreamReader(new FileInputStream("G:/java_study/code/文件传输基础目录/联2.txt")));
		BufferedWriter bw = new BufferedWriter(
				new OutputStreamWriter(new FileOutputStream("G:/java_study/code/文件传输基础目录/联3.txt")));
		PrintWriter pw = new PrintWriter("G:/java_study/code/文件传输基础目录/printWriter.txt");

		String line;
		while ((line = br.readLine()) != null) {
			System.out.println(line);// 直接是字符串 ,一次读一行,不识别换行
			bw.write(line);
			bw.newLine();// 换行操作
			bw.flush();

			pw.println(line);
			pw.flush();
		}
		br.close();
		bw.close();
		pw.close();

	}
}
