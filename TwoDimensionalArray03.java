public class TwoDimensionalArray03{
	public static void main (String[] args) {
		
		//把所有数组的和计算出来
		int arr[][] = {{4,6},{1,4,5,7},{-2}};
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		System.out.println("sum = " + sum);
	}
}
