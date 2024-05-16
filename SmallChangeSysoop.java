/*该类是完成零钱通的各个功能的类
 * 使用OOP（面向对象编程）
 * 对应各个功能的方法 
 */

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSysoop{
	
	//属性
	boolean loop = true;
	Scanner scanner = new Scanner(System.in);
	String key = "";
	
	/*2.完成零钱通明细
	 * （1）可以吧收入消费等属性保存到数组 
	 * （2）可以使用对象
	 * （3）简单的话可以使用String拼接
	 */
	String details = "\t-------------------零钱通明细-------------------";
	
	/* 3.完成入账收益的 完成功能驱动程序猿增加变化和代码
	 * （1）定义变量
	 */
	double money = 0;
	double balance = 0;
	Date date = null;//date 是java.util.Date类型 表示日期
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");//可以用于日期格式化的  代表：年月日分秒
	
	/*4.消费
	 * （1）定义新的变量 保存消费的原因
	 */
	String note = "";
	
	//完成显示菜单
	public void mainMenu() {
		do {
			System.out.println("\n\t===================OOP零钱通菜单===================");
			
			System.out.println("\t\t\t 1 零钱通明细");
			System.out.println("\t\t\t 2 收益入账");
			System.out.println("\t\t\t 3 消     费");
			System.out.println("\t\t\t 4 退     出");
			
			System.out.println("\n");
			
			System.out.println("请输入你的选择（1 -4）:");
			key = scanner.next();
			
			//使用switch 分支控制
			switch(key){
				case "1":
					this.detail();
					break;
					
					
				case "2":
					this.income();
					break;
					
					
				case "3":
					this.pay();
					break;
					
					
				case "4":
				this.exit();
					break;
				default:
					System.out.println("你的选择有误， 请重新选择");
			}
			
		}while(loop) ;
	}
	
	//完成零钱通明细
	public void detail() {
		System.out.println(details);
	}
	
	//完成收益入账
	
	public void income() {
		System.out.println("收益入账金额 : ");
		money = scanner.nextDouble();
		//money 的值范围校验 
		/*（1）找出不正确的金额条件 并给出提示
		 * (2）return结束
		 */
		if(money <= 0) {
			System.out.println("收益金额入账 需要 大于 0");
			return;//退出方法不再执行
		}
		
		balance += money;
		//拼接收益信息到 details
		date = new Date();//获取日期
		details += "\n收益入账\t" + money + "\t" +  sdf.format (date) + "\t余额: " + balance;
	}
	
	//消费
	public void pay() {
		System.out.println("消费金额 : ");
		money = scanner.nextDouble();
		//money 的值范围校验 
		/*（1）找出不正确的金额条件 并给出提示
		 * (2）return结束
		 */
		if(money <= 0 || money > balance) {
			System.out.println("你的消费金额 需要在 0 ～ " + balance);
			return;
		}
		
		System.out.println("消费说明 : ");
		note = scanner.next();
		balance -= money;
		date = new Date();//获取日期
		details += "\n" + note + "\t-" + money + "\t" +  sdf.format (date) + "\t余额: " + balance;
	}
	
	//退出
	public void exit() {
		/*用户输入4退出时 给出提示确定要退出吗 y/n 必须输入正确的y/n
		 * 定义一个变量 choice 接收用户的输入
		 * while + break 来处理收到的输入时y/n
		 */
		String choice = "";
		while(true) {//必须是y or n否则一直循环
			System.out.println("你确定要退出吗？ y/n");
			choice = scanner.next();
			if("y".equals(choice) || "n".equals(choice)) {
				break;
			}
		}
		//当用户退出while后进行判断
		if(choice.equals("y")) {
			loop = false;
		}
	}
}