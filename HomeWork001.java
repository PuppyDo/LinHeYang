public class HomeWork001{
	public static void main(String[] args) {
		
		
		/*输出1-100不能被5整除的数
		 * 1.先输出1-100
		 * 2.然后过滤
		 * 3.每5个一行,使用 int count 统计输出个数 
		 * count %5 =0
		 */
		int count = 0;
		for(int i = 1; i <=100; i++) {
			if(i % 5 != 0) {
				count ++;
				System.out.print(i + "\t ");
				//每满5个就换一次行
				if(count % 5 ==0) {
					System.out.println();
				}
			}
			
		}
	}
}