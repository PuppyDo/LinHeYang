import java.util.Arrays;
import java.util.Comparator;

public class Arrays002{
	public static void main(String[] args) {
		int[] arr = {1,-1,8,0,20};
		bubble01(arr);
		System.out.println("============普通冒泡===========");
		System.out.println(Arrays.toString(arr));
		
		
		System.out.println("===========定制冒泡 ===========");
		
		bubble02(arr, new Comparator() {
			public int compare(Object o1, Object o2) {
				int i1 = (Integer)o1;
				int i2 = (Integer)o2;
				return i1 - i2;
			}
		});
		System.out.println(Arrays.toString(arr));
	}
	//普通的冒泡
	public static void bubble01(int[] arr) {
		int temp = 0;
		
		 for(int i = 0; i < arr.length -1; i ++) {
			 for(int j = 0; j < arr.length - 1 - i; j++) {
				 if(arr[j] < arr[j + 1]) {
					 temp = arr[j];
					 arr[j] = arr[j + 1];
					 arr[j + 1] = temp;
				 }
			 }
		 }
	}
	
	//冒泡结合定制
	public static void bubble02(int[] arr,Comparator c) {
		int temp = 0;
		 for(int i = 0; i < arr.length -1; i ++) {
			 for(int j = 0; j < arr.length - 1 - i; j++) {
				 if(c.compare(arr[j],arr[j + 1]) > 0) {
					 temp = arr[j];
					 arr[j] = arr[j + 1];
					 arr[j + 1] = temp;
				 }
			 }
		 }
	}
}