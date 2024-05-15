/*编写一个Student类 增加 Id Score属性 private 以及构造器 定义一个say方法
 * 返回自我介绍信息
 */

public class Student extends times{
	
	private int id ;
	private double score;
	
	public Student(String name, int age, int id, double score) {
		super(name,age);//自动调用父类
		this.id = id;
		this.score = score;
	}
	
	public String say() {//体现super的好处 代码复用
		return super.say() + " id = " + id + " score = " + score;
	}
	public int getid() {
		return id;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	
}
