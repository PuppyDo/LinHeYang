public class MathMethod{
	public static void main(String[] args) {
		//math练习
		//向上取整
		double ceil = Math.ceil(3.8);
		System.out.println(ceil);
		//向下取整
		double floor = Math.floor(4.001);
		System.out.println(floor);
		//4舍5入
		long round =Math.round(4.51);
		System.out.println(round);
		//求开方
		double sqrt = Math.sqrt(9.0);
		System.out.println(sqrt);
		
		//利用 math  random 求随机数  要求2--7之间
		for(int i = 0; i < 10; i++) {
			System.out.println((int)(2 + Math.random() * (7 - 2 + 1)));
		}
		//max min 求出最大值和最小值
		int min = Math.min(1,9);
		int max = Math.max(99, 88);
		System.out.println("min = " + min + " max = " + max);
	}
}