package 学生选课;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

	// @Override 暂时比较规则
	public int compare(Student o1, Student o2) {
		// TODO 自动生成的方法存根
		return o1.name.compareTo(o2.name);
	}

}
