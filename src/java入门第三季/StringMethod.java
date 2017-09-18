package java入门第三季;

import java.util.Arrays;

public class StringMethod {

	public static void main(String[] args) {

		String str = " 学习 jaVa 编程编";
		// 字符串长度
		System.out.println("字符串长度：" + str.length());
		// 查找“编”的位置 (第一出现的位置),找不到就会返回-1
		System.out.println("'编'的位置：" + str.indexOf("编"));
		// 查找“编”的位置 (最后一次出现的位置),找不到就会返回-1
		System.out.println("'编'的位置：" + str.lastIndexOf("编"));
		// 按空格把字符串拆成一个数组
		String strArr[] = str.split(" ");
		System.out.println("按空格拆分成数组：" + Arrays.toString(strArr));
		// 获取索引[3,7)的字符串
		System.out.println("[3,7)的字符串：" + str.substring(3, 7));
		System.out.println("[3,+)的字符串：" + str.substring(3));
		// 去掉前后空格
		String strNoNull = str.trim();
		System.out.println("无空格的字符串：" + strNoNull);
		// 字符串大小写
		System.out.println("大写的的字符串：" + str.toUpperCase());
		System.out.println("小写的的字符串：" + str.toLowerCase());
		// 获取字符串指定位置的字符
		System.out.println("index为1的字符：" + str.charAt(1));
		System.out.println(str.equals(str));

		byte[] byteStr = str.getBytes();
		for (int i = 0; i < byteStr.length; i++) {
			System.out.println(byteStr[i]);
		}

		// Java文件名
		String fileName = "HelloWorld.java";
		int index = fileName.lastIndexOf(".");
		// 获取文件的后缀
		String prefix = fileName.substring(index + 1);
		// 判断必须包含"."号，且不能出现在首位，同时后缀名为"java"
		System.out.println(prefix.equals("java"));// 注意这里不要用“==”
		if (index > 0 && prefix == "java") {
			System.out.println("Java文件名正确");
		} else {
			System.out.println("Java文件名无效");
		}

		// a出现的次数
		String s = "aljlkdsflkjsadjfklhasdkjlflkajdflwoiudsafhaasdasd";

		// 出现次数
		int num = 0;

		// 循环遍历每个字符，判断是否是字符 a ，如果是，累加次数
		for (int i = 0; i < s.length(); i++) {
			// 获取每个字符，判断是否是字符a
			if ((s.charAt(i)) == 'a') {
				// 累加统计次数
				num++;
			}
		}
		System.out.println("字符a出现的次数：" + num);



	}

}
