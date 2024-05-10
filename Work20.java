public class Work20{
	public static void main(String[] args) {
		
		L k1 = new L("mary", 20);
		L k2 = new L("Timi", 30);

		System.out.println("p1和p2比较的结果 = " + k1.compareTo(k2));
	}
}
		/*定义Person类，里面有name age属性，并提供compareTo比较方法
		 * 用于判断是否和另一个人相等，提供测试类testPerson用于测试
		 * 名字和年龄一样，就返回true，否则返回false
		 */

		class L{
			String name;
			int age;
			
			//构造器
			public L(String name, int age) {
				this.name = name;
				this.age = age;
			}
			//compareTo比较方法
			public boolean compareTo(L k) {
				//名字 年龄 完全一样
				return this.name.equals(k.name) && this.age == k.age;
					
				}
			}