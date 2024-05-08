public class Work02{
	public static void main(String[] args) {
		
		int[][] map = {{0,0,1},{1,1,1},{1,1,3}};
		
		MyTools p1 = new MyTools();
		
		p1.printArr(map);//使用方法可以无限制使用代码更加简洁
		p1.printArr(map);
		p1.printArr(map);
		
	}
}
class MyTools{
	
	public void printArr(int[][]map) {
		System.out.println("=================");
		
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + "\t");
			}
			System.out.println();
		}
	}
}