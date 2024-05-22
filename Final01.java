public class Final01{
	public static void main(String[] args) {
		
		Circle circle = new Circle(5.0);
		System.out.println("面积 = " + circle.calArea());
	}
}

/*final代表不可被继承重载
 * 不可被修改
 */
class Circle{
	private double  radius;
	private final double PI;
	
	//构造器
	public Circle(double radius) {
		this.radius = radius;
		PI = 3.14;
	}
	
	public double calArea() {
		return PI * radius * radius;
	}
}


