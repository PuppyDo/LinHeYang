import java.util.Scanner;
public class Array02{
	public static void main(String[] args) {
		
		/*循环输入5个成绩 保存到double数组并输出
		 * 
		 */
		double scores[] = new double[5];
		Scanner myScanner = new Scanner(System.in);
		for(int i = 0; i < scores.length; i++) {
			System.out.println("请输入第" + (i+1) + "个元素的值");
			scores[i] = myScanner.nextDouble();
		}
		//输出，遍历组数
		System.out.println("====数组的值情况如下====");
		for(int i = 0; i < scores.length; i++) {
			System.out.println("第" + (i+1) + "个元素的值" + scores[i]);
		}
	}
}