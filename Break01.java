public class Break01{
	public static void main(String[] args) {
		
	abc1:
		for(int j = 0; j < 4; j++) {
	abc2:
		for(int i = 0; i < 10; i++) {
			if(i == 2) {
				break;
				}
				System.out.println("i = " + i);
			}
		}
	}
}