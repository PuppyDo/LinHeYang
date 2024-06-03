import java.util.ArrayList;
public class Generic01{
	public static void main(String[] args) {
		
		//泛型课后练习
		//如果编译器发现添加的类型不满足要求 就会报错
		//在遍历的时候  直接取出Dog类型 而不是object类型
		ArrayList<Dog0001> arrayList = new ArrayList<Dog0001>();
		arrayList.add(new Dog0001("旺财",10));
		arrayList.add(new Dog0001("小黄",1));
		arrayList.add(new Dog0001("发财",5));
		
		//arrayList.add(new Cat("招财猫",8));
		System.out.println("=============使用泛型=============");
		for(Dog0001 dog : arrayList) {
			System.out.println(dog.getName() + "-" + dog.getAge());
		}
	}
}

class Dog0001{
	private String name;
	private int age;
	public Dog0001(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge(){
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}