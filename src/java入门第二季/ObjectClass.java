package java���ŵڶ���;

public class ObjectClass {
	int age = 29;
	String name = "haixing";

	@Override // ��дObject�е�toString������ ͨ������˵���Դ��->����toString()�Զ�����
	public String toString() {
		return "ObjectClass [age=" + age + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		// ��ʾ���õ�ַ���
		if (this == obj)
			return true;
		// ����һ�������ǿ�ֵ��ֱ��false
		if (obj == null)
			return false;
		// ��ȡ��������������Ķ���һ����������ע���Ƕ���Ĵ�����Ϣ������Ķ����ע��������
		// �൱�ڶԱ��������������
		if (getClass() != obj.getClass())
			return false;
		ObjectClass other = (ObjectClass) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public static void main(String[] args) {
		ObjectClass oc = new ObjectClass();
		System.out.println(oc);// �Զ�����Object�е�toString(),�������ĵ�ַ
		ObjectClass oc2= new ObjectClass(); 
		// �ж����������Ƿ���ͬ��ʵ���ж�������������õ�ַ�Ƿ���ͬ ��Ҳ������==���ж�
		System.out.println(oc.equals(oc2));// false ����д���Ϊtrue

	}

}
