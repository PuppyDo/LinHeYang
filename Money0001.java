import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Collection;

public class Money0001{
	public static void main(String[] args) {
		
		Map m = new HashMap();
		m.put("jack",650);
		m.put("tom", 1200);
		m.put("smith",2900);
		System.out.println(m);//第一次输出
		
		m.put("jack", 2600);//替换更新jack工资
		System.out.println(m);//第二次重新输出
		
		//对所有员工加薪100元
		//使用keyset
		Set keySet = m.keySet();
		for(Object key : keySet) {
			m.put(key, (Integer)m.get(key) + 100);
		}
		
		System.out.println(m);//第三次加薪后的输出
				
		
		System.out.println("=====================遍历=====================");
		Set entrySet = m.entrySet();
		
		//迭代器
		Iterator iterator = entrySet.iterator();
		while(iterator.hasNext()){
			Map.Entry entry = (Map.Entry)iterator.next();
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}
		
		//遍历所有工资
		System.out.println("=====================遍历=======================");
		Collection values = m.values();
		for(Object value : values) {
			System.out.println("工资 = " + value);
		}
	}
}