import java.util.Scanner;
public class SeqSearch{
	public static void main(String[] args) {
		 //定义一组字符串
		String[] names = {"白眉鹰王","青翼蝠王","紫衫龙王","白眉鹰王"};
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("请输入名字");
		String findName = myScanner.next();
		
		int index = -1;
		for(int i = 0; i < names.length;i++) {
			if(findName.equals(names[i])) { //比较字符串 equals，如果找到名字就是当前元素
				System.out.println("恭喜你找到 " + findName);
				System.out.println("下标为 " + i);
				//把i保存到index
				index = i;
				break;//退出程序
			}
		}
		if(index == -1) {
			System.out.println("sorry,没找到 " + findName);
		}
	}
}