public class Work07{
	public static void main (String[] args) {
		
		Per p = new Per();
		p.name = "milan";
		p.age = 100;
		
		My tools = new My();
		Per p2 = tools.copyPerson(p);
		
		System.out.println("p的属性 age = " + p.age + "　名字 = " + p.name );
		System.out.println("p2的属性 age = " + p2.age + "　名字 = " + p2.name );

		
	}
}

class Per{
	String name;
	int age;
	
}

class My{
	public Per copyPerson(Per p) {
		
		Per p2 = new Per();
		p2.name = p.name;//把原来的名字赋给p2.name
		p2.age = p.age;//相同
		
		return p2;
	}
}