package �ļ��������;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableObject {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO �Զ����ɵķ������
		String file = "G:/java_study/code/�ļ��������Ŀ¼/�½��ı��ĵ�.txt";
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
		SerializableStu sa = new SerializableStu("10001", "����", 20);
		// ��������л���ת��Ϊ�ֽڣ����������������д���
		oos.writeObject(sa);
		oos.flush();
		oos.close();

		// �����л�
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
		SerializableStu stu = (SerializableStu) ois.readObject();
		System.out.println(stu);
		ois.close();
	}

}
