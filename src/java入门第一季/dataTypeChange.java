package java入门第一季;

public class dataTypeChange {
	public static void main(String[] args){
		int a=15;
		float b=a;
		System.out.println(b); //15.0
		
//		不兼容
		int c=15;
		char sex='男';
		int d=c+sex;
//		char e=c+index; //报错
		System.out.println(d);
		
		double f=14.01;
//		float g=f; //单精度放不下双精度   报错
		
		//强制类型转换
		int ii=(int)f;
		System.out.println(ii);
	}
}
