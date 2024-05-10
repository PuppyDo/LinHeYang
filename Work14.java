public class Work14{
	public static void main(String[] args) {
		
		
		int[] arr = {1,2,3};
		W t1 = new W();
		t1.f1(arr);
	}
}

class W{
	public void f1(int... nums) {
		System.out.println("长度 = " + nums.length);
	}
	
	//细节：可变参数可以和普通类型的参数一起放在形参列表，但必须保证可变参数在后面
	public void f2(String str, double... nums) {	
	}
	
	//细节：一个列表里只能出现一个可变参数 下面的写法是错的
	//public void f3(double... nums , int... nums) {	
	//}
}