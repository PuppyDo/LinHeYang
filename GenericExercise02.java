import java.util.*;
public class GenericExercise02{
	public static void main(String[] args) {
		
		ArrayList<Employee001 > employees = new ArrayList<>();
		employees.add(new Employee001("tom",20000, new MyDate(1980,12,11)));
		employees.add(new Employee001("jack",12000, new MyDate(2001,12,12)));
		employees.add(new Employee001("tom",50000, new MyDate(1980,12,10)));
		
		System.out.println("employees = " + employees);
			
		System.out.println("============对雇员进行排序============");
		employees.sort(new Comparator<Employee001>() {
		    public int compare(Employee001 emp1, Employee001 emp2) {
		        //先按照name排序 如果name 相同 则按照生日的先后进行排序
		        if(!(emp1 instanceof Employee001 && emp2 instanceof Employee001)) {
		            System.out.println("类型不正确.....");
		            return 0;
		        }
		        //比较name
		        int i = emp1.getName().compareTo(emp2.getName());
		        if(i != 0) {
		            return i;
		        }
		        
		        //下面是对birthday进行比较 因此最好把这个比较放在Mydate完成
		        return emp1.getBirthday().compareTo(emp2.getBirthday());
		    }
		});


		
				System.out.println("============对雇员进行排序============");
				System.out.println(employees);
	}
}