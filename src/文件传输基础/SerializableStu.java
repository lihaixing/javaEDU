package �ļ��������;

import java.io.Serializable;

public class SerializableStu implements Serializable {
	private String stuno;
	// transient���κ󣬸�Ԫ�ز������jvmĬ�ϵ����л������ḳֵ����null
	// ��Ҳ�����Լ�������л�
	private transient String stuname;
	private int stuage;

	public SerializableStu() {

	}

	public SerializableStu(String stuno, String stuname, int stuage) {
		super();
		this.stuno = stuno;
		this.stuname = stuname;
		this.stuage = stuage;
	}

	public String getStuno() {
		return stuno;
	}

	public void setStuno(String stuno) {
		this.stuno = stuno;
	}

	public String getStuname() {
		return stuname;
	}

	public void setStuname(String stuname) {
		this.stuname = stuname;
	}

	public int getStuage() {
		return stuage;
	}

	public void setStuage(int stuage) {
		this.stuage = stuage;
	}

	// @Override
	public String toString() {
		return "Serializable [stuno=" + stuno + ", stuname=" + stuname + ", stuage=" + stuage + "]";
	}


}
