package 文件传输基础;

import java.io.UnsupportedEncodingException;

public class EncodeDemo {

	public static void main(String[] args) throws UnsupportedEncodingException {
		System.out.println(Integer.toBinaryString(0xff));

		String s = "慕课ABC";
		/*
		 * gbk编码中文占2个字节，英文占一个字节
		 */
		byte[] bytes1 = s.getBytes("gbk");
		// byte[] bytes1 = s.getBytes();//转换成字节序列用的是项目默认的编码gbk;
		for (byte b : bytes1) {
			// 将字节转换成16进制 （编码）
			System.out.print(Integer.toHexString(b & 0xff) + " ");
		}

		System.out.println();
		/*
		 * utf编码中文占3个字节，英文占一个字节
		 */
		byte[] bytes2 = s.getBytes("utf-8");
		for (byte b : bytes2) {
			// 将字节转换成16进制 （编码）
			System.out.print(Integer.toHexString(b & 0xff) + " ");
		}

		System.out.println();
		/*
		 * java是双字节编码 utf-16be,中文和英文都是占2个字节
		 */
		byte[] bytes3 = s.getBytes("utf-16be");
		for (byte b : bytes3) {
			// 将字节转换成16进制 （编码）
			System.out.print(Integer.toHexString(b & 0xff) + " ");
		}

		System.out.println();
		/*
		 * 当字节序列是某种编码时，把字节转成字符串也需要用这种编码方式，否则会出现乱码
		 */
		String str1 = new String(bytes2);
		System.out.println(str1);
		String str2 = new String(bytes2, "utf-8");
		System.out.println(str2);

		/*
		 * 文本文件 就是字节序列 可以是任意编码的字节序列
		 * 
		 * 如果我们在中文机器上直接创建文本文件，那么该文件只识别ansi编码
		 * 
		 * 联通、联这是一种巧合，正好符合了utf-8的编码规则，所以创建成了utf-8编码，文件识别不了
		 */

	}
}
