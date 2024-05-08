public class Work04{
	public static void main(String[] args) {
		
		A a = new A();
		//a.sayOk();
		a.m1();
		
	
	}
}

class A{
	
	public void print(int n) {
		System.out.println("print()方法被调用 n = " + n);
	}
	public void sayOk() {
		print(10);
		System.out.println("继续执行sayOk()~~~");
	}
	
	public void m1(){
		System.out.println("m1的方法被执行了");
		B b = new B();
		b.hi();
		
		System.out.println("m1的方法被继续执行了");

	}
}

class B{
	
	public void hi() {
		System.out.println("B类中的hi()被执行");
	}
}