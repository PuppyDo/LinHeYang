public class Test02{
	public static void main(String[] args) {
		
		//+= 是  10 + 4 = 14的简写
		int n1 = 10;
		n1 += 4;//n1 = n1 + 4; 
		System .out.println(n1);
		
		n1 /= 3;// 简写：n1 = n1 / 3;//4
		System.out.println(n1);//4
		
		//复合赋值运算符会进行类型转换
		byte b = 3;
		b += 2;//等于自行转换 b = (byte)(b + 2);
	}
	
}