public class BubbleSort{
	public static void main(String[] args) {
		//冒泡排序代码练习
		int[] arr = {-1,13,99,34,56};
		int temp = 0;
		
		for(int i = 0; i < arr.length - 1; i++) { //总循环次数
			for(int j = 0; j < arr.length - 1 - i; j++) { //进行比较 并且删减比较次数
				
				if(arr[j] > arr[j + 1]) { //如果前面的数大于后面的数 就要进行交换
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1]  = temp;
				}
			}
			
			System.out.println("\n==第" + (i + 1) + "轮==");
			for(int j = 0; j < arr.length; j++) {
				System.out.println(arr[j] + "\t");
			}
		}
		
	}
}