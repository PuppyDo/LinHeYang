public class Array07{
	public static void main(String[] args) {
		
		
		//数组颠倒  
		/*使用逆序赋值方法
		 * 先创建一个新的数组 arr2，大小， arr.length
		 * 逆序遍历arr，将每个元素拷贝到arr2的元素中
		 */
		int[] arr = {11,22,33,44,55,66};
		int[] arr2 = new int[arr.length];
		for(int i = arr.length - 1, j = 0; i >= 0; i--,j++) {
			arr2[j] = arr[i];
		}
		arr = arr2;
		System.out.println("=====反转后的数组=====");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");

		}	
	}
}
