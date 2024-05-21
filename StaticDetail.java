public class StaticDetail{
	public static void main(String[] args) {
		//静态方法的使用练习
		//创建两个学生交学费
		Stu tom = new Stu("tom");
		tom.payFee(100);
		Stu mary = new Stu("mary");
		mary.payFee(200);
		
		//输出当前收集到的学费
		Stu.showFee();
		
	}
}

class Stu{
	private String name;
	
	//定义一个静态 来累积学生的学费
	private static double fee = 0;
	
	public Stu(String name) {
		this.name = name;
	}
	
	//当方法使用static修饰后 此方法就变为静态方法 
	//静态方法可以使用静态属性
	public static void payFee(double fee) {
		Stu.fee += fee;//累积到fee	
	}
	
	public static void showFee() {
		System.out.println("总学费有：" + Stu.fee);
	}
}