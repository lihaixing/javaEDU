package 学生选课;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest {
	// 用于存放备选课程的List
	public List coursesToSelect;

	public ListTest() {
		this.coursesToSelect = new ArrayList();
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
		Course temp2 = (Course) coursesToSelect.get(0);
		System.out.println(temp2.id + ":" + temp2.name);

		Course cr3 = new Course("3", "高数");
		// 注意，不能跨越插入，只能在0和1插入
		coursesToSelect.add(2, cr3);
		Course temp3 = (Course) coursesToSelect.get(2);
		System.out.println(temp3.id + ":" + temp3.name);

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
	 * 取得List中的元素
	 */
	public void testGet() {
		int size = coursesToSelect.size();
		for (int i = 0; i < size; i++) {
			Course cr = (Course) coursesToSelect.get(i);
			System.out.println("课程：" + cr.id + ":" + cr.name);
		}
	}

	/*
	 * 通过迭代器遍历元素
	 */
	public void testIterator(){
		Iterator it = coursesToSelect.iterator();
		while(it.hasNext()){
			Course cr=(Course)it.next();
			System.out.println("迭代器遍历：" + cr.id + ":" + cr.name);
		}
	}

	/*
	 * forEach方法遍历
	 */
	public void testForEach() {
		for (Object obj : coursesToSelect) {
			Course cr = (Course) obj;
			System.out.println("forEach方法遍历：" + cr.id + ":" + cr.name);
		}
	}

	/*
	 * 修改List中的元素
	 */
	public void testModify() {
		coursesToSelect.set(4, new Course("7", "语文"));
		System.out.println("修改后的值为：" + ((Course) coursesToSelect.get(4)).name);
	}

	/*
	 * 删除List中的元素
	 */

	public void testRemove() {
		// Course cr = (Course) coursesToSelect.get(4);
		// coursesToSelect.remove(cr);
		coursesToSelect.remove(4); // 和上面方法目的一样，更简单
		System.out.println("********删除index为4的元素后：******");
		testForEach();
		System.out.println("删除后4位置的值为：" + ((Course) coursesToSelect.get(4)).name);
		// removeAll
		Course[] courses = { (Course) coursesToSelect.get(0), (Course) coursesToSelect.get(1) };
		coursesToSelect.removeAll(Arrays.asList(courses));
		System.out.println("********使用removeAll掉前两个元素后：******");
		testForEach();
	}

	/*
	 * 测试list的contains方法
	 */
	public void testListContains() {
		Course course = (Course) coursesToSelect.get(0);
		System.out.println("取得课程：" + course.name);
		System.out.println("备选课程中是否包含课程:" + course.name + "," + coursesToSelect.contains(course));
		// 判断索引位置
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
