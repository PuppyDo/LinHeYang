//多线程 进阶练习
/*使用Thread方法
 * 模拟三个售票窗口售票
 * 多线程实施途中会导致线程互斥 举例：发生票卖超的情况
 */

public class Thread02{
	public  static void main(String[] args) {
		
		SellTicket02 sellticket02 = new SellTicket02();
		
		new Thread(sellticket02).start();//线程1
		new Thread(sellticket02).start();//线程2
		new Thread(sellticket02).start();//线程3
		
	}
}
class SellTicket01 extends Thread{
	private  int ticketNum = 100;//让多个线程共享 tickeNum
			
	public void run() {
		while(true) {
			
			
			if(ticketNum <= 0) {
				System.out.println("售票结束");
				break;
			}
			
			//休眠50毫秒
			try {
				Thread.sleep(50);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("窗口 " + Thread.currentThread().getName() + 
									"售出一张票 " + " 剩余票数 " + (--ticketNum));
		}
	}
}
class SellTicket02 extends Thread{
	private   int ticketNum = 100;//让多个线程共享 tickeNum
			
	public void run() {
		while(true) {
			
			
			if(ticketNum <= 0) {
				System.out.println("售票结束");
				break;
			}
			
			//休眠50毫秒
			try {
				Thread.sleep(50);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("窗口 " + Thread.currentThread().getName() + 
									"售出一张票 " + " 剩余票数 " + (--ticketNum));
		}
	}
}