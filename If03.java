import java.util.Scanner;
public class If03{
	public static void main(String[] args) {
		
		Scanner myScanner =  new Scanner(System.in);
		
		System.out.println("请输入您的用户名: ");
		String name = myScanner.next();
		
		System.out.println("请输入您的芝麻信用分: ");
		int grade = myScanner.nextInt();
		
		if(grade >= 1 && grade <= 100) {
				if(grade == 100) {
					System.out.println("信用极好！");
				}
				else if(grade > 80 && grade <= 99) {
					System.out.println("信用优秀！");
				}
				else if(grade >= 60 && grade <= 80){
					System.out.println("信用一般，加油！");
				}
				else {		
					System.out.println("信用不及格建议报警！！！");
				}
			
		}
		else {
			System.out.println("信用分需要再1-100之间，请重新输入：");
		}
		
	}
}