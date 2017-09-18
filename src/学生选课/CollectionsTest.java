package ѧ��ѡ��;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CollectionsTest {
	public void testSort1() {
		List<Integer> integerList = new ArrayList<Integer>();
		// �������10�� 100���ڲ��ظ������
		Random random = new Random();
		Integer k;
		for (int i = 0; i < 10; i++) {
			do {
				k = random.nextInt(100);
			} while (integerList.contains(k));
			integerList.add(k);
			System.out.println("�¹����������" + k);
		}
		// ����
		System.out.println("............����ǰ............");
		for (Integer integer : integerList) {
			System.out.println("Ԫ�أ�" + integer);
		}
		Collections.sort(integerList);
		System.out.println("............�����............");
		for (Integer integer : integerList) {
			System.out.println("Ԫ�أ�" + integer);
		}
	}

	public void testSort2() {
		List<String> stringList = new ArrayList<String>();
		Scanner console = new Scanner(System.in);
		String str;
		for (int i = 0; i < 3; i++) {
			do {
				System.out.println("������Ҫ��ӵ��ַ�����");
				str = console.next();
			} while (stringList.contains(str));
			stringList.add(str);
			System.out.println("�ɹ�����ַ�����" + str);
		}

		// ����
		System.out.println("............����ǰ............");
		for (String string : stringList) {
			System.out.println("Ԫ�أ�" + string);
		}
		Collections.sort(stringList);
		System.out.println("............�����............");
		for (String string : stringList) {
			System.out.println("Ԫ�أ�" + string);
		}
	}

	public void testSort3() {
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("1", "Ralf"));
		studentList.add(new Student("3", "John"));
		studentList.add(new Student("2", "Tom"));
		studentList.add(new Student("11", "Andy"));
		System.out.println("...............����ǰ������������������������");
		for (Student student : studentList) {
			System.out.println("ѧ����" + student.id + ":" + student.name);
		}
		Collections.sort(studentList);
		System.out.println("...............����󡷡���������������������");
		for (Student student : studentList) {
			System.out.println("ѧ����" + student.id + ":" + student.name);
		}

		Collections.sort(studentList, new StudentComparator());
		System.out.println("...............������������󡷡���������������������");
		for (Student student : studentList) {
			System.out.println("ѧ����" + student.id + ":" + student.name);
		}
	}

	public static void main(String[] args) {
		CollectionsTest ct = new CollectionsTest();
		// ct.testSort1();
		// ct.testSort2();
		ct.testSort3();
	}
}
