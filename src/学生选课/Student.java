package 学生选课;

import java.util.HashSet;
import java.util.Set;

public class Student implements Comparable<Student> {
	public String id;
	public String name;
	public Set<Course> courses;

	public Student(String id, String name) {
		this.id = id;
		this.name = name;
		this.courses = new HashSet<Course>();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	// @Override 默认比较规则
	public int compareTo(Student o) {
		// TODO 自动生成的方法存根

		// 将两个对象的id作为比较结构
		return this.id.compareTo(o.id);
	}
}
