public class For02{
	public static void main(String[] args) {
	
		/**	int i =1;
			
		for(;i <= 10;) {//   (;;)表示无限循环
			System.out.println("hello~靓仔！" + i);
			i++;
		}
		System.out.println("i =" + i); */
		
		int count = 3;
		for(int i = 0,j = 0; i < count; i++, j += 2) {
			System.out.println("i=" + i + "\t" + "j=" + j);
		}
	}
}