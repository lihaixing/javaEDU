package java���ŵ�һ��;

public class dataTypeChange {
	public static void main(String[] args){
		int a=15;
		float b=a;
		System.out.println(b); //15.0
		
//		������
		int c=15;
		char sex='��';
		int d=c+sex;
//		char e=c+index; //����
		System.out.println(d);
		
		double f=14.01;
//		float g=f; //�����ȷŲ���˫����   ����
		
		//ǿ������ת��
		int ii=(int)f;
		System.out.println(ii);
	}
}
