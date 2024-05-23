public class InnerClassExercise01{
	public static void  main(String[] args) {
		//匿名内部类当作实参直接传递
		f1(new AA() {
			public void show() {
				System.out.println("这是一幅名画......");
			}
		});
	
	}
	
	//静态方法 形参是接口类型
	public static void f1(AA aa) {
		aa.show();
	}
}


//接口
interface AA{
	void show() ;	
}

