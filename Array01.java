public class Array01{
	public static void main(String[] args) {
		
		/*定义一个数组
		 * 
		 */
		double[] hens = {3,5,1,3.4,2,50};//double类型数组 数组名hens
		
		//我们可以通过hens[下标]来访问数组的值
		//下标是从0开始编号 比如第一个值就是hens【0】以此类推
		//通过for就可以循环访问
		//使用一个变量 totaWeight 将所有的值累计
		System.out.println("====用数组解决====");
		//可以通过数组名.length 得到数组的长度或数量等
		System.out.println("数组的长度" + hens.length);

		
		double totaWeight = 0;
		for(int i = 0; i < hens.length; i++) {
			System.out.println("第" + (i + 1) +"元素的值 = " + hens[i]);
			totaWeight += hens[i]; 
		}
		System.out.println("总体重 = " + totaWeight + "\t" + "平均体重 = " + (totaWeight / hens.length));
	}
}