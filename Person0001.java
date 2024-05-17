public class Person0001{
	
	private String name;
	private char gender;
	private int age;
	
	public  Person0001(String name, char gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//编写一个paly方法
	public String play() {
		return name + "爱玩";
	}
	//返回一个基本信息
	public String basicInfo() {
		return "姓名： " + name + "\n年龄 ：" + age + "\n性别 ：" + gender;
	}
	
	public String toString() {
		return "Person001{" +
				"name = " + name + '\'' + 
				", gender = " + gender + ", age = " + age + '}';
	}
		
}