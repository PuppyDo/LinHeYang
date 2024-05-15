public class Override{
	public static void main(String[] args) {
		
		times jack = new times("jack",20);
		System.out.println(jack.say());
		
		Student tom = new Student("tom", 20, 123456,99.8);
		System.out.println(tom.say());
	}
}