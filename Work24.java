public class Work24{
	public static void main(String[] args) {
		int[] oldArr = {10,30,50};
		A03 a03 = new A03();
		int[] newArr = a03.copyArr(oldArr);
		
		System.out.println("=====返回的newArr元素情况=====");
		for(int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + "\t");
		}
	}
}

class A03 {
	public int[] copyArr(int[] oldArr) {
		//创建一个长度为oldArr.length的数组
		int[] newArr = new int[oldArr.length];
		//oldArr将元素拷贝到 newarr
		for(int i = 0; i < oldArr.length; i++) {
			newArr[i] = oldArr[i];
		}
		return newArr;
	}
}