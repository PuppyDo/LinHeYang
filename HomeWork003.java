public class HomeWork003{
	public static void main(String[] args) {
		/*
		 * 1/1- 1/2 + 1/3 - 1/4......1/100的和
		 * 一组为一个数共100组
		 * 分子为1 分母从1-100
		 * 还发现分母为奇数时 前面是 + ， 分母是偶数时 前面是-
		 * 要把公式分子 1 写出1.0才能得到精确的小数 
		 */
		double sum = 0;
		for(int i = 1; i <= 100; i++) {
			//判断奇数和偶数
			if(i % 2 != 0) {//分母为奇数
				sum += 1.0/i;
			}
			else {//分母为偶数
				sum -= 1.0/i;
			}
		}	
		System.out.println("sum = " + sum);
	}
}