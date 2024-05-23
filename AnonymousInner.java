public class AnonymousInner{
	@SuppressWarnings({"all"})
	public static void main(String[] args) {
		Outer04 outer04 = new Outer04();
		outer04.method();
	}
}

class Outer04{//外部类
	private int n1 = 10;//属性
	
	public void method() {//方法
		//基于接口的匿名内部类
		/*1.使用IA接口 并创建对象
		 *2.传统写法 写一个类 实现该接口 并创建对象
		 *3.进阶条件 就使用一次 
		 *4.使用匿名内部类 简化开发
		 *5.tiger 的编译类型  IA
		 *6.tiger 的运行类型 匿名内部类 类似：Outer04$1 系统自动分配
		 */
		//新方法 基于接口的匿名内部类
		//7.jdk底层创建了匿名内部类 Outer04$1 马上创建了 实例 并把地址给返回tiger
		//匿名内部类只能使用一次
		IA tiger = new IA() {
			public void cry() {
				System.out.println("老虎叫唤...");
			}
		};
		System.out.println("tiger的运行类型" + tiger.getClass());//内部类源码
		tiger.cry();
		//老方法
		//IA tiger = new Tiger();
		//tiger.cry();
		
		
		//基于类的匿名内部类 
		/*1.father 的编译类型 father
		 *2.father 的运行类型 Outer04$2 系统自动分配
		 *在class father 可以接受参数列表
		 */
		Father father = new Father("jack") {//(jack)参数会传输给 构造器进行输出
			public void test() {//匿名内部也可以重写
				System.out.println("匿名内部类重写了test");
			}
		};
		System.out.println("father的运行类型" + father.getClass());//内部类源码
		father.test();
		
		//基于抽象类的匿名内部类
		Animal animal = new Animal() {
			 public void eat(){
				System.out.println("小狗吃骨头....");
			}
		};
		animal.eat();
		
		
	}
}

interface IA{//接口
	public void cry() ;
}
//class Tiger implements	IA{
//	public void cry() {
//		System.out.println("老虎叫唤...");
//	}
	

class Father{//内部类
	public Father(String name) {//构造器
		System.out.println("接收到name = " + name);
	}
	public void test() {//方法
		
	}
}

abstract class Animal {
    public abstract void eat(); 
}
