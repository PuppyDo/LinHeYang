public class Work17{
	public static void main(String[] args) {
		Wt t1 = new Wt("king", 40);//第1构造器
		Wt t2 = new Wt("tom");//第2构造器
		
		
	}
}

class Wt{
	String name;
	int age;//默认值0
	
	//第1个构造器
	public Wt(String wName, int wAge) {
		name = wName;
		age = wAge;
	}
	
	//第2个构造器 造成重载 与第1构造器不同即可
	public Wt(String wName) {
		name = wName;
	}
		
}