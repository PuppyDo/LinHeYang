import java.util.ArrayList;
import java.util.List;

public class MyList04{
	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add(new Book001("红楼梦","曹雪芹",100));
		list.add(new Book001("西游记","吴承恩",10));
		list.add(new Book001("水浒传","施耐庵",19));
		list.add(new Book001("三国","罗贯中",80));
		
		//遍历 排序前
		for(Object o : list) {
			System.out.println(o);
		}
		
		//冒泡排序
		sort(list);
		System.out.println("===========================排序后===========================");
		for(Object o : list) {
			System.out.println(o);
		}
}
	//静态方法
		//要求价格从小到大	
		public static void sort(List list) {
			
			int listSize = list.size();
			for(int i = 0; i < list.size() -1 ; i++) {
				for(int j = 0; j < list.size() - 1 - i; j ++) {
					//取出book对象进行比较
					Book001 book1 = (Book001) list.get(j);
					Book001 book2 = (Book001) list.get(j + 1);
					if(book1.getPrice() > book2.getPrice()) {
						//交换位置
						list.set(j, book2);
						list.set(j + 1, book1);
					}
				}
			}
	}
}