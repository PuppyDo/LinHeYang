public class LocalInnerClass{
	public static void main(String[] args) {
		
		Outer02 outer02 = new Outer02();
		outer02.m1();
	}
}

class Outer02{//外部类
	
	private int n1 = 100;
	private void m2() {
		System.out.println("Outer02 m2()");
	}//私有方法
	public void m1() {
		
		/*局部内部类  本质还是一个类 五大成员都可以有 可以被继承
		 * 并且可以直接访问外部类所有成员 包括私有的
		 * 不能使用修饰符   但可以用final 拒绝被继承
		 * 作用域 仅在定义他的方法或代码块
		 */
		class Inner02{
			//如果内部成员和外部成员重名时 遵循就近原则进行运行
			private int n1 = 800;
			
			public void f1() {
				//局部内部类可以直接访问外部成员
				System.out.println("内部类的n1 = " + n1 + "\n外部类的n1 = " + Outer02.this.n1);
				m2();//外部类私有
			}
		}
		//外部类在方法中 可以创建 Inner02的对象 调用方法即可
		Inner02 inner02 = new Inner02();
		inner02.f1();
		
	}
}