public class HomeWork9{
	public static void main (String[] args) {
		
		//演示自动转换  低进度转高进度
		int num = 'a';//ok char -> int
		double d1 = 80;//ok int -> double 
		System.out.println(num);
		System.out.println(d1);
		
	}
}

//                    *基本数据转换*
//细节1 有多种类的数据混合运算的时候，系统会首先选择最大的数据进行运算
//细节2 当我们把容量大的数据赋值给小的数据时是不可以的 因为容纳不下会报错
//细节3 byte--》short....类 与 char--》int.....类是不可以自动互相转换的
//细节4 byte，short，char 他们三者可以计算，在计算时首先转换int类型 随着大小逐渐改变
//自动提升原则 :表达结果的类型自动提升为 类中操作数最大的
//重点 布尔类型不参与数据的转换 boolean