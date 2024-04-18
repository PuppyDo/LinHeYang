public class HomeWork10{
	public static void main (String[] args) {
		
		//强转符只针对于最近的操作有效，往往会使用小括号进行优先操作
		//例如：int x = （int）10*1.5+6*1.5； //不使用符号运行就会报错
		
		int x = (int)(10*3.5 + 6*1.5);
				System.out.println(x);
				
		char c1 = 100;
		int m = 100;		
		char c3 = (char)m;
		System.out.println(c3);
		//自动提升原则 :表达结果的类型自动提升为 类中操作数最大的
		
	}
}

//				*强制类型转换*
// 自动类型转换的逆过程，将容量大的数据转成容量小的数据时需要使用强制转换符号（）
// 重点 转换的过程呢会导致数据失去精准或者数据出现巨大偏差 
