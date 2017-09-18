package java入门第一季;

public class conditional {
	public static void main(String[] args) {
		// if语句
		int one = 20;
		if (one % 2 == 0) {
			System.out.println("one是偶数");
		}

		// if else语句
		int age1 = 25;
		if (age1 >= 18) {
			System.out.println("成年");
		} else {
			System.out.println("未成年");
		}

		// 多重if else语句
		int age2 = 25;
		if (age2 > 60) {
			System.out.println("老年");
		} else if (age2 > 40) {
			System.out.println("中年");
		} else if (age2 > 18) {
			System.out.println("少年");
		} else {
			System.out.println("童年");
		}

		// 嵌套if语句
		int score = 94;
		String sex = "女";
		if (score > 80) {
			if (sex.equals("男")) {
				System.out.println("进入男子组决赛");
			} else {
				System.out.println("进入女子组决赛");
			}
		} else {
			System.out.println("没有进入决赛");
		}

		// switch语句 注意'日'不等于"日"
		char today = '日';

		switch (today) {
		case '一':
		case '三':
		case '五':
			System.out.println("吃包子");
			break;
		case '二':
		case '四':
		case '六':
			System.out.println("吃油条");
			break;
		default:
			System.out.println("吃主席套餐");
		}
	}
}
