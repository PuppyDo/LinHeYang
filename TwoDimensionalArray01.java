public class TwoDimensionalArray01{
	public static void main (String[] args) {
		 
		//int[][]代表二维数组
		int[][] arr = {{0,0,0,0,0,0},
					   {0,0,1,0,0,0},
					   {0,2,0,3,0,0},
					   {0,0,0,0,0,0}};
		
		//关于二维数组的概念
		System.out.println("二维数组的元素个数 = " + arr.length);
		//举例 想要访问3， 他是第三个一维数组的第四个就是 arr[2][3];  arr[i][j]
		System.out.println("第3个一位数组的第4个值 = " + arr[2][3]);
		
		for(int i = 0; i < arr.length; i++) { //历遍二维数组的每个数字
			//1.arr【i】表示二维数组的第i+1个元素 
			//2.arr【i】.length得到对应的 每一个数组的长度
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");//输出了一堆数组
			}
			System.out.println();
		}
	}
}