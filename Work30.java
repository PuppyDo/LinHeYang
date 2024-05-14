public class Work30{
	public static void main(String[] args) {
		
		Work30 account = new Work30();
		account.setName("jack");
		account.setBalance(60);
		account.setPwd("123456");
		
		account.showInfo();
		
	}
		private String name;
		private double balance;
		private String pwd;
		
		//提供两个构造器
		public Work30() {//无参构造器
			
		}
		
		public Work30(String name, double balance, String pwd) {//有参构造器
			this.setName(name);
			this.setBalance(balance);
			this.setPwd(pwd);
		}
		
		
		public String getName() {
			return name;
		}
		//名字长度必须为2--4位
		public void setName(String name) {
			if(name.length() >= 2 && name.length() <=4) {
				this.name = name;
			}
			else {
				System.out.println("姓名要求（长度为2位3位或4位）默认值 无名");
				 	this.name ="无名";
			}
		}
		
		public double getBalance() {
			return balance;
		}
		
		public void setBalance(double balance) {
			if(balance > 20) {//余额必须 > 20
			this.balance = balance;
			}
			else {
				System.out.println("余额必须大于20 默认为0");
			}
		}
		
		public String getPwd() {
			return pwd;
		}
		
		public void setPwd(String pwd) {
			if(pwd.length() == 6) { //密码必须是6位
			this.pwd = pwd;
			}
			else {
				System.out.println("密码必须是6位 默认密码000000");
				this.pwd = "000000";
			}
	}
		public void showInfo() {

				System.out.println("账号信息 name = " + name + " 余额 = " + balance + " 密码 " + pwd);

		
	}
}