public class HomeWork002{
	public static void main(String[] args) {
		
		/*输出小写a-z，A-Z；
		 * 使用for 搞定 
		 */
		
		for(char c1 = 'a' ; c1 <= 'z'; c1++) {
			System.out.print(c1 + " \t");
			
		}
		System.out.print( " \n");
		for(char c1 = 'Z' ; c1 >= 'A'; c1--) {
			System.out.print(c1 + " \t");
		}
		
	}
}