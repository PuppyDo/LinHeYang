import java.util.Scanner;
public class If02{
	public static void main(String[] args) {
		
		//1.接收输入的年龄，定义一个Scanner 对象
		//2.把年龄保存到一个 int age
		//3.使用if 判断，输出对应信息
		//4.使用else 判断 flase的输出信息
		
		Scanner myScanner =  new Scanner(System.in);
		System.out.println("请输入年龄");
		int age = myScanner.nextInt();
		if(age > 18) {
			System.out.println("你年龄大于18，要对自己的行为负责，送入监狱");
		}
		else {
		System.out.println("你的年龄不大这次放过你了");
		}
		System.out.println("程序继续....");
	}
}