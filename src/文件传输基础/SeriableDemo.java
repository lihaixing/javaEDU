package 文件传输基础;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//一个类实现了序列化接口，那么子类也就实现了序列化
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
	 * 对子类对象进行反序列化操作时，如果其父类没有实现序列化接口，那么其父类的构造函数会被调用
	 * */

	public static void main(String[] args) throws Exception {
		// TODO 自动生成的方法存根
		SeriableDemo sd = new SeriableDemo();
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("G:/java_study/code/文件传输基础目录/新建文本文档.txt"));
		Foo2 f2 = new Foo2();
		oos.writeObject(f2);
		oos.flush();
		oos.close();

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("G:/java_study/code/文件传输基础目录/新建文本文档.txt"));
		Foo2 f3 = (Foo2) ois.readObject();
		System.out.println(f3);
		ois.close();
	}
}
