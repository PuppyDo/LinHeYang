public class Work05{
	public static void main(String[] args) {
		
		sum a = new sum();
	//	if(a.isOdd(2)) {
	//	System.out.println("是奇数");
	//	}
	//	else {
	//		System.out.println("是偶数");
	//	}
		
	a.print(2,5,'*');
		
		
	}
}

class sum{
	/*思路
	 * 1.方法的返回类型boolean
	 * 2.方法的名字isOdd
	 * 3.方法的形参(int num)
	 * 4.方法体，判断
	 */
	
	public boolean isOdd(int num){
		return num % 2 != 0 ;

	}
	//打印对应行数列数的字符
	 public void print(int row,int col,char c) {
		 for(int i = 0; i < row ; i++) {
			 for(int j = 0; j < col; j++) {
				 System.out.print(c);
			 }
			 System.out.println();
		 }
	 }
}