public class Work12{
	public static void main(String[] args) {
		
		Niu method = new Niu();
		
	System.out.println(method.max(10,24));	
	System.out.println(method.max(10.0,21.4));	
	System.out.println(method.max(10.0,1.4,30));	
	
	}
}

class Niu{
	
	public int max(int n1, int n2) {
		return n1 > n2 ? n1 : n2;
	}
	
	public double max(double n1, double n2) {
		return n1 > n2 ? n1 : n2;
	}
	
	public double max(double n1, double n2, int n3) {
		double max1 = n1 > n2 ? n1 : n2;
		return max1 >  n3 ? max1 : n3;
	}

}