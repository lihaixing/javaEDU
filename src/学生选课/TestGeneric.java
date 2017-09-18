package ѧ��ѡ��;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric {

	// ����list
	public List<Course> courses;

	public TestGeneric() {
		this.courses = new ArrayList<Course>();
	}

	public void testAdd(){
		Course cr1 = new Course("1", "��ѧ����");
		courses.add(cr1);
		// courses.add("�ܷ����һЩ��ֵĶ�����");

		Course cr2 = new Course("2", "java����");
		courses.add(cr2);
	}

	public void testForEach() {
		// ����Ҫ����ת����ֱ�Ӿ��Ƕ���
		for (Course cr : courses) {
			System.out.println(cr.id + ":" + cr.name);
		}
	}

	/*
	 * ���ͽ�Ͽ�����ӷ��͵������͵Ķ���ʵ��
	 */
	public void testChild() {
		ChildCourse ccr = new ChildCourse();
		ccr.id = "3";
		ccr.name = "��������Ŀγ̶���";
		courses.add(ccr);
	}

	/*
	 * ���Ͳ�������������ͣ�Ҫ���þ��������ǵİ�װ��
	 */
	public void testBasicType() {
		// List<int> list =new ArrayList<int>();
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		System.out.println("�������Ͱ�װ�ࣺ" + list.get(0));
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		TestGeneric tg = new TestGeneric();
		tg.testAdd();
		tg.testChild();
		tg.testForEach();
		tg.testBasicType();
	}

}
