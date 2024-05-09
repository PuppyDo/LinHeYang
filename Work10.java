public class Work10{
	public static void main (String[] args) {
		
		//迷宫游戏
		/*1.用二维数组先创建迷宫 int[][]map = new int【7】【8】
		 * 2.先规定map 数组的元素值：0 表示可以走  1表示有障碍物
		 */
		int[][] map = new int[7][8];
		for(int i = 0; i < 7; i++) {
			map[0][i] = 1;
			map[7][i] = 1;
		}
		for(int i = 0; i < 8; i++) {
			map[i][0] =1;
			map[i][6] =1;
		}
		map[3][1] = 1;
		map[3][2] = 1;
		
		System.out.println("=======当前地图情况======");
		for(int i = 0; i < map.length; i++) {
			for(int j =0; j < map[i].length; j++) {
				System.out.println(map[i][j] + " ");//输出一行
			}
			System.out.println();
		}
		
		//用findWay给老鼠找路
		No t1 = new No();
		t1.findWay(map,1,1);
		System.out.println("\n======找路的情况如下======");
		for(int i = 0; i < map.length; i++) {
			for(int j =0; j < map[i].length; j++) {
				System.out.println(map[i][j] + " ");//输出一行
			}
			System.out.println();
		}
	}	
}

class No{
	//使用递归回溯来解决迷宫问题
	public boolean findWay(int[][] map, int i, int j) {
		if(map[6][5] == 2) {//说明已经找到
			return true;
		}
		else {
			if(map[i][j] == 0) {//当前这个位置0说明可以走
				//假定可以走通
				map[i][j] = 2;
				//进行尝试
				if(findWay(map,i + 1, j)) {//先走下
					return true;
				}
				else if(findWay(map,i,j + 1)) {//右
					return true;
				}
				else if(findWay(map,i - 1, j)) {//上
					return true;
				}
				else if(findWay(map,i, j -1)){//左
					return true;
				}
				else {
					map[i][j] = 3;
					return false;
				}
			}
			else {
				return false;
			}
			
		}
	}
}