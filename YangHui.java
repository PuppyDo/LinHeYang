public class YangHui{
	public static void main (String[] args) {
		
		int[][] yangHui = new int[10][];
		for(int i = 0; i < yangHui.length; i++) {
			yangHui[i] = new int[i + 1];
			//给每个一维数组（行）赋值
			for(int j = 0; j < yangHui[i].length;j++) {
				
				//每一行的第一个和最后一个元素都是1
				if(j == 0 || j == yangHui[i].length - 1) {
					yangHui[i][j] = 1; 
				}
				else {//中间的元素
					yangHui[i][j] = yangHui[i-1][j] + yangHui[i-1][j-1];
				}
			}
		}
		//输出杨辉三角
		for(int i = 0; i < yangHui.length; i++) {
			for(int j = 0; j < yangHui[i].length; j++) {//遍历输出该行
				System.out.print(yangHui[i][j] + "\t");
			}
			System.out.println();//换行
		}
		
	}
}