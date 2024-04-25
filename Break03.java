import java.util.Scanner;
public class Break03{
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		String name = "";
		String passwd = "";
		int chance = 3;//登录一次就减少一次
		for(int i = 1; i <=3; i++) {
			System.out.println("请输入名字：");
			name = myScanner.next();
			System.out.println("请输入密码：");
			passwd = myScanner.next();
			
			if("丁真".equals(name) && "666".equals(passwd)) {//equals 代表对比 比较
				System.out.println("恭喜你登录成！");
				break;
			}
			
			chance--;//减少登陆次数指令
			System.out.println("你还有" + chance +"次登陆机会");
		}
		
		
	}
}