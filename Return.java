public class Return{
	public static void main(String[] args) {
		
		double money =100000;
		int count = 0;//计算所过的路口
		while(true) {
			if( money > 50000) {
//				money = money - money *0.05;
				money *= 0.95;//过了路口之后剩余的钱
				count++;
			}
			else if(money >=1000 ) {
				money -=1000;
				count++;
			}
			else {
				break;//金钱不够
			}
		}
		System.out.println("剩余金钱" + money + "\n100000可以过" + count + "个路口");
	}
}