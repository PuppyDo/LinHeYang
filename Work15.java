public class Work15{
	public static void main(String[] args) {
		
		R t1 = new R();
		System.out.println(t1.ShowScore("milan" , 90.1, 80.0));
		System.out.println(t1.ShowScore("terry" , 90.1, 80.0, 10, 30.5, 70));
	}
}

class R{
	public String ShowScore(String name, double... Scores) {
		double totalScore = 0;
		for(int i = 0; i < Scores.length; i++) {
			totalScore += Scores[i];
		}
		return name + "有" + Scores.length + "门课的成绩总分为 = " +totalScore;
	}
}