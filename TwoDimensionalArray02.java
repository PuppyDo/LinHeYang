public class TwoDimensionalArray02{
	public static void main (String[] args) {
		
		 int [][] arr = new int[10][]; //创建了一个二维数组 有10个一维数组但是每个都为空
		 for(int i = 0; i < arr.length; i++) {
			 //给每一个一维数组开空间 new
			 arr[i] = new int[i + 1];
			 
			 //遍历一维数组 给一维数组赋值
			 for(int j = 0; j < arr[i].length; j++) {
				 arr[i][j] = i + 1;//赋值
			 }
		 }
		 
		 System.out.println("====arr元素====");
		 //遍历arr输出
		 for(int i = 0; i < arr.length; i++) {
			 
			 //输出arr的每一个一维数组
			 for(int j = 0; j < arr[i].length; j++) {
				 System.out.print(arr[i][j] + " ");
			 }
			 System.out.println();//换行
		 }
		 
	}
}