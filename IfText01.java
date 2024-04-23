//单分支和双分支的练习

public class IfText01{
	public static void main(String[] args) {
		
		double d1 = 33.5;
		double d2 = 2.6;
		if(d1 > 10.0 && d2 <20.0) {
			System.out.println("两个数的和 = " + (d1 + d2));
		}
		
		//定义两个变量int 判断二者的和
		//是否能被3又被5整除，打印提示信息
		
		int num1 = 10;
		int num2 = 1;
		int sum = num1 + num2;
		if(sum % 3 == 0 && sum % 5 == 0) {
			System.out.println("可以被3又能被5整除");
			}
		else {
			System.out.println("和不能被3和5整除...");
		}
		
		//判断一个年份是否为闰年，判断条件是符合下面二者之一
		//1.年份能被4整除，但不能被100整除  2.能被400整除
		
		int year = 2028;
		if(year % 4 == 0 && year % 100 != 0 || 400 % year == 0) {
			System.out.println(year + "是一个闰年");
		}
		else {
		System.out.println(year + "不是一个闰年....");
		}
	}
}