public class Enumeration01{
	public static void main(String[] args) {
		//枚举练习----》枚举就是一个个列举的方法
		
		System.out.println(Season.AUTUMN);
		System.out.println(Season.WINTER);
		System.out.println(Season.SUMMER);
		System.out.println(Season.SPRING);
	}
}
class Season{
	private String name;
	private String desc;
	/*枚举步骤
	 * 1.将构造器私有
	 *2.去掉setxxx的方法 防止属性被修改
	 *3.在Season内部 直接创建固定的对象
	 *4.优化 可以加入 final 修饰符 不可再调用
	 */
	//定义4个对象 
	public static Season SPRING = new Season("春天","温暖");
	public static Season WINTER = new Season("冬天","寒冷");
	public static Season SUMMER = new Season("夏天","炎热");
	public static Season AUTUMN = new Season("秋天","凉爽");

	
	
	private Season(String name, String desc) {
		this.name = name;
		this.desc = desc;
	}
	
	public String getName() {
		return name;
	}

	
	public String getDesc() {
		return desc;
	}
	
	public String toString() {
		return"Season{"
				+ "name = '" + name + '\'' +
				", desc = '" + desc + '\'' +
				'}'; 
	}
}