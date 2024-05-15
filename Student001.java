public class Student001 extends Person001{
	
	private double score;
	
	public Student001(String name , int age, double score) {//构造器
		super(name,age);
		this.score = score;
	}
	//生成score 的 get and set的构造器方法
	public double getScore() {
		return score;
	}
	
	public void setScore(double score) {
		this.score = score;
	}
	
	//重写父类的say方法
	public String say() {
		return "学生 " + super.say() + "  score = " + score;
	}
	//特殊方法
	 public void study() {
		 System.out.println("学生 " + getName() + "正在学java课程") ;
	 }
	
}