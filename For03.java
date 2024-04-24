public class For03{
	public static void main(String[] args) {
		
		//两个编程技巧
		//1.化繁为简：将复杂的需求拆解成简单的需求，逐步完成
		//2.先死后活：先考虑固定的值，然后转成可以灵活变化的值
		
		/**第一种
		int count = 0;//统计9的倍数的个数
		int sum =0;//计算总和
		for(int i = 1; i <= 100; i++) {
			if(i %9 == 0) {
				System.out.println("i的倍数是" + i);
				count++;//统计 倍数个数
				sum +=i;//积累 算总和
			}			
		}
		System.out.println("共有 " + count +" 个倍数");
		System.out.println("倍数的总和是 " + sum);
		*/
		
		//第二种
		int count = 0;//统计9的倍数的个数
		int sum = 0;//计算总和
		int start = 10;//初始值设定
		int end = 200;//范围极限设定
		int t = 5;
		for(int i = start; i <= end; i++) {
			if(i % t == 0) {
				System.out.println("i的倍数是" + i);
				count++;//统计 倍数个数
				sum +=i;//积累 算总和
			}			
		}
		System.out.println("共有 " + count +" 个倍数");
		System.out.println("倍数的总和是 " + sum);
	}
}