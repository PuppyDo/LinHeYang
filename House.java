public class House{
	//编号 房主 电话 地址 状态（出租\已出租）
	private int id;
	private String name;
	private String phone;
	private String address;
	private int rent;
	private String sate;
	
	public House(int id, String name, String phone, String address, int rent, String sate) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.address  = address;
		this.rent = rent;
		this.sate = sate;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String Phone) {
		this.phone = phone;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getRent() {
		return rent;
	}
	public void setRent(int rent) {
		this.rent = rent;
	}
	
	public String getSate() {
		return sate;
	}
	public void setSate(String sate) {
		this.sate = sate;
	}
	
	//为了方便输入信息 进行toString方法
	public String toString() {
		return  id +
				"\t" + name + 
				"\t" + phone + 
				"\t" + address + 
				"\t" + rent + 
				"\t\t" + sate ;
	}

}