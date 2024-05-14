public class PC extends computer {
	
	private String brand;
	
	//这里idea 根据继承的规则 自动把构造器调用写好
	//子类构造器完成子类构造器
	public PC(String cpu, int memory, int disk, String brand) {
		super(cpu,memory,disk);
		this.brand = brand;
	}
	public String getBrand() {
		return  brand;
	}
	public void setBrand(String band) {
		this.brand = brand;
	}
	
	public void printInfo() {
		System.out.println("PC信息 ");
		//调用父类的getDetails方法，得到相关的信息
		System.out.println(getDetails() + " brand = " + brand);
	}
	
}