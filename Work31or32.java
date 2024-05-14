public class Work31or32{
	public static void main (String[] args) {

		//封装和继承的初步练习
		Work31 pubil = new Work31();
			pubil.name = "银角大王";
			pubil.age = 10;
			pubil.testing();
			pubil.setScore(60);
			pubil.showInfo();
		
		System.out.println("=============================");
			
		Work32 graduate = new Work32();
			graduate.name = "金角大王";
			graduate.age = 22;
			graduate.testing();
			graduate.setScore(100);
			graduate.showInfo();
	}
}