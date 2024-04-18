public class HomeWork7{
	public static void main (String[] args) {
		
		char c1 = 97;//输出数字相对应的字母
		System.out.println(c1);
		
		char c2 = 'a';//输出a对应的 数字 
		System.out.println((int)c2);//必须加int  如果说没有 int 输出的只能是字符‘a'
		
		char c3 ='韩';
		System.out.println((int)c3);//对应数字38889
		
		char c4 =38889;
		System.out.println(c4);//对应汉字 韩
		
		System.out.println('a' + 10);//可以作为数字进行计算
		
		char c5 = 'b' + 1;//b(98) + 1 = 99
		System.out.println((int)c5);//99
		System.out.println(c5);//显示编码表对应的 字母或汉字等
		
	}
}