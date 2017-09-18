package �ļ��������;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//һ����ʵ�������л��ӿڣ���ô����Ҳ��ʵ�������л�
class Foo implements Serializable {
	public Foo() {
		System.out.println("foo....");
	}
}

class Foo1 extends Foo {
	public Foo1() {
		System.out.println("foo1....");
	}
}

class Foo2 extends Foo1 {

	public Foo2() {
		System.out.println("foo2....");
	}
}

public class SeriableDemo {
	/*
	 * �����������з����л�����ʱ������丸��û��ʵ�����л��ӿڣ���ô�丸��Ĺ��캯���ᱻ����
	 * */

	public static void main(String[] args) throws Exception {
		// TODO �Զ����ɵķ������
		SeriableDemo sd = new SeriableDemo();
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("G:/java_study/code/�ļ��������Ŀ¼/�½��ı��ĵ�.txt"));
		Foo2 f2 = new Foo2();
		oos.writeObject(f2);
		oos.flush();
		oos.close();

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("G:/java_study/code/�ļ��������Ŀ¼/�½��ı��ĵ�.txt"));
		Foo2 f3 = (Foo2) ois.readObject();
		System.out.println(f3);
		ois.close();
	}
}
