package �ļ��������;

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
		FileInputStream in = new FileInputStream("G:/java_study/code/�ļ��������Ŀ¼/out2.dat");
		InputStreamReader isr = new InputStreamReader(in, "gbk"); // Ĭ����Ŀ����

		FileOutputStream out = new FileOutputStream("G:/java_study/code/�ļ��������Ŀ¼/��.txt");
		OutputStreamWriter osw = new OutputStreamWriter(out);

		// int c;
		// while ((c = isr.read()) != -1) {
		// System.out.print((char) c);
		// }

		char[] buffer = new char[8 * 1024];
		int c;
		// ���ص����ַ��ĸ���
		while ((c = isr.read(buffer, 0, buffer.length)) != -1) {
			String s = new String(buffer, 0, c);
			System.out.println(s);
			osw.write(buffer, 0, c);
			osw.flush();
		}

		FileReader fr = new FileReader("G:/java_study/code/�ļ��������Ŀ¼/��.txt");
		FileWriter fw = new FileWriter("G:/java_study/code/�ļ��������Ŀ¼/��2.txt", true);// ��true,��ʾ׷�ӣ�����ɾ������
		char[] buffer1 = new char[2056];
		int c1;
		while ((c1 = fr.read(buffer1, 0, buffer1.length)) != -1) {
			fw.write(buffer1, 0, c1);
			fw.flush();
		}
		fr.close();
		fw.close();
		
		System.out.println("..............BufferedReader...............");
//		�ַ�������
		BufferedReader br = new BufferedReader(
				new InputStreamReader(new FileInputStream("G:/java_study/code/�ļ��������Ŀ¼/��2.txt")));
		BufferedWriter bw = new BufferedWriter(
				new OutputStreamWriter(new FileOutputStream("G:/java_study/code/�ļ��������Ŀ¼/��3.txt")));
		PrintWriter pw = new PrintWriter("G:/java_study/code/�ļ��������Ŀ¼/printWriter.txt");

		String line;
		while ((line = br.readLine()) != null) {
			System.out.println(line);// ֱ�����ַ��� ,һ�ζ�һ��,��ʶ����
			bw.write(line);
			bw.newLine();// ���в���
			bw.flush();

			pw.println(line);
			pw.flush();
		}
		br.close();
		bw.close();
		pw.close();

	}
}
