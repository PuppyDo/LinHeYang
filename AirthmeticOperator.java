public class AirthmeticOperator{
	public static void main(String[] args) {
		
		System.out.println(10 / 4);//从数学来看是2.5，但电脑显示2
		double d = 10.0 / 4;//想要保留小数点后的数字要添加小数点
		System.out.println(d);
		
		//取余数
		System.out.println(10 % 3);
		//-10 % 3 = -10 - -10 / 3 * 3 = -10 + 9 = -1
		//10 % -3 = 10 - 10 / -3 * 3 = 10 - 9 = 1
		System.out.println(-10 % 3);
		System.out.println(10 % -3);
		
		//自增的用法
		//前++ ： ++1先自增后赋值 
		//后++ ： 1++先赋值后自增
		int i =10;
		i++;
		++i;
		System.out.println("i=" + i);
		
		int j = 8;
		//int k = ++j;// 先执行：j=j+1;  后执行： k=j;
		int k = j++;//   先执行：k=j;    后执行：j=j+1;
		System.out.println("k=" + k + "j=" + j);
	}
	
}