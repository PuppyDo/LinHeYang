public class HomeWork00002{
	public static void main(String[] args) {
		 String name = "jack";
		 String pwd = "123456";
		 String email = "jack@sohu.com";
		 
		 try {
			 userRegister(name,pwd,email);
			 System.out.println("恭喜你注册成功！");
		 }
		 catch(Exception e){
			 System.out.println(e.getMessage());
		 }
	}
	/*要求
	 * 输入 用户的名字 密码 邮箱
	 * 如果正确 提示注册成功 相反提示失败
	 * 1.用户名长度为 2-4
	 * 2.密码长度为6要求全是数字
	 * 3.邮箱中包含@.com
	 * 4.针对输入内容进行校核 
	 */
	public static void userRegister(String name, String pwd, String email) {
		
		if (!(name != null && pwd != null && email != null)) {
			throw new RuntimeException("输入信息不能为空！请重新输入");
		}
		
		
		/*过关
		 * 第一关
		 */
		int userLength = name.length();
		if(!(userLength >= 2 && userLength <=4)) {
			throw new RuntimeException("用户名长度要求2 - 4位");
		}
		
		//第二关
		if(!(pwd.length() == 6 && isDigital(pwd))) {
			throw new RuntimeException("密码长度为6位，要求全是数字");
		}
		
		//第三关
		int i = email.indexOf('@');
		int j = email.indexOf('.');
		if(!(i > 0 && j > i)) {
			throw new RuntimeException("邮箱中包含@和. 并且@在.的前面");
		}
		
	}
	//单独写一个方法确认密码是不是全数字
		public static boolean isDigital(String str) {
			char[] chars = str.toCharArray();
			for(int i = 0; i < chars.length; i++) {
				if(chars[i] < '0' || chars[i] > '9') {
					return false;
				}
			}
			return true;
		}
}