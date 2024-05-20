import java.util.Scanner;

public class HomeView{
	
	private boolean loop = true;//控制显示菜单
	private char key = ' ';//接收用户选择的菜单
	private HouseServic houseServic = new HouseServic(2);
	
	//根据id修改房屋信息
	public void update() {
		System.out.println("===================修改房屋信息===================");
		System.out.println("请选择待修改房屋编号(-1表示退出): ");
		 Scanner scanner = new Scanner(System.in); // 创建 Scanner 对象
			int updateId = scanner.nextInt();
			scanner.nextLine();
		if(updateId == -1) {
			System.out.println("================你放弃修改房屋信息================");
			return;
		}
		
		House house = houseServic.findById(updateId);
		if (house == null) {
		    System.out.println("=============要修改的房屋信息ID不存在=============");
		    return;
		}
		System.out.print("姓名(" + house.getName() + "): \n");
		String name = scanner.nextLine(); // 提示用户输入姓名
		
		if (!name.isEmpty()) { // 如果用户输入了内容，则修改
		    house.setName(name);
		}

		scanner.nextLine(); // 清除缓冲区

		System.out.print("电话(" + house.getPhone() + "): \n");
		String phone = scanner.nextLine(); // 提示用户输入电话
		if (!phone.isEmpty()) { // 如果用户输入了内容，则修改
		    house.setPhone(phone);
		}

		System.out.print("地址(" + house.getAddress() + "): \n");
		String address = scanner.nextLine(); // 提示用户输入地址
		if (!address.isEmpty()) { // 如果用户输入了内容，则修改
		    house.setAddress(address);
		}

		System.out.print("租金(" + house.getRent() + "): \n");
		String rentInput = scanner.nextLine(); // 提示用户输入租金
		if (!rentInput.isEmpty()) { // 如果用户输入了内容，则修改
		    try {
		        int rent = Integer.parseInt(rentInput);
		        house.setRent(rent);
		    } catch (NumberFormatException e) {
		        System.out.println("请输入有效的整数作为租金。");
		    }
		}

		System.out.print("状态(" + house.getSate() + "): \n");
		String state = scanner.nextLine(); // 提示用户输入状态
		if (!state.isEmpty()) { // 如果用户输入了内容，则修改
		    house.setSate(state);
		}

		System.out.println("===================修改房屋信息成功===================");
	}
	
	//根据Id查找信息
	public void findHouse() {
		System.out.println("===================查找房屋信息===================");
		System.out.println("请输入要查找的ID: ");
		 Scanner scanner = new Scanner(System.in); // 创建 Scanner 对象
		int findId = scanner.nextInt();
		//调用方法
		House house = houseServic.findById(findId);
		if(house != null) {
			System.out.println(house);
		}
		else {
			System.out.println("=====================查找房屋信息id不存在======================");
		}
	}
	
	
	//编写delHouse 接收输入的ID 调用Service 的del方法
	public void delHouse() {
		System.out.println("===================删除房屋信息===================");
		System.out.println("请输入待删除房屋的编号(-1退出):======================");
		 Scanner scanner = new Scanner(System.in); // 创建 Scanner 对象
		int delId = scanner.nextInt();
		if(delId == -1) {
			System.out.println("================放弃删除房屋信息=================");
			return;
		}
	    System.out.println("请确认是否删除【Y/N】,请小心选择: ");
	    String confirm = scanner.next();
	    if (confirm.equalsIgnoreCase("Y")) {
	        // 调用 Service 的删除方法，假设 service 是你的服务实例
	        if(houseServic.del(delId)) {
	            System.out.println("房屋信息已成功删除");
	        }
	    } 
	    else if(confirm.equalsIgnoreCase("N")){
	        System.out.println("取消删除房屋信息。");
	    } else {
	        System.out.println("您所输入的房间号不存在");
	    }
	}
	
	
	//编写addhouse 接收输入 创建house对象 调用add方法
	public void addHouse() {
	    System.out.println("======================添加房屋======================");
	    Scanner scanner = new Scanner(System.in); // 创建 Scanner 对象
	    System.out.print("姓名：");
	    String name = scanner.next();
	    if (name.length() > 8) {
	        System.out.println("姓名最多8个字符，请重新输入。");
	        return; // 重新输入
	    }
	    
	    System.out.print("电话：");
	    String phone = scanner.next();
	    if (phone.length() > 12) {
	        System.out.println("电话最多12个字符，请重新输入。");
	        return; // 重新输入
	    }
	    
	    System.out.print("地址：");
	    String address = scanner.next();
	    if (address.length() > 16) {
	        System.out.println("地址最多16个字符，请重新输入。");
	        return; // 重新输入
	    }
	    
	    System.out.print("月租：");
	    int rent = scanner.nextInt();
	    
	    System.out.print("状态：");
	    String state = scanner.next();
	    if (state.length() > 3) {
	        System.out.println("状态最多3个字符，请重新输入。");
	        return; // 重新输入
	    }
	    
	    // 创建一个新的 house 对象  
	    House house = new House(0, name, phone, address, rent, state);
	    if (houseServic.add(house)) {
	        System.out.println("=====================添加房屋成功了=====================");
	    } else {
	        System.out.println("=====================添加房屋失败了=====================");
	    }
	}

	//显示房屋列表
	public void ListHouse() {
		System.out.println("===========================房屋列表===========================");
		System.out.println("编号\t房主\t电话\t地址\t月租\t状态（未出租 / 已出租）");
		House[] houses = houseServic.list();
		for(int i = 0 ; i < houses.length; i++) {
			if(houses[i] == null) {
				break;
			}
			System.out.println(houses[i]);
		}
		
		System.out.println("========================房屋列表显示完毕=======================");
	}
	
	public void mainMenu() {
		
		Scanner scanner = new Scanner(System.in); // 创建Scanner对象
		
		do {
			System.out.println("\n=========================房屋出租系统=========================");
			System.out.println("\t\t\t1 新 增 房 源");
			System.out.println("\t\t\t2 查 找 房 屋");
			System.out.println("\t\t\t3 删 除 房 屋 信 息");
			System.out.println("\t\t\t4 修 改 房 屋 信 息 ");
			System.out.println("\t\t\t5 房 屋 列 表");
			System.out.println("\t\t\t6 退      出");
			System.out.print("请输入你的选择（1 ～ 6）: ");
			 key = scanner.next().charAt(0); // 获取用户输入的字符
			 
			switch(key){
				case '1' :
					addHouse();
					break;
					
				case '2' :
					findHouse();
					break;
					
				case '3' :
					delHouse();
					break;
					
				case '4' :
					update();
					break;
					
				case '5' :
					ListHouse();
					break;
					
				case '6' :
					 System.out.println("请确认是否删除【Y/N】,请小心选择: ");
					    String confirm = scanner.next();
					    if (confirm.equalsIgnoreCase("Y")) {
					    	loop = false;
					        }
					
					break;
			}
		}while(loop) ;
	}
}