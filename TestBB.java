public class TestBB extends Template{
	
	
public void job() {//实现了父类的job方法
		long num = 0;
		for(long i = 1; i <= 900000; i++) {
			num *= i;
		}
	}
}