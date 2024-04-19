public class AirthmeticOperator2{
	public static void main(String[] args) {
		
		//需求
		//假如还有59天放假，问；合xx个星期零xx天
		
		int j = 25911;
		int x = j / 7;
		int t = j % 7;//余数运用
		
		System.out.println(j + "天 合" + x + 
							"个星期零" + t + "天" );
		
	}
}