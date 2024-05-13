public class Work29{
	public static void main(String[] args) {
		
		Test mt = new Test();
 		int[] arr = {10,-1,8,0,34};
		mt.bubble(arr);
		
		System.out.println("=====排序后的arr=====");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +  "\t");
		}
		  
	}
}

class  Test{
	
	public void bubble(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length - 1 - i; j++) {
				if(arr[j] > arr[j + 1]) {
					int temp= arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
}