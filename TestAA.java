public class TestAA extends Template{
	
	public void job() {//实现了父类的抽象方法job
		long num = 0;
		for(long i = 1; i <= 600000; i++) {
			num += i;
		}
	}
}