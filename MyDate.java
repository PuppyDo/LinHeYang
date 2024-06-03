public class MyDate implements Comparable<MyDate>{
	private int year;
	private int month;
	private int day;
	
	public MyDate(int year,int month,int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
	public String toString() {
	    return String.format("%04d-%02d-%02d", year, month, day);
	}
	
	public int compareTo(MyDate o) {//把对年月天的比较放在这里
        //如果name相同 就比较年龄
        int yearMinus = year - o.getYear();
        if(yearMinus != 0) {
            return yearMinus;
        }
        
        //如果年龄相同就比较月份
        int monthMinus = month - o.getMonth();
        if(monthMinus != 0) {
            return monthMinus;
        }
        
        return day - o.getDay();
	}

}