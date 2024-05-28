import java.util.ArrayList;
import java.util.List;

public class MyList02{
	public static void main(String[] args) {
		
	      List list = new ArrayList();
	        list.add("张三峰");
	        list.add("贾宝玉");
	        list.add(1,"韩顺平");
	        System.out.println("list = " + list);
	        
	        
	        //list插入功能练习
	        List list2 = new ArrayList();
	        list2.add("jack");
	        list2.add("Tom");
	        list.addAll(1,list2);
	        System.out.println("list = " + list);
	        
	        //利用list进行查找
	        System.out.println(list.indexOf("Tom"));  
	        
	        //查找属性并将其移到末尾
	        list.add("韩顺平");
	        System.out.println("list = " + list);
	        System.out.println(list.lastIndexOf("韩顺平"));  
	        
	        //删除指定属性 并输出结果
	        list.remove(0);
	        System.out.println("list = " + list);

	}
}