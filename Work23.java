public class Work23{
	public static void main(String[] args) {
		
		Book book = new Book("神雕侠侣",120);
		book.info();
		book.updatePrice();//更新价格
		book.info();
		
	}
}

/*实现更改某本书的价格
 * 如果价格 >150 则改为150 若果价格 >100 则改为100
 * 1.属性 price name
 * 2.方法名 updatePrice
 * 形参（）
 * 返回值void
 * 提供一个构造器
 */
class Book{
	String name;
	double price;
	public  Book(String name, double price) {
		this.name = name;
		this.price = price;
	}
	public void updatePrice() {
		//如果方法中 没有price局部变量 this.price 等价price
		if(this.price > 150) {
			this.price = 150;
		}
		else if(this.price >100){
			this.price = 100;
		}
	}
	//显示书籍情况
	public void info() {
		System.out.println("书名 = " + this.name + "价格 = " + this.price);
	}
}
