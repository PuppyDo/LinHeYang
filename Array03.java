public class Array03{
	public static void main(String[] args) {
		
		/*创建一个Char类型的数组放置大写的A-Z
		 * 使用for循环
		 */
		
		char[] chars = new char[26];
		for(int i = 0; i <chars.length; i++) {
			//chars是char[]
			//char[i]是char
			chars[i] = (char)('A' + i);//需要强制转换
		}
		System.out.println("=====chars数组=====");
		for(int i = 0; i <chars.length; i++) {
			System.out.print(chars[i] + " ");
		}
	}
}