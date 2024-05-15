public class Poly01{//多态的练习 包含food fish bone animail cat dog  master pig rice几段代码
	public static void main(String[] args) {
	Master tom = new Master("Tom");
	Dog dog = new Dog("大黄");
	Bone bone = new Bone("大棒骨～");
	
	tom.feed(dog,bone);
	
	System.out.println("===========================");
	
	Master jack= new Master("jack");
	Cat cat = new Cat("小猫");
	Fish fish = new Fish("小黄鱼！");
	
	jack.feed(cat, fish);
	
	System.out.println("===========================");
	
	Master monkey = new Master("猴哥");
	Pig pig = new Pig("八戒");
	Rice rice = new Rice("西瓜");
	
	monkey.feed(pig, rice);
	
	}
}