package java入门第二季;

public class ObjectClass {
	int age = 29;
	String name = "haixing";

	@Override // 重写Object中的toString方法， 通过点击菜单中源码->生成toString()自动生成
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
		// 表示引用地址相等
		if (this == obj)
			return true;
		// 若有一个对象是空值，直接false
		if (obj == null)
			return false;
		// 获取类对象，类对象与类的对象不一样，类对象关注的是对象的代码信息，而类的对象关注的是数据
		// 相当于对比两个对象的类型
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
		System.out.println(oc);// 自动调用Object中的toString(),输出对象的地址
		ObjectClass oc2= new ObjectClass(); 
		// 判断两个对象是否相同其实是判断两个对象的引用地址是否相同 ，也可以用==来判断
		System.out.println(oc.equals(oc2));// false ，重写后变为true

	}

}
