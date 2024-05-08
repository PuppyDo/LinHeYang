public class Work03{
	public static void main(String[] args) {
		
		AA a = new AA();
		int[] res = a.getSumAndSub(1,4);
		System.out.println("和 = " + res[0]);
		System.out.println("差 = " + res[1]);
	}
}

class AA{
	/* 一个方法最多又一个返回值【思考如何返回多个结果 返回数组】
	 * 2.返回类型可以为任意类型，包含基本类型或者引用类信号（数组，对象）
	 * 3.如果方法要求有返回数据类型，则方法体中最后的执行语句必须为return
	 * 而且要求返回的值必须与return类型一致或兼容
	 */
	public int[] getSumAndSub(int n1, int n2){
		int[] resArr = new int[2];//创加一个数组
		resArr[0] = n1 + n2;
		resArr[1] = n1 - n2;
		return resArr;
	}
}