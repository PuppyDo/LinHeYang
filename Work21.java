public class Work21 {
    public static void main(String[] args) {
        
        A01 a01 = new A01(); // 创建A01类的对象
        double[] arr = {1,22,109,-1}; // 创建一个double类型的数组
        Double res = a01.max(arr); // 调用A01类中的max方法来计算数组arr的最大值
        if (res != null) {
            System.out.println("arr的最大值 = " + res); // 输出最大值
        } else {
            System.out.println("arr的输入有误,数组不能为空，或者{}"); // 如果数组为空，则输出错误信息
        }
    }
}

// 编写一个代码 定义方法max 实现求某一个double数组的最大值，并返回
/*1.类名 A01
 *2.方法名 max
 *3.形参 (double【】)
 *4.返回值 Double
 */
class A01 {
    public Double max(double[] arr) {
        
        if (arr != null && arr.length > 0) { // 检查数组是否为空 在判断arr是否 >
            
            double max = arr[0]; // 假定第一个元素就是最大值
            for (int i = 1; i < arr.length; i++) {
                if (max < arr[i]) {
                    max = arr[i]; // 更新最大值
                }
            }
            return max; // 返回最大值
        } else {
            return null; // 如果数组为空，则返回负无穷大
        }
    }
}
