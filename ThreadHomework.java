import java.util.*;
public class ThreadHomework{
	public static void main(String[] args) {
		A a = new A();
		B b = new B(a);
		a.start();
		b.start();
	}
}
//创建A类线程
class A extends Thread{
	
	private boolean loop = true;
	public void run() {
		//输出1-100数字
		while(loop) {
			System.out.println((int)(Math.random() * 100 + 1));
			
			//休眠
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("A线程退出.....");
	}
		public void setLoop(boolean loop) {//可以修改loop变量
			this.loop = loop;
		
	}
}

class B extends Thread{
	private A a;
	private Scanner scanner = new Scanner(System.in);
	
	public B(A a) {//构造器直接传入A类对象
		this.a = a;
	}
	
	public void run() {
		while(true) {
		//接收用户输入
		System.out.println("请输入你的指令（Q）表示退出:");
		char key = scanner.next().toUpperCase().charAt(0);
		if(key == 'Q') {
			//通过通知的方式结束A线程
			a.setLoop(false);
			System.out.println("B线程结束");
			break;
			}
		}
	}
}