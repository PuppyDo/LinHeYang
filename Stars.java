public class Stars{
	public static void main(String[] args) {
		
		for(int i = 1; i <= 5; i++) {//i表示层数
			
			//在输出*之前，还有输出 对应空格 = 总层数减当前层
			for(int k = 1; k <= 5 - i; k++) {
				System.out.print(" ");
			}
			//控制打印每层*的个数
			for(int j = 1; j<= 2 * i - 1; j++) {
				System.out.print("*");
			}
			//每打印完*后会自动换行
			System.out.println("");
		}
	}
}