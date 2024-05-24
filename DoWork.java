public class DoWork{
	public static void main (String[] args) {
		DoWorkPerson tang = new DoWorkPerson("唐僧",new Horse());
		tang.common();
		tang.passRiver();
		tang.passRiver();
		tang.common();
		tang.passRiver();
		tang.jindouyun();
	}
}
/*要求
 * 1.有一个交通工具Vehicles 有work接口
 * 2.有horse类和boat类分别实现Vehicles
 * 3.创建交通工具工厂类 分别有两个方法 获得交通工具horse和boat
 * 4.有person类 有name和Vehicles属性 在构造器中给两个属性赋值
 * 5.实例化person对象 唐僧 要求一般情况下horse作为交通工具
 * 6.遇到大河时boat作为交通工具
 */



