public class VehiclerFactory{
	//马始终为同一匹
		private static Horse horse = new Horse();//单列模式 饿汉式		
		private VehiclerFactory() {
			//防止外部类实例化
		}
	//3.创建交通工具工厂类 分别有两个方法 获得交通工具horse和boat
	//这里我们设置为static比较方便
	
	public static Horse getHorse() {
		return horse;
	}
	
	public static Boat getBoat() {
		return new Boat();
	}
	
	public static HuoYan getHuoYan() {
		return new HuoYan();
	}
}

