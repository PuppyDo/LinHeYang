import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();//未设定编辑就会全部输出
        System.out.println("c = " + c);
        System.out.println("年： " + c.get(Calendar.YEAR));
        System.out.println("月： " + (c.get(Calendar.MONTH) + 1)); // 月份是从0开始的，所以要加1
        System.out.println("日： " + c.get(Calendar.DAY_OF_MONTH));
        System.out.println("小时： " + c.get(Calendar.HOUR_OF_DAY)); // 使用 HOUR_OF_DAY 获取24小时制的小时数
        System.out.println("分钟： " + c.get(Calendar.MINUTE));
        System.out.println("秒： " + c.get(Calendar.SECOND));
        
        
        //Calendar 没有固定的格式化 需要自己设定
        //12小时制
        System.out.println(c.get(Calendar.YEAR) + "年 " +(c.get(Calendar.MONTH) + 1) + "月 " +
        		c.get(Calendar.DAY_OF_MONTH) + "日 " + c.get(Calendar.HOUR) + "点 " +
        		c.get(Calendar.MINUTE) + "分 " +c.get(Calendar.SECOND) + " 秒");
        
        //24小时制 将Calendar.HOUR 改为 Calendar.HOUR_OF_DAY
        System.out.println(c.get(Calendar.YEAR) + "- " +(c.get(Calendar.MONTH) + 1) + "- " +
        		c.get(Calendar.DAY_OF_MONTH) + "- " + c.get(Calendar.HOUR_OF_DAY) + ":" +
        		c.get(Calendar.MINUTE) + ":" +c.get(Calendar.SECOND));
    }
}
