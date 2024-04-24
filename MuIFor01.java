import java.util.Scanner;
public class MuIFor01{
	public static void main(String[] args) {
	
	Scanner myScanner = new Scanner(System.in);
	double totalScore = 0;//积累所有学生的成绩
	int passNum = 0;//积累 及格人数
	for(int i = 1; i <= 3; i++) {// i 表示班级
		
		double sum  = 0;//一个班的总分
		for(int j = 1; j <= 5; j++) {//j表示学生
			System.out.println("请数第"+ i +"个班的第" + j + "个学生的成绩");
			double score =myScanner.nextDouble();
			if(score >= 60) {//当学生分数超出60 进行累积人数
				passNum++;
			}
			sum +=score;//累计成绩
			System.out.println("成绩为" + score);
			
			}
		System.out.println("班级总成绩 = " + sum + " 平均分 = " + (sum /5));
		totalScore += sum;
		}
		System.out.println("三个班的总分 = " + totalScore + " 平均分 = " + (totalScore /15));
		System.out.println("三个班及格人数有 ： " + passNum + "人");
	}
}