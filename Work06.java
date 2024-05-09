public class Work06{
	public static void main(String[] args) {
		
		BB b = new BB();
		int[] arr = {1,2,3};
		b.test100(arr);//调用方法 
		System.out.println("main的arr数组");
		
		for(int i = 0; i < arr.length;i++) {
			System.out.print(arr[i] + "\t"); 
		}
		System.out.println();
		
	}
}

//B类写一个方法test00
//写一个可接收数组，在方法中修改该数组，看看原来的数组是否有变化
class BB{
	public void test100(int[] arr) {
		arr[0] = 200;//修改元素
		
		System.out.println("test100的arr数组");
		for(int i = 0; i < arr.length;i++) {
			System.out.print(arr[i] + "\t"); 
		}
		System.out.println();
	}
}