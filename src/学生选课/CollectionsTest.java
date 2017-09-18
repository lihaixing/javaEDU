package 学生选课;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CollectionsTest {
	public void testSort1() {
		List<Integer> integerList = new ArrayList<Integer>();
		// 随机插入10个 100以内不重复随机数
		Random random = new Random();
		Integer k;
		for (int i = 0; i < 10; i++) {
			do {
				k = random.nextInt(100);
			} while (integerList.contains(k));
			integerList.add(k);
			System.out.println("陈宫添加整数：" + k);
		}
		// 排序
		System.out.println("............排序前............");
		for (Integer integer : integerList) {
			System.out.println("元素：" + integer);
		}
		Collections.sort(integerList);
		System.out.println("............排序后............");
		for (Integer integer : integerList) {
			System.out.println("元素：" + integer);
		}
	}

	public void testSort2() {
		List<String> stringList = new ArrayList<String>();
		Scanner console = new Scanner(System.in);
		String str;
		for (int i = 0; i < 3; i++) {
			do {
				System.out.println("请输入要添加的字符串：");
				str = console.next();
			} while (stringList.contains(str));
			stringList.add(str);
			System.out.println("成功添加字符串：" + str);
		}

		// 排序
		System.out.println("............排序前............");
		for (String string : stringList) {
			System.out.println("元素：" + string);
		}
		Collections.sort(stringList);
		System.out.println("............排序后............");
		for (String string : stringList) {
			System.out.println("元素：" + string);
		}
	}

	public void testSort3() {
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("1", "Ralf"));
		studentList.add(new Student("3", "John"));
		studentList.add(new Student("2", "Tom"));
		studentList.add(new Student("11", "Andy"));
		System.out.println("...............排序前》》》》》》》》》》》》");
		for (Student student : studentList) {
			System.out.println("学生：" + student.id + ":" + student.name);
		}
		Collections.sort(studentList);
		System.out.println("...............排序后》》》》》》》》》》》》");
		for (Student student : studentList) {
			System.out.println("学生：" + student.id + ":" + student.name);
		}

		Collections.sort(studentList, new StudentComparator());
		System.out.println("...............按照姓名排序后》》》》》》》》》》》》");
		for (Student student : studentList) {
			System.out.println("学生：" + student.id + ":" + student.name);
		}
	}

	public static void main(String[] args) {
		CollectionsTest ct = new CollectionsTest();
		// ct.testSort1();
		// ct.testSort2();
		ct.testSort3();
	}
}
