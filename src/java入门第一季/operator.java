package java入门第一季;

public class operator {
	public static void main(String[] args){
		int age1=24;
		int age2=18;
		int age3=36;
		int age4=27;
		int sum=age1+age2+age3+age4;
		int avg=sum/4;
		int minus=age2-age1;
	
	    System.out.println("年龄总和："+sum);
    	System.out.println("平均年龄："+avg);
		System.out.println("年龄差值："+minus);
			int newAge=--age1;
		System.out.println("自减后的年龄："+newAge);
		
		//亦或    只有一个为真时 结果才是真
		System.out.println(true^false);
		System.out.println(true^true);
		System.out.println(false^false);
		
		//三元运算符
		int score=68;
		String mark =score>60?"及格":"不及格";
		System.out.println("考试成绩如何："+mark);
		
		//运算符优先级
		int m = 5;
		int n = 7;
		int x=m*8/(n+2)%m;
		System.out.println("m:" + m);
		System.out.println("n:" + n);
		System.out.println("x:" + x);
	}
}
