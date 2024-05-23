public class Enumeration02{
	public static void main(String[] args) {
		//枚举练习----》枚举就是一个个列举的方法
		System.out.println(Season2.AUTUMN);
		System.out.println(Season2.SPRING);
		System.out.println(Season2.SUMMER);
		System.out.println(Season2.WINTER);
		
	}
}

//使用 enum关键字来实行枚举类
enum Season2{
	
	//定义4个对象 
	/*枚举 enum方法
	 * 1.类的class 被 enum替代
	 * 2.对象使用 例：SPRING("春天","温暖");  的形式  常量名（实参列表）
	 * 3.如果有多个常量对象 可以利用逗号
	 * 4.如果使用enum来实现枚举 要求将常量对象放在最前面
	 */
	SPRING("春天","温暖"),WINTER("冬天","寒冷"),SUMMER("夏天","炎热"),AUTUMN("秋天","凉爽");
	private String name;
	private String desc;
	
	
	private Season2(String name, String desc) {
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