package 学生选课;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric {

	// 泛型list
	public List<Course> courses;

	public TestGeneric() {
		this.courses = new ArrayList<Course>();
	}

	public void testAdd(){
		Course cr1 = new Course("1", "大学语文");
		courses.add(cr1);
		// courses.add("能否添加一些奇怪的东西呢");

		Course cr2 = new Course("2", "java基础");
		courses.add(cr2);
	}

	public void testForEach() {
		// 不需要类型转换，直接就是对象
		for (Course cr : courses) {
			System.out.println(cr.id + ":" + cr.name);
		}
	}

	/*
	 * 泛型结合可以添加泛型的子类型的对象实例
	 */
	public void testChild() {
		ChildCourse ccr = new ChildCourse();
		ccr.id = "3";
		ccr.name = "我是子类的课程对象";
		courses.add(ccr);
	}

	/*
	 * 泛型不能添加引用类型，要引用就引用他们的包装类
	 */
	public void testBasicType() {
		// List<int> list =new ArrayList<int>();
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		System.out.println("基本类型包装类：" + list.get(0));
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		TestGeneric tg = new TestGeneric();
		tg.testAdd();
		tg.testChild();
		tg.testForEach();
		tg.testBasicType();
	}

}
