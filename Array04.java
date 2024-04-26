public class Array04{
	public static void main(String[] args) {
		
		//找出数组的最大值
		int[] arr = {4,6,-1,9,23};//数组
		int max = arr[0];//假设最大值为0号位
		int maxIndex = 0;//下标
		
		for(int i = 1; i < arr.length; i++) {
			if(max <arr[i]) {//最大值比较
				max = arr[i];//最大值设定
				maxIndex = i;//下标数
			}
		}
		//输出
		System.out.println("max = " + max + 
					"\t maxIndex = " + maxIndex);
	}
}
