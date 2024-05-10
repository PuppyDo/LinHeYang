public class Work19{
	public static void main(String[] args) {
		
		//Y t1 = new Y();
		//	t1.y2();
		
		Y t2 =new Y();
		t2.y3();
	}
}

class Y{
	String name = "jack";
	int num = 100;
	/*访问构造器语法：this（参数列表）；
	 * 注意只能在构造器中使用（即只能在构造器中访问另一个构造器）
	 */
	
	public Y() {
		//如果要访问构造器this("tom ", 100)参照列表必须放在最前面
		this("tom ", 100);
		System.out.println("Y() 构造器");
		
	}
	
	public Y(String name, int age) {
		System.out.println("T(String name. int age) 构造器");
		
	}
	public void y3() {
		//传统方法 弊端就近找属性 例：同一构造器里 结果可能会与预想不同
		String name = "Tom";
		System.out.println("name = " + name + "  num = " + num);
		//this访问属性 准确定位制定
		System.out.println("name = " + this.name + "  num = " + this.num);
	}
	
	public void y1() {
		System.out.println("f1()方法..");
	}
	
	public void y2() {
		System.out.println("f2()方法..");
		
		//调用本类的f1
		//第一种方式
		y1();
		//第二种
		this.y1();
		
	}
}