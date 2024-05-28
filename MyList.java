import java.util.ArrayList;
import java.util.List;

public class MyList {
    public static void main(String[] args) {
    	
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("mary");
        list.add("hsp");
        list.add("tom");
        System.out.println("list = " + list);
        
        System.out.println("您所查找的是 ： " + list.get(3));
        
    }
}
