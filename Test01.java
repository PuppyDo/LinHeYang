public class Test01{
	public static void main(String[] args) {
		int x = 5;
		int y = 5;
		if(x++ ==6 & ++y ==6) {
			x = 11;
		}
		System.out.println("x=" + x + "y=" + y);
	}
}