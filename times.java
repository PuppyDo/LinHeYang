/*编写一个times类· 包含属性 name age 构造器，方法say（返回自我介绍字符）
 * 
 */

public class times {
	
	private String name;
	private  int age;
	public times(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String say(){
		return "name  = " + name  + " age = " + age ;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}