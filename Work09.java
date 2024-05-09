public class Work09{
	public static void main (String[] args) {
		
		TT t1 = new TT();
		
		int day = 8;
		int peachNum = t1.peach(day);
		if(peachNum != -1) {
			System.out.println("第 " + day + " 天有 " + peachNum + " 个桃子");
		}
	}
}

class TT{
			//逆退练习
			//猴子有一堆桃子 每天吃一半多一个 到第10天就剩了一个桃子 求最初有多少个桃子
	public int peach(int day) {
			if(day == 10) {//第10天只有一个桃子
				return 1;
			}
			else if (day >= 1 && day <=9) {
				return(peach (day + 1) + 1) * 2 ; 
			}
			else {
				System.out.println("请输入1-10");
				return -1;
			}
		}
}

