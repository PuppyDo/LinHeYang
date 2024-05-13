public class Work22{
	public static void main(String[] args) {
		
		String[] strs = {"jack","tom","mary", "mailan"};
		A02 a02 = new A02();
		int index = a02.find(("tom"), strs);
		System.out.println("查找的index = " + index);
	}
}

class A02{
	 
	public int find (String findStr, String[] strs) {
		
		for(int i =0; i < strs.length; i++) {
			if(findStr.equals(strs[i])) {
			return i;
			}
		}

	return - 1;
	}
}