public class Test03{
	public static void main(String[] args) {
		  
		int a = 10;
		int b = 99;
		
		//解读	1.a>b 为假
		//   	2.a>b  为false
		//		3.返回b--，先返回 b的值，然后再b-1
		//		4.返回的结果为99
		/**		int result = a>b ? a++ : b--;	
				System.out.println("result= " + result);
				System.out.println("a=" + a);
				System.out.println("b=" + b);
		*/
		int result = a<b ? a++ : b--;
				System.out.println("result= " + result);
				System.out.println("a=" + a);
				System.out.println("b=" + b);
	}
}