import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;


public class Collections_{
	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add("tom");
		list.add("smith");
		list.add("king");
		list.add("milan");
		list.add("tom");
		
		//reverse（list）将元素进行反转
		Collections.reverse(list);
		System.out.println("list = " + list);
		
		
		//shuffle（list）对元素进行随即排列
		Collections.shuffle(list);
		System.out.println("list = " + list);
		
		
		//sort（list）根据元素的自然顺序指定list集合元素按升序排序
		Collections.sort(list);
		System.out.println("list = " + list);
		
		
		//sort（list Comparator） 长度大小排序
		Collections.sort(list, new Comparator() {
		public int compare(Object o1, Object o2) {
			return((String)o2).length() - ((String)o1).length();
		}
		});
		System.out.println("字符串长度的大小排序 = " + list);
		
		//元素进行交换
		Collections.swap(list,0,1);
			System.out.println("交换后的情况");
			System.out.println("list = " + list);
		
		//自然顺序最大的元素
			System.out.println("自然顺序最大的元素 = " + Collections.max(list));
		
		//返回长度最大的元素
			Object maxObject = Collections.max(list, new Comparator() {
			public int compare(Object o1, Object o2) {
				return((String)o1).length() - ((String)o2).length();
			}
			});
			System.out.println("长度最大的元素 = " + maxObject);
		
		//查看返回指定集合指定元素的出现次数
			System.out.println("tom出现的次数 = " + Collections.frequency(list, "tom"));
			
			
		//将src中的内容赋值到dest中
		ArrayList dest = new ArrayList();
		//为了完成给一个完整的拷贝 需要先给dest赋值 大小和list.size一样
		for(int i = 0; i < list.size(); i++) {
			dest.add("");
		}  
		//拷贝
		Collections.copy(dest, list);
		System.out.println("dest = " + dest);
		
		//将tom替换成汤姆
		Collections.replaceAll(list,"tom","汤姆");
		System.out.println("list的tom替换后 = " + list);
		
	}
}