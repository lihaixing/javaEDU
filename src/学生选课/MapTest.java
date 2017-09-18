package 学生选课;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapTest {

	/* 学生类型对象 */
	public Map<String, Student> students;

	public MapTest() {
		this.students = new HashMap<String, Student>();
	}

	public void testPut() {
		Scanner console = new Scanner(System.in);
		int i = 0;
		while (i < 3) {
			System.out.println("请输入学生ID:");
			String ID = console.next();

			// 获取方法是一样的只不过，传的是key值
			Student st = students.get(ID);
			if (st == null) {
				System.out.println("请输入学生姓名：");
				String name = console.next();
				Student newStudent = new Student(ID, name);
				students.put(ID, newStudent);
				System.out.println("成功添加学生：" + students.get(ID).name);
				i++;
			} else {
				System.out.println("该学生ID已经被占用！");
				continue;
			}

		}
	}

	// keySet方法
	public void testKeySet() {
		System.out.println("共有" + students.size() + "个学生！");
		// 返回所有键的set集合
		Set<String> keySet = students.keySet();
		// 遍历
		for (String stuId : keySet) {
			Student st = students.get(stuId);
			if (st != null) {
				System.out.println("学生：" + st.name);
			}
		}
	}

	public void testRemove() {
		System.out.println("要删除的集合的长度为：" + students.size());
		Scanner console = new Scanner(System.in);
		while (true) {
			System.out.println("请输入要移除元素的ID:");
			String ID = console.next();
			Student st = students.get(ID);
			if (st == null) {
				System.out.println("不存在这样的ID");
				continue;
			} else {
				students.remove(ID);
				System.out.println("删除元素成功！");
				break;
			}
		}
	}

	/* 通过entrySet遍历,键值对 */
	public void testEntrySet() {
		Set<Entry<String, Student>> entrySet = students.entrySet();
		for (Entry<String, Student> entry : entrySet) {
			System.out.println("取得键：" + entry.getKey());
			System.out.println("对应的值：" + entry.getValue().name);
		}
	}

	public void testModify() {
		System.out.println("请输入要修改的学生ID：");
		Scanner console = new Scanner(System.in);
		while(true){
			String stuId = console.next();
			Student student = students.get(stuId);
			if (student == null) {
				System.out.println("该ID不存在，请重新输入！");
				continue;
			} else {
				System.out.println("当前学生姓名为：" + student.name);
				System.out.println("请输入新的学生姓名：");
				String name = console.next();
				Student newStudent = new Student(stuId, name);
				students.put(stuId, newStudent);
				System.out.println("学生姓名修改成功！");
				break;
			}

		}
	}

	/*
	 * 测试Map中，是否包含某个key值或者某个Value值
	 */
	public void testContainsKeyOrValue() {
		System.out.println("请输入要查询的学生ID：");
		Scanner console = new Scanner(System.in);
		String id = console.next();
		System.out.println("您输入的学生ID为：" + id + ",在学生映射表中是否存在：" + students.containsKey(id));
		if (students.containsKey(id)) {
			System.out.println("对应的学生为：" + students.get(id).name);
			// 判断是否包含value值
			System.out.println("请输入要查询的姓名：");
			String name=console.next();
			System.out.println("是否包含姓名：" + name + "," + students.containsValue(new Student("3", name)));

		}
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		MapTest mt = new MapTest();
		mt.testPut();
		mt.testKeySet();
		// mt.testRemove();
		// mt.testEntrySet();
		// mt.testModify();
		// mt.testEntrySet();
		mt.testContainsKeyOrValue();
	}

}
