public class Work16{
	public static void main(String[] args) {
		P p1 = new P("smith" , 80);
		System.out.println("p1的信息如下");
		System.out.println("p1对象的 name = " + p1.name);
		System.out.println("p1对象的 age = " + p1.age);

	}
}
//构造器的练习
//直接指定对象的名字和年龄
class P{
	String name;
	int age;
	//构造器没有返回值 不能写 void
	//构造器的名字和类Person一样
	//(String pName, int pAge)是构造器的形参列表
	public P(String pName, int pAge) {
		System.out.println("构造器被调用～～完成对象属性的初始化");
		name = pName;
		age = pAge;
	}
}