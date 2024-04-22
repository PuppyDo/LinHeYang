import java.util.Scanner;//表示把java.until下的Scanner类导入
public class First{
	public static void main (String[] args) {
		
		//演示接受用户的输入
		//步骤	1.引入 Scanner类的包
		//		2.创建 Scanner对象 ，new创建一个对象，体会
		//		myScanner 就是Scanner类的对象
		
		Scanner myScanner = new Scanner(System.in);
		//		3.接收用户的输入
		System.out.println("请输入名字");
		String name = myScanner.next();
		System.out.println("请输入年龄");
		int age = myScanner.nextInt();
		System.out.println("请输入薪水");
		double sal = myScanner.nextDouble();
		System.out.println("人的信息如下：");
		System.out.println("名字 = " + name + "\n"  + 
				"年龄 = " + age + "\n" + "薪水 = " + sal);
		
	}
}