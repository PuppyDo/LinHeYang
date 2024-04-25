public class Break02{
	public static void main(String[] args) {
		
	int sum = 0;
	int n = 0;
	for(int i = 0; i<+100; i ++) {
		sum += i;
		if(sum >20) {
			System.out.println("和>20的时候 当前数i = " + i);
			n = i;
			break;
			}
		}
		System.out.println("当前数是 " + n);
	}
}