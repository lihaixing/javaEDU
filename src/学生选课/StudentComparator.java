package ѧ��ѡ��;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

	// @Override ��ʱ�ȽϹ���
	public int compare(Student o1, Student o2) {
		// TODO �Զ����ɵķ������
		return o1.name.compareTo(o2.name);
	}

}
