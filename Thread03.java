public class Thread03{
	public static void main(String[] args) throws InterruptedException {
		
		Thread t3 = new Thread(new T3());
		
		for(int i = 1 ; i <= 10; i ++) {
			System.out.println("hi + " + i);
			if(i == 5) {//先输出主线程输出5次 hi
				t3.start();//启动子线程 输出hello
				t3.join();//立即将t3插入主线程先输出
			}
			Thread.sleep(1000);
		}
		
	}
}
class T3 implements Runnable{
	
	private int count = 0;
	public void run() {
		while(true) {
			System.out.println("hello " +  (++count));
			
			
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