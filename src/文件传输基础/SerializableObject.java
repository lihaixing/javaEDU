package 文件传输基础;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableObject {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO 自动生成的方法存根
		String file = "G:/java_study/code/文件传输基础目录/新建文本文档.txt";
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
		SerializableStu sa = new SerializableStu("10001", "张三", 20);
		// 对象的序列化：转化为字节，这样可以在网络中传输
		oos.writeObject(sa);
		oos.flush();
		oos.close();

		// 反序列化
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
		SerializableStu stu = (SerializableStu) ois.readObject();
		System.out.println(stu);
		ois.close();
	}

}
