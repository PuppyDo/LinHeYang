public class HomeWork12{
	public static void main(String[] args) {
		
		String str = "123";
		//错误例子：String str = "hello";
		
		//转成int
		int n1 = Integer.parseInt(str);
		System.out.println(n1);
		
		//在将String类型转成基本数据类型时我们可以吧“123”转成一个整数
		//但不可以把英文如”hello“转成一个整数
		//其会导致运行异常报错
	}
}
