public class Common extends Employee{
	//抽象类基础练习
	public Common(String name, int id, double salary) {
		super(name,id,salary);
	}
	
	public void work() {
		System.out.println("普通员工 " + getName() + " 工作中.... ");
	}
}