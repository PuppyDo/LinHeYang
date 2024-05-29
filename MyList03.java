import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class MyList03{
	public static void main(String[] args) {
		
		
		List list = new ArrayList();
		for(int i = 0; i < 12; i++) {
			list.add("hello" + i);
			
		}
		System.out.println("list = " + list);
		//1号位插入韩顺平教育
		list.add(1,"韩顺平教育");
		System.out.println("list = " + list);
		//获得第五个元素
		System.out.println("第五个元素 = " + list.get(4));
		//删除第六个元素
		list.remove(4);//remove 代表删除字符
		System.out.println("删除第六个元素 " + list);
		//修改第七个元素
		list.set(6, "三国演义");
		System.out.println("修改第七个元素 = " + list);
		
		System.out.println();
		
		//使用迭代器历遍集合 
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			Object obj = iterator.next();
			System.out.println("Object = " + obj);
		}
				
	}
}