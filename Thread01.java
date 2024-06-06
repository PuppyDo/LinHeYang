//多线程练习
//使用main线程带动两个子线程
public class Thread01{
	public static void main(String[] args) {
		
		T1 t1 = new T1();
		T2 t2 = new T2();
		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t2);
		thread1.start();
		thread2.start();
	}
}
class T1 implements Runnable{
	int count = 0;
	
	public void run() {
		while(true) {
		//输出10次后结束
		System.out.println("hello Word " + (++count));
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();
			}
		if(count == 10) {
			break;
			}
		}
	}
}
	class T2 implements Runnable{
		int count = 0;
		
		public void run() {
			while(true) {
				
			//输出10次后结束
			System.out.println("hi " + (++count));
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
				}
			if(count == 5) {
				break;
			}
		}
	}
}
