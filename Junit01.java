import java.util.*;
public class Junit01{
	public static void main(String[] args) {
	
			
			//给T指定类型是User
			DAO<User> dao = new DAO<>();
			dao.save("001",new User(1,10,"jack"));
			dao.save("002",new User(2,18,"king"));
			dao.save("003",new User(3,38,"smith"));
			
			List<User> list = dao. list();
			System.out.println("list = " + list); 
			
			dao.update("003", new User(3,58,"milan"));
			System.out.println("=======================修改后=====================");
			list = dao. list();
			System.out.println("list = " + list); 
			
			dao.delete("001");
			System.out.println("=======================删除后=====================");
			list = dao. list();
			System.out.println("list = " + list); 
			
			
			System.out.println("=======================调出后=====================");
			System.out.println("id = 003" + dao.get("003"));
	}
}
/*创建一个user类
 *创建一个DAO类
 */
