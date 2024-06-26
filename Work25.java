public class Work25{
	public static void main(String[] args) {
		Circle circle = new Circle(3);
		System.out.println("面积 = " + circle.area());
		System.out.println("周长 = " + circle.len());
	}
}

/*定义一个circle 定义属性；半径， 提供显示圆周长功能的方法， 提示显示圆面积的方法
 */
class Circle{
	double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double area() {
		return Math.PI * radius * radius;//面积
	}
	public double len() {
		return 2 * Math.PI * radius;//周长
	}
}
