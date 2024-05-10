public class Work18{
	public static void main(String[] args) {
		N p1 = new N();
		System.out.println("p1的信息 name = " + p1.name + "   p1的信息 age = " + p1.age);
		
		N p2 = new N("scott",50);
		System.out.println("p2的信息 name = " + p2.name + "  age = " + p2.age);
		
	}
}
class N{
	String name;
	int age;
	public N() {
		age = 18;
	}
	
	public N(String pName, int pAge) {
		name = pName;
		age = pAge;
	}
	
}