import java.util.Scanner;
public class doWhile02{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		char answer = ' '; 
		do {
			System.out.println("催债大哥使出乌鸦坐飞机");
			System.out.println("催债大哥问：还钱吗？y/n");
			answer = myScanner.next().charAt(0);
			System.out.println("他的回答是" + answer);

		}
		while(answer != 'y');
		
		System.out.println("算你识相！下次早点还");

	}
}