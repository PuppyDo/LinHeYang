public class Master{
	
	private String name;
	
	public Master(String name) {//主人的构造器
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	//使用多态机制就可以同一主人喂食管理
	//animal的编译类型是Animal  可以指向接收animal子类的对象
	//food的编译对象Food 可以接受Food子类的对象
	public void feed(Animal animal, Food food) {
			System.out.println("主人 " + name + " 给 " + animal.getName() + " 吃 " + food.getName());
	}
	
	//主人给小狗喂食 骨头
	//public void feed(Dog dog ,Bone bone) {
	//	System.out.println("主人 " + name + " 给 " + dog.getName() + " 吃 " + bone.getName());
	//}
	//猫猫
	//public void feed(Cat cat ,Fish fish) {
	//	System.out.println("主人 " + name + " 给 " + cat.getName() + " 吃 " + fish.getName());
	//}
}