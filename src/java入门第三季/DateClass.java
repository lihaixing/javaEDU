package java���ŵ�����;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateClass {
	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		System.out.println(d);
		// ����SimpleDateFormat����ָ��Ŀ���ʽ
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// ����format()��������ʽ��ʱ�䣬ת����ָ����ʽ�ַ���
		String today = sdf.format(d);
		System.out.println(today);

		// ����SimpleDateFormat����ָ��Ŀ���ʽ
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy��MM��dd��HH:mm:ss");
		String dayx = "2017��08��23��10:30:25";
		// ����parse()���������ַ���ת��Ϊ����
		Date d1 = sdf1.parse(dayx);
		System.out.println(d1);

		// calendar
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int day = c.get(Calendar.DAY_OF_MONTH);
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		System.out.println("��ǰʱ�䣺" + year + "-" + month + "-" + day + " " + hour + ":" + minute + ":" + second);
		// ������ȡ Date ����
		Date date = c.getTime();
		System.out.println(date);
		// ��ȡ�� Calendar ��ʱ��ֵ���Ժ���Ϊ��λ
		long time = c.getTimeInMillis();
		System.out.println(time);
	}
}

