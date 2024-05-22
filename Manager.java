public class Manager extends Employee{
	
	//抽象类基础练习
	
	private double bouns;
	
	public Manager(String name, int id, double salary) {
		super(name,id,salary);
	}
	
	public double getBouns() {
		return bouns;
	}
	public void setBouns(double bouns) {
		this.bouns = bouns;
	}
	
	
	public void work() {
		System.out.println("经理 " + getName() + " 工作中.... ");
	}
}