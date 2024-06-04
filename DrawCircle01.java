import javax.swing.*;
import java.awt.*;

public class DrawCircle01 extends JFrame {
	//绘图方法
    // 定义一个面板
    public MyPanel01 mp = null;
    public static void main(String[] args) {
        new DrawCircle01();
    }

    public DrawCircle01() {//构造器
        // 初始化面板
        mp = new MyPanel01();
        // 把面板放入窗口（画框）
        this.add(mp);
        // 设置窗口大小
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

// 先定义一个 MyPanel 继承 JPanel，在画板上画图
class MyPanel01 extends JPanel {

    // 说明
    // 1. MyPanel 对象就是一个画板
    // 2. Graphics g 把 g 理解为是一个画笔
    //
    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
      //  g.drawOval(10, 10, 100, 100);
        

        //画各种图像
        //1.画直线
        		//  g.drawLine(10,10,100,100);
        //2.画出矩形边框
        		//	g.drawRect(10,10,100,100);
        //3.画出椭圆
        //4.填充矩形
        		//	g.setColor(Color.blue);
        		//	g.fillRect(10, 10, 100, 100);
        //5.填充椭圆
        		//	g.setColor(Color.red);
        		//	g.fillOval(10, 10, 100, 100);
        //6.画图片
        	//6-1获取图片资源 /bg.png表示在项目根目录去获取 图片资源
        		//	Image image = Toolkit .getDefaultToolkit().getImage(Panel.class.getResource("/bg.png"));
				//	g.drawImage(image, 10, 10,105,221,this);
        //7.画字符串写字
        		        g.setColor(Color.black);//9.设置笔的颜色
        		        g.setFont(new Font("隶书", Font.BOLD,50)); //8.设置画笔的字体
        		        g.drawString("北京你好", 100, 100);
       
    }
    
}
