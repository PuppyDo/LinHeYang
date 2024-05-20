/*java  <=>类 【业务层】
 * 定义house 保存house对象
 * 相应houseview的调用
 * 完成对房屋系统的各种操作
 * 增删改查（create，read，update，delete）
 */
		
public class HouseServic{
	private House[] houses;//保存house对象
	private int houseNums  = 1;//记录多少个房屋信息
	private int idCounter = 1;//id自增长
	
	public  HouseServic(int size) {
		houses = new House[size];//当创建houseservice 对象  制定数组大小
		houses[0] = new House(1,"jack","112","海定区",2000,"未出租");
	}
	
	//find方法返回house对象或者null
	public House findById(int findId) {
		for(int i = 0 ; i < houseNums; i++) {
			if(findId == houses[i].getId()) {
				return houses[i];
			}
		}
		return null;
		
	}
	
	
	//del方法 删除一个 房屋信息
	public boolean del(int delId) {
		//找到删除房屋对应的下标
		int index = -1;
		for(int i  = 0; i < houseNums; i++) {
			if(delId == houses[i].getId()) {//要删除的房屋Id 是数组下标为i的元素
				index = i;//使用index 记录i
			}
		}
		if(index == -1) {//delid数组中不存在
			return false;
		}
		//如果找到 1.
		for(int i = index; i < houseNums -1 ; i++) {
			houses[i] = houses[i + 1];
		}
		houses[--houseNums] = null;//把存在房屋信息的最后一个至空 null
		return true;
	}
	
	
	//add方法添加新对象 返回boolean
	public boolean add(House newHouse) {
		//判断是否可以继续添加
		if(houseNums == houses.length) {//不能再添加了
			System.out.println("数组已满，不能再添加了！");
			return false;
		}
		houses[houseNums++] = newHouse;//新增了一个房屋
		//设计一个id自增长的机制
		newHouse.setId(++idCounter);
		return true;
	}
	
	
	public House[] list() {
		return houses;
	}
	
}