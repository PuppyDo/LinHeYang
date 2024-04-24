import java.util.Scanner;
public class Switch03{
	public static void main (String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入你的分数");
		double score = myScanner.nextDouble();
		
	if(score >=0 && score <=100) {
		switch((int)(score / 60)) {
			case 0 :
				System.out.println("不合格");
			break;
			case 1 :
				System.out.println("合格");
			break;
			}
		}
	else {
		System.out.println("输入的成绩要在1-100之间");
		}
	}
}