public class Work26{
	public static void main(String[] args) { 
		
		Cale cale = new Cale(2,10);
		System.out.println("和 = " + cale.sum());
		System.out.println("差 = " + cale.minus());
		System.out.println("乘 = " + cale.mul());
		Double divRes = cale.div();
		if(divRes != null) {
			System.out.println("除 = " + divRes);
		}		
	}
}

//创建一个计算类 在其中定义两个变量表示两个操作数
//定义四个方法实现 求 和 差 乘 商

class Cale{
	double num1;
	double num2;
	public Cale(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	//和
	public double sum() {
		return num1 + num2 ;
	}
	//差
	public double minus() {
		return num1 - num2 ;
	}
	//乘
	public double mul() {
		return num1 * num2 ;
	}
	//除
	public Double div() {
		if(num2 == 0) {
			System.out.println("num2 不能为0");
			return null;
		}
		else {
			return num1 / num2 ;
		}
	}
}