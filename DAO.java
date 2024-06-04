import java.util.*;

public class DAO<T>{
	private Map<String, T>map = new HashMap<>();
	
	public T get (String id) {
		return map.get(id);
	}
	public void update(String id,T entity) {
		map.put(id, entity);
	}
	
	// 将 map 的所有 value（entity）封装为 ArrayList 并返回
	
	public List<T> list(){
		// 创建一个 ArrayList 用于存储结果
		List<T> list = new ArrayList<>();
		
		 // 遍历 map 中的键集合
		Set<String> keySet =map.keySet();
		for(String key : keySet) {
			//返回的结果结果是User对象---》ArrayList
			list.add(get(key));
		}
		
		return list;
	}
		// 删除指定 id 的对象
		public void delete(String id) {
			map.remove(id);
		}
		// 将指定的 id 和对象保存到 map 中
		public void save(String id,T entity) {//把entity保存到map
			map.put(id, entity);
			
		}
}