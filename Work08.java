public class Work08{
	public static void main (String[] args) {
		
		T t1 = new T();
		int n = 7 ;
		int res = t1.fibonacci(n);
		if(res != -1) {
		System.out.println("当 n = " + n +" 对应的斐波那契数 = " + res);
		}
	}
}

class T{
	//使用递增的方式写出斐波那契数1，1，2，3，5，8，13.....
	//斐波那契数是前两个数的和
	//1 + 1 = 2   2 + 3 =5
	
	public int fibonacci(int n) {
		if(n >= 1) {
			if(n == 1 || n == 2) {
				return 1;
			}else {
				return fibonacci(n-1) + fibonacci(n -2);
			}
		}
		else {
			System.out.println("要求输入的 n >= 1的整数");
			return -1;
		}
	}
}