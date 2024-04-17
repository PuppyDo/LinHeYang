public class HomeWork4{
	public static void main(String[] args) {
		//变量要有先后先声明，后使用，既有顺序
		int a = 50;
		System.out.println(a);//50
		
		//该区域的数据/值可以在同一类型范围内不断变化
		//a = “jack”;不可运行 会报错
		a = 88;
		System .out.println(a);//88
		
		//同一作用域内变量不可同一名称
		//例如  int a = 1000；
		//会与上面的int a 起冲突报错	
	}
}
