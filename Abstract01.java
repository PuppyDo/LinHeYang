public class Abstract01{
	public static void main(String[] args) {
		
		//抽象类基础练习
		Manager manager = new Manager("jack", 999, 50000);
		manager.setBouns(8000);
		manager.work();
		

		Common common = new Common("jery", 888, 20000);
		common.work();
	}
}

