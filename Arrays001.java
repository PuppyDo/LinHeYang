import java.util.Arrays;
import java.util.Comparator;
public class Arrays001{
	public static void main(String[] args) {
		
		Integer[] integers = {1,20,90};
		
		//直接使用 arrays toString方法 显示数组
		System.out.println(Arrays.toString(integers));
		
		System.out.println("============数组排序===========");

		Integer arr[] = {1,-1,7,0,89};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		//定制排序
		Arrays.sort(arr, new Comparator(){
			public int compare(Object o1, Object o2) {
				Integer i1 = (Integer) o1;
				Integer i2 = (Integer) o2;
				return i2 - i1;
			}
		});
		System.out.println("============定制数组排序===========");
		System.out.println(Arrays.toString(arr));
	}
}