public class HomeWork13 {
    public static void main(String[] args) {
        
        Student student = new Student("小明", '男', 15, "00023102");
        student.printInfo();
        
        Teacher teacher = new Teacher("张飞", '男', 30, 5);
        System.out.println("------------------------------------------");
        teacher.printInfo();
        
        // 多态数组 
        Person0001[] persons = new Person0001[4];
        persons[0] = new Student("jack", '男', 10, "0001");
        persons[1] = new Student("Mary", '女', 20, "0002");
        persons[2] = new Teacher("smith", '男', 36, 5);
        persons[3] = new Teacher("Scort", '女', 26, 1);
        
        HomeWork13 homework13 = new HomeWork13();
		homework13.bubbleSort(persons); // 调用静态方法时不需要实例化对象
        
        // 排序后的数组
        System.out.println("---------------------------排序后的数组---------------------------");
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }
        
        //遍历数组 调用test方法
        System.out.println("===================================");
        for (int i = 0; i < persons.length; i++) {//遍历多态数组
        	homework13.test(persons[i]);
        }
    }   
    
    //定义方法 形参为person类型 功能 调用学生的study或教师的teach方法
    //分析这里会使用乡下类型转换 和类型判断
    public void test(Person0001 p) {
    	if( p instanceof Student) {//p的运行类型如果是student
    		((Student) p).study();
    	}
    	else if(p instanceof Teacher){
    		((Teacher) p).teach();
    	}
    	else {
    		System.out.println("do nothing....");
    	}
    }
    
    
    // 方法年龄从高到低
    public static void bubbleSort(Person0001[] persons) {
        Person0001 temp = null;
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < persons.length - 1 - i; j++) {
                // 判断条件 条件可以根据数组变化
                if (persons[j].getAge() < persons[j + 1].getAge()) {
                    temp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;
                }
            }
        }
    }
}