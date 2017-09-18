package ѧ��ѡ��;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapTest {

	/* ѧ�����Ͷ��� */
	public Map<String, Student> students;

	public MapTest() {
		this.students = new HashMap<String, Student>();
	}

	public void testPut() {
		Scanner console = new Scanner(System.in);
		int i = 0;
		while (i < 3) {
			System.out.println("������ѧ��ID:");
			String ID = console.next();

			// ��ȡ������һ����ֻ������������keyֵ
			Student st = students.get(ID);
			if (st == null) {
				System.out.println("������ѧ��������");
				String name = console.next();
				Student newStudent = new Student(ID, name);
				students.put(ID, newStudent);
				System.out.println("�ɹ����ѧ����" + students.get(ID).name);
				i++;
			} else {
				System.out.println("��ѧ��ID�Ѿ���ռ�ã�");
				continue;
			}

		}
	}

	// keySet����
	public void testKeySet() {
		System.out.println("����" + students.size() + "��ѧ����");
		// �������м���set����
		Set<String> keySet = students.keySet();
		// ����
		for (String stuId : keySet) {
			Student st = students.get(stuId);
			if (st != null) {
				System.out.println("ѧ����" + st.name);
			}
		}
	}

	public void testRemove() {
		System.out.println("Ҫɾ���ļ��ϵĳ���Ϊ��" + students.size());
		Scanner console = new Scanner(System.in);
		while (true) {
			System.out.println("������Ҫ�Ƴ�Ԫ�ص�ID:");
			String ID = console.next();
			Student st = students.get(ID);
			if (st == null) {
				System.out.println("������������ID");
				continue;
			} else {
				students.remove(ID);
				System.out.println("ɾ��Ԫ�سɹ���");
				break;
			}
		}
	}

	/* ͨ��entrySet����,��ֵ�� */
	public void testEntrySet() {
		Set<Entry<String, Student>> entrySet = students.entrySet();
		for (Entry<String, Student> entry : entrySet) {
			System.out.println("ȡ�ü���" + entry.getKey());
			System.out.println("��Ӧ��ֵ��" + entry.getValue().name);
		}
	}

	public void testModify() {
		System.out.println("������Ҫ�޸ĵ�ѧ��ID��");
		Scanner console = new Scanner(System.in);
		while(true){
			String stuId = console.next();
			Student student = students.get(stuId);
			if (student == null) {
				System.out.println("��ID�����ڣ����������룡");
				continue;
			} else {
				System.out.println("��ǰѧ������Ϊ��" + student.name);
				System.out.println("�������µ�ѧ��������");
				String name = console.next();
				Student newStudent = new Student(stuId, name);
				students.put(stuId, newStudent);
				System.out.println("ѧ�������޸ĳɹ���");
				break;
			}

		}
	}

	/*
	 * ����Map�У��Ƿ����ĳ��keyֵ����ĳ��Valueֵ
	 */
	public void testContainsKeyOrValue() {
		System.out.println("������Ҫ��ѯ��ѧ��ID��");
		Scanner console = new Scanner(System.in);
		String id = console.next();
		System.out.println("�������ѧ��IDΪ��" + id + ",��ѧ��ӳ������Ƿ���ڣ�" + students.containsKey(id));
		if (students.containsKey(id)) {
			System.out.println("��Ӧ��ѧ��Ϊ��" + students.get(id).name);
			// �ж��Ƿ����valueֵ
			System.out.println("������Ҫ��ѯ��������");
			String name=console.next();
			System.out.println("�Ƿ����������" + name + "," + students.containsValue(new Student("3", name)));

		}
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
