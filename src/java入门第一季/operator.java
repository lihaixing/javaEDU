package java���ŵ�һ��;

public class operator {
	public static void main(String[] args){
		int age1=24;
		int age2=18;
		int age3=36;
		int age4=27;
		int sum=age1+age2+age3+age4;
		int avg=sum/4;
		int minus=age2-age1;
	
	    System.out.println("�����ܺͣ�"+sum);
    	System.out.println("ƽ�����䣺"+avg);
		System.out.println("�����ֵ��"+minus);
			int newAge=--age1;
		System.out.println("�Լ�������䣺"+newAge);
		
		//���    ֻ��һ��Ϊ��ʱ ���������
		System.out.println(true^false);
		System.out.println(true^true);
		System.out.println(false^false);
		
		//��Ԫ�����
		int score=68;
		String mark =score>60?"����":"������";
		System.out.println("���Գɼ���Σ�"+mark);
		
		//��������ȼ�
		int m = 5;
		int n = 7;
		int x=m*8/(n+2)%m;
		System.out.println("m:" + m);
		System.out.println("n:" + n);
		System.out.println("x:" + x);
	}
}
