public class Person001{
	private String name;
	private int age;
	
	public Person001(String name, int age) {//父类
		this.name = name;
		this.age = age;
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public String say() {//返回名字和年龄
		return name + "\t" + age;
	}
}