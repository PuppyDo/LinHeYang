public class Homework004{
	public static void main(String[] args) {
		
		/*求 1+ 1+2 +  1+2+3 + 1+2+3+4.......100的结果
		 * 一共一百项相加
		 * 很像一个双层循环
		 */
		int sum = 0;
		for(int i =1; i <= 100; i++) {// i可以表示是第几项，同时也是当前项最大的数字
			for(int j =1; j <= i; j++) {
				sum +=j;
			}
		}
		System.out.println("sum =" + sum);
	}
}