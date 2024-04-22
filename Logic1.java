public class Logic1{
	public static void main(String[] args) {
		//!操作即是取反，真就是假，假就是真
		System.out.println(60 > 20);//T
		System.out.println(!(60 > 20));//F
		
		//^ :叫做逻辑异或，当a与b结果不同时，则结果为真，相反结果同时为真就为假
		boolean b = (10 > 1) ^(3 < 5);
		System.out.println("b =" + b);
		
	}
}