public class Teacher001 extends Person001{
	
	private double salary;
	
	public Teacher001(String name , int age, double salary) {//构造器
		super(name,age);
		this.salary = salary;
	}
	
	//生成salary 的 get and set的构造器方法
		public double getSalary() {
			return salary;
		}
		
		public void setSalary(double salary) {
			this.salary = salary;
		}
		
		//重写父类的say方法
		public String say() {
			return "老师 " + super.say() + "  salary = " + salary;
		}
		
		//特有方法
		 public void teach() {
			 System.out.println("老师 " + getName() + "正在讲java课程") ;
		 }
}