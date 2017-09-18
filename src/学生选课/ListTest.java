package ѧ��ѡ��;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest {
	// ���ڴ�ű�ѡ�γ̵�List
	public List coursesToSelect;

	public ListTest() {
		this.coursesToSelect = new ArrayList();
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
		Course temp2 = (Course) coursesToSelect.get(0);
		System.out.println(temp2.id + ":" + temp2.name);

		Course cr3 = new Course("3", "����");
		// ע�⣬���ܿ�Խ���룬ֻ����0��1����
		coursesToSelect.add(2, cr3);
		Course temp3 = (Course) coursesToSelect.get(2);
		System.out.println(temp3.id + ":" + temp3.name);

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
	 * ȡ��List�е�Ԫ��
	 */
	public void testGet() {
		int size = coursesToSelect.size();
		for (int i = 0; i < size; i++) {
			Course cr = (Course) coursesToSelect.get(i);
			System.out.println("�γ̣�" + cr.id + ":" + cr.name);
		}
	}

	/*
	 * ͨ������������Ԫ��
	 */
	public void testIterator(){
		Iterator it = coursesToSelect.iterator();
		while(it.hasNext()){
			Course cr=(Course)it.next();
			System.out.println("������������" + cr.id + ":" + cr.name);
		}
	}

	/*
	 * forEach��������
	 */
	public void testForEach() {
		for (Object obj : coursesToSelect) {
			Course cr = (Course) obj;
			System.out.println("forEach����������" + cr.id + ":" + cr.name);
		}
	}

	/*
	 * �޸�List�е�Ԫ��
	 */
	public void testModify() {
		coursesToSelect.set(4, new Course("7", "����"));
		System.out.println("�޸ĺ��ֵΪ��" + ((Course) coursesToSelect.get(4)).name);
	}

	/*
	 * ɾ��List�е�Ԫ��
	 */

	public void testRemove() {
		// Course cr = (Course) coursesToSelect.get(4);
		// coursesToSelect.remove(cr);
		coursesToSelect.remove(4); // �����淽��Ŀ��һ��������
		System.out.println("********ɾ��indexΪ4��Ԫ�غ�******");
		testForEach();
		System.out.println("ɾ����4λ�õ�ֵΪ��" + ((Course) coursesToSelect.get(4)).name);
		// removeAll
		Course[] courses = { (Course) coursesToSelect.get(0), (Course) coursesToSelect.get(1) };
		coursesToSelect.removeAll(Arrays.asList(courses));
		System.out.println("********ʹ��removeAll��ǰ����Ԫ�غ�******");
		testForEach();
	}

	/*
	 * ����list��contains����
	 */
	public void testListContains() {
		Course course = (Course) coursesToSelect.get(0);
		System.out.println("ȡ�ÿγ̣�" + course.name);
		System.out.println("��ѡ�γ����Ƿ�����γ�:" + course.name + "," + coursesToSelect.contains(course));
		// �ж�����λ��
		if (coursesToSelect.contains(course)) {
			System.out.println(coursesToSelect.indexOf(course));
		}
	}

	public static void main(String[] args) {
		ListTest lt = new ListTest();
		lt.testAdd();
		lt.testGet();
		lt.testIterator();
		lt.testForEach();
		lt.testModify();
		lt.testRemove();
		lt.testListContains();
	}
}
