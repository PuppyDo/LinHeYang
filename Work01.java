public class Work01{
	public static void main(String[] args) {
		 
		Person p1 = new Person();
		p1.speak();
		p1.cal01();
		p1.cal02(5);
		p1.cal02(10);
		//调用getsum 返回的值付给 变量 returnRes
		int returnRes = p1.getSum(40, 20);
		System.out.println("getSum方法找回的值 = " + returnRes);
	}
}
class Person{
	 
	int age;
	String name;
	public void speak() {
		System.out.println("我是一个好人");
	}
	
	public void cal01() {
		
		int res = 0;
		for(int i = 1; i <=1000; i++) {
			res += i;
		}
		System.out.println("1-1000的和 = " + res);
	}
	//(int n)形参列表，形式参照列表可以接受用户输入
	public void cal02(int n) {
		int res = 0;
		for(int i = 1; i <= n; i++) {
			res += i;
		}
		System.out.println("计算结果 = " + res);
	}
	
	//public表示是公开的
	//int表示执行后，返回一个int 值
	//num1 num2表示两个值
	public int getSum(int num1, int num2) {
		int res = num1 + num2;
		return res;
	}
}