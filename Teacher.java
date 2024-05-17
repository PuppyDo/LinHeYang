public class Teacher extends Person0001{
	
	private int work_age;
	
	public  Teacher(String name, char gender, int age, int work_age) {
		super(name,gender, age);
		this.work_age = work_age;
		
	}

	
	public int getWork_age() {
		return work_age;
	}
	public void setWork_age(int work_age) {
		this.work_age = work_age;
	}
	
	
	public void teach() {
		System.out.println(getName() + "承诺会好好 教学生 java");
	}
	
	public String play() {
		return super.play() + "象棋";
	}
	
	public void printInfo() {
		System.out.println("老师信息 ：");
		System.out.println(super.basicInfo());
		System.out.println("工龄 ：" + work_age);
		teach();//组合 变化万千
		System.out.println(play());
	}
	
	public String toString() {
		return "Teacher{" +
				"work_age = " + work_age + '\'' + '}' + super.toString();
	}
}