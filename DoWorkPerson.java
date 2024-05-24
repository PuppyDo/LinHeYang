public class DoWorkPerson{
	private String name;
	private Vehicles vehicles;
	
	//在创建人对象时 事先给他分配一个交通工具
	public DoWorkPerson(String name, Vehicles vehicles) {
		this.name = name;
		this.vehicles = vehicles;
	}

/*4.有person类 有name和Vehicles属性 在构造器中给两个属性赋值
*5.实例化person对象 唐僧 要求一般情况下horse作为交通工具
*6.遇到大河时boat作为交通工具
*/
public void passRiver() {
	//先得到船
	//判断一下 当前的Vehicler属性 是否已经存在了 如果是空获取一艘船
	//vehicles instanceof Boat 判断当前的属性是不是船
	//如果vehicles 等于null 整个结果是假  结果等于马也为假 ！！！！如果是船为真！！！！
		if(!(vehicles instanceof Boat)) {
			//这里使用的是多态
			vehicles = VehiclerFactory.getBoat();
		}
		//这里体现使用接口调用
		vehicles.work();
	}

public void common() {
	//得到马
	//判断一下 当前的Vehicler属性 是否已经存在了 如果是空获取一匹马
	if(!(vehicles instanceof Horse)) {
		//这里使用的是多态
		vehicles = VehiclerFactory.getHorse();
	}
	//这里体现使用接口调用
	vehicles.work();
	}

public void jindouyun() {
	//得到筋斗云
	//判断一下 当前的Vehicler属性 是否已经存在了 如果是空获取筋斗云
	if(!(vehicles instanceof HuoYan)) {
		//这里使用的是多态
		vehicles = VehiclerFactory.getHuoYan();
	}
	//这里体现使用接口调用
	vehicles.work();
	}
}