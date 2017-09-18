package ѧ��ѡ��;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SetTest {
	public List<Course> coursesToSelect;

	public SetTest() {
		coursesToSelect = new ArrayList<Course>();
	}

	// ������courseTOSelect����ӱ�ѡ�γ�
	public void testAdd() {
		// ����һ���γ̶��󣬲�ͨ��add��������ӵ���ѡ�γ�List��
		Course cr1 = new Course("1", "���ݽṹ");
		coursesToSelect.add(cr1);

		// ������뼯�϶����Object�࣬ȡ��ʱ��Ҫ����ת��
		Course temp = (Course) coursesToSelect.get(0);
		System.out.println(temp.id + ":" + temp.name);

		Course cr2 = new Course("2", "C����");
		// ��0��λ�������cr2
		coursesToSelect.add(0, cr2);

		Course cr3 = new Course("3", "����");
		// ע�⣬���ܿ�Խ���룬ֻ����0��1����
		coursesToSelect.add(2, cr3);

		// addAll
		Course[] course = { new Course("3", "����"), new Course("4", "����") };
		coursesToSelect.addAll(Arrays.asList(course));
		Course temp4 = (Course) coursesToSelect.get(4);
		System.out.println(temp4.id + ":" + temp4.name);

		Course[] course2 = { new Course("5", "����"), new Course("6", "��ѧ") };
		coursesToSelect.addAll(1, Arrays.asList(course2));
		Course temp5 = (Course) coursesToSelect.get(1);
		System.out.println(temp5.id + ":" + temp5.name);
	}

	/*
	 * forEach��������
	 */
	public void testForEach() {
		for (Course obj : coursesToSelect) {
			System.out.println("forEach����������" + obj.id + ":" + obj.name);
		}
	}

	/*
	 * ����list��contains����
	 */
	public void testListContains() {
		Course course = coursesToSelect.get(6);
		// ��Ȼid ��name��ͬ����������������һ������
		Course course2 = new Course(course.id, course.name);
		System.out.println("ȡ�ÿγ̣�" + course.name);
		System.out.println("��ѡ�γ����Ƿ�����γ�:" + course.name + "," + coursesToSelect.contains(course));
		System.out.println("��ѡ�γ����Ƿ�����γ�course2:" + coursesToSelect.contains(course2));
		// �ж�����λ�� �������ظ�Ԫ�أ�ֻ���ص�һ�γ��ֵ�λ�ã�lastIndexOf()���һ�γ��ֵ�λ��
		if (coursesToSelect.contains(course2)) {
			System.out.println(coursesToSelect.indexOf(course2));
		}
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		SetTest st = new SetTest();
		st.testAdd();
		st.testForEach();

		Student student = new Student("1", "С��");
		System.out.println("��ӭѧ����" + student.name + "ѡ��");

		Scanner console = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("������γ�ID");
			String courseId = console.next();
			for (Course cr : st.coursesToSelect) {
				if (cr.id.equals(courseId)) {
					student.courses.add(cr);
					// ����ظ���Ԫ�أ��������
					student.courses.add(cr);
					// ������ӿն���
					// student.courses.add(null);
				}
			}
		}
		System.out.println(student.courses.size());
		for (Course cr : student.courses) {
			System.out.println("ѡ���˿γ̣�" + cr.id + ":" + cr.name);
		}

		st.testListContains();
	}


}
