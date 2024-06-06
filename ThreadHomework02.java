//要求 两个人在同一个账户取钱 总额10000
//每人每次取1000当余额不足时 提示不能取款了
//不能出现超额现象
public class ThreadHomework02{
	public static void main(String[] args) {
		
		T t = new T();
		Thread thread1 = new Thread(t);
		thread1.setName("t1");
		Thread thread2 = new Thread(t);
		thread2.setName("t2");
		thread1.start();
		thread2.start();
	}
}

class T implements Runnable{
	private int money = 10000;
	
	public void run() {
		while(true) {
			
			//这里使用synchronized实现了线程同步
			//当多个线程执行到这里时 就会去争夺this对象锁
			//哪个线程夺到this对象锁 就执行 synchronized代码块
			//争夺不到this的 就blocked 准备下次继续争夺
			//this对象锁是个非公平锁
			synchronized(this) {
			//判断余额是否足够
			if(money < 1000) {
				System.out.println("穷鬼别看了！余额不足不能取钱");
				break;
			}
			money -= 1000;
			System.out.println(Thread.currentThread().getName() + 
					" 取出了1000当前余额 : " + money);
		}	
			//休眠1s
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}