public class HomeWork11{
	public static void main (String[] args) {
		
		//基本数据类型转String
		
		int n1 = 100;
		float f1 = 1.1F;
		double d1 = 4.5;
		boolean b1 = true;
		String s1 = n1 + "";
		String s2 = f1 + "";
		String s3 = d1 + "";
		String s4 = b1 + "";
		System.out.println(s1 + " " + s2 + " " + s3 + " " + s4 );
		
		//String --> 对应的基本类型
		String s5 = "123";
		//解读： 使用基本数据对应的包装类，的相应方法，得到基本数据类
		int num1 = Integer.parseInt(s5);
		double num2 = Double.parseDouble(s5);
		float num3 = Float.parseFloat(s5);
		long num4 = Long.parseLong(s5);
		byte num5 = Byte.parseByte(s5);
		boolean b = Boolean.parseBoolean("true");
		short num6 = Short.parseShort(s5);
		
		System.out.println("=====================");
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		System.out.println(b);
		
		//怎么把char转成字符 --->含义是指 获取字符串的第一个字符
		//解读：s5.charAt(0) 是代表得到s5字符的第一个字符‘1’
		System.out.println(s2.charAt(0));
		
	}
}