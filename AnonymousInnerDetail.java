public class AnonymousInnerDetail{
	public static void main(String[] args) {
		Outer05 outer05 = new Outer05();
		outer05.f1();
		
	}
}

class Outer05{
	private int n1 = 99;
	public void f1() {
		//匿名内部类
		Person person = new Person() {
			private int n1 = 88;
			public void hi() {
				//可以直接访问外部类 所有属性 包括私有的
				//与局部内部类相同 不能添加修饰符  如果外部类和内部类属性重名采用就近原则
				System.out.println("匿名内部类重写了重写了hi方法 n1 = " + n1);
				System.out.println("匿名内部类同属性 n1 = " + n1 + "  外部类同名属性 = " + Outer05.this.n1);
				System.out.println("匿名内部类重写了重写了hi方法");
			}
		};
		person.hi();//绑定动态 运行类型是 Outer05$1\
		
		new Person() {
			public void hi() {
				System.out.println("匿名内部类重写了重写了hi方法,哈哈哈....");
			}
		}.hi();
		
		//public void ok(String str) {
		//	super.ok(str);
		//	}.ok("jack");
	}
}
 
class Person{//类
	public void hi() {
		System.out.println("Person hi()");
	}
	public void ok(String str) {
		System.out.println("Person ok() " + str);
	}
}