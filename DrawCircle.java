import javax.swing.*;
import java.awt.*;

public class DrawCircle extends JFrame {
	//绘图方法
    // 定义一个面板
    public MyPanel mp = null;
    public static void main(String[] args) {
        new DrawCircle();
    }

    public DrawCircle() {//构造器
        // 初始化面板
        mp = new MyPanel();
        // 把面板放入窗口（画框）
        this.add(mp);
        // 设置窗口大小
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

// 先定义一个 MyPanel 继承 JPanel，在画板上画图
class MyPanel extends JPanel {

    // 说明
    // 1. MyPanel 对象就是一个画板
    // 2. Graphics g 把 g 理解为是一个画笔
    //
    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(10, 10, 100, 100);
    }
}
