public class Array05{
	public static void main(String[] args) {
		
		/*基本数据类型赋值，赋值方式为值拷贝
		 * 但数组在默认情况下是引用传递，赋的值是地址，赋值方式为引用传递
		 * 因为是同一个地址，所以arr2的赋值变化会对arr1的数组产生影响
		 */
		int[] arr1 = {10,20,30};
		int[] arr2 = arr1;
		arr2[0] = 99;
		
		System.out.println("=====arr1的值=====");
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
	}
}