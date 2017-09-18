package java入门第三季;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateClass {
	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		System.out.println(d);
		// 创建SimpleDateFormat对象，指定目标格式
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// 调用format()方法，格式化时间，转换成指定格式字符串
		String today = sdf.format(d);
		System.out.println(today);

		// 创建SimpleDateFormat对象，指定目标格式
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");
		String dayx = "2017年08月23日10:30:25";
		// 调用parse()方法，将字符串转换为日期
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
		System.out.println("当前时间：" + year + "-" + month + "-" + day + " " + hour + ":" + minute + ":" + second);
		// 用来获取 Date 对象
		Date date = c.getTime();
		System.out.println(date);
		// 获取此 Calendar 的时间值，以毫秒为单位
		long time = c.getTimeInMillis();
		System.out.println(time);
	}
}

