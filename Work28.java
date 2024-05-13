public class Work28{
	public static void main(String[] args) {
		Circo c = new Circo();
		PassObject po = new PassObject();
		po.printAreas(c,5);
	}
}  
class Circo{
	double radius;
	
	public Circo() {
		
	}
	public Circo(double radius) {
		this.radius = radius;
	}

	public double findArea() {//返回面积
		return Math.PI * radius * radius;
	}//添加setRadius 修改对象的半径
	public void setRadius(double radius) {
		this.radius = radius;
	}
}

class PassObject{
	public  void printAreas(Circo c, int times) {
		System.out.println("radius\tarea"); 
		for(int i = 1; i <= times; i++) {	//输出1到times之间的每个整数半径值	
			c.setRadius(i);//修改c 对象的半径值
			System.out.println((double)i + "\t" + c.findArea());
			
		}
	}
}