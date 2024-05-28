public class Revers{
	public static void main(String[] args) {
		
		String str ="abcdef";
		System.out.println("========交换前========");
		System.out.println(str);
		try {
			str = revers(str,1,4);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			return;
		}
		System.out.println("========交换后========");
		System.out.println(str);
	
}
//要求将指定部分的元素进行变换
//思路分析
/*1.先把String转成 char数组
*/
public static String revers(String str,int start, int end) {
	//对输入的参数做一个验证
			/*1.写出正确情况
			 *2.然后取反
			 */
	if(!(str != null && start >= 0 && end > start && end < str.length())) {
		throw new RuntimeException("参数不正确");
	}
	
	
	
	char[] chars = str.toCharArray();//String进行转换Char
	char temp = ' ';
	for(int i = start, j  = end; i < j; i++, j--) {
		temp = chars[i];
		chars[i] = chars[j];
		chars[j] = temp;
		}
	//使用char重新构建一个String 返回即可
		return new String(chars);
	}
}