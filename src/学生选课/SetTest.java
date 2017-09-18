package 学生选课;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SetTest {
	public List<Course> coursesToSelect;

	public SetTest() {
		coursesToSelect = new ArrayList<Course>();
	}

	// 用于往courseTOSelect中添加备选课程
	public void testAdd() {
		// 创建一个课程对象，并通过add方法，添加到备选课程List中
		Course cr1 = new Course("1", "数据结构");
		coursesToSelect.add(cr1);

		// 对象存入集合都编程Object类，取出时需要类型转换
		Course temp = (Course) coursesToSelect.get(0);
		System.out.println(temp.id + ":" + temp.name);

		Course cr2 = new Course("2", "C语言");
		// 在0的位置添加了cr2
		coursesToSelect.add(0, cr2);

		Course cr3 = new Course("3", "高数");
		// 注意，不能跨越插入，只能在0和1插入
		coursesToSelect.add(2, cr3);

		// addAll
		Course[] course = { new Course("3", "高数"), new Course("4", "物理") };
		coursesToSelect.addAll(Arrays.asList(course));
		Course temp4 = (Course) coursesToSelect.get(4);
		System.out.println(temp4.id + ":" + temp4.name);

		Course[] course2 = { new Course("5", "生物"), new Course("6", "化学") };
		coursesToSelect.addAll(1, Arrays.asList(course2));
		Course temp5 = (Course) coursesToSelect.get(1);
		System.out.println(temp5.id + ":" + temp5.name);
	}

	/*
	 * forEach方法遍历
	 */
	public void testForEach() {
		for (Course obj : coursesToSelect) {
			System.out.println("forEach方法遍历：" + obj.id + ":" + obj.name);
		}
	}

	/*
	 * 测试list的contains方法
	 */
	public void testListContains() {
		Course course = coursesToSelect.get(6);
		// 虽然id 和name相同，但不包含（不是一个对象）
		Course course2 = new Course(course.id, course.name);
		System.out.println("取得课程：" + course.name);
		System.out.println("备选课程中是否包含课程:" + course.name + "," + coursesToSelect.contains(course));
		System.out.println("备选课程中是否包含课程course2:" + coursesToSelect.contains(course2));
		// 判断索引位置 ，若有重复元素，只返回第一次出现的位置，lastIndexOf()最后一次出现的位置
		if (coursesToSelect.contains(course2)) {
			System.out.println(coursesToSelect.indexOf(course2));
		}
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		SetTest st = new SetTest();
		st.testAdd();
		st.testForEach();

		Student student = new Student("1", "小明");
		System.out.println("欢迎学生：" + student.name + "选课");

		Scanner console = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("请输入课程ID");
			String courseId = console.next();
			for (Course cr : st.coursesToSelect) {
				if (cr.id.equals(courseId)) {
					student.courses.add(cr);
					// 添加重复的元素，不会管用
					student.courses.add(cr);
					// 可以添加空对象
					// student.courses.add(null);
				}
			}
		}
		System.out.println(student.courses.size());
		for (Course cr : student.courses) {
			System.out.println("选择了课程：" + cr.id + ":" + cr.name);
		}

		st.testListContains();
	}


}
