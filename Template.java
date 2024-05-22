abstract public class Template{//抽象类 模版设计模式
	
	public abstract void job();//抽象方法
	public void calculateTimes() {//实现方法 调用job方法
		
		//得到开始时间
		long start = System.currentTimeMillis();
		job();
		//结束的时间
		long end  = System.currentTimeMillis();
		System.out.println("任务执行时间 " + (end - start));	
	}
}