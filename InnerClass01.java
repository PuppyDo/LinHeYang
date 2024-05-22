//内部类快速练习

public class InnerClass01{
	public static void main(String[] args) {//外部其他类
		
	}
}

class Outer{//外部类
	private int n1 = 100;//属性
	public Outer(int n1) {//构造器
		this.n1 = n1;
	}
	private void m1() {//方法
		System.out.println("m1()");
	}
	{//代码块
		System.out.print("代码块...");
	}
	
	class Innner{//内部类,在Outer类的内部
		
	}
}