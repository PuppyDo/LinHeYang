public class PloyArray001{
	public static void main(String[] args) {
		
		/*多态数组练习
		 * 创建一个person对象
		 * 创建两个teacher对象  同一放在一个数组
		 * 并调用每一个对象的say方法
		 * 使用； student001 Teacher001  Person001 代码 进行 输出
		 */
		
		Person001[] person = new Person001[5];
		person[0] = new Person001("jack", 20);
		person[1] = new Student001("dady", 18, 100);
		person[2] = new Student001("smith", 19, 30.1);
		person[3] = new Teacher001("scott", 30, 20000);
		person[4] = new Teacher001("king", 50 ,25000);
		
		
		//循环遍历多态数组 调用say
		for(int i = 0; i < person.length; i++) {
			//person[i]编译类型是person 但运行类型根据情况会有转换
			System.out.println(person[i].say());//动态绑定机制
			
			if(person[i] instanceof Student001) {//判断person【i】是不是student
				Student001 student =(Student001)person[i];//向下转型  强转
				student.study();
			}
			else if(person[i] instanceof Teacher001) {
				Teacher001 teacher = (Teacher001)person[i];
				teacher.teach();
			}
			else if(person[i] instanceof Person001) {
				
			}
			else {
				System.out.println("你的类型有误，请进行检查.....");
			}
		}
		
	}
}