import javax.swing.JPanel;
import java.awt.Graphics;

// 坦克大战的绘图区域
public class MyPanel extends JPanel {
    // 定义我坦克
    Herotank hero = null;

    public MyPanel() {
        hero = new Herotank(100, 100); // 初始化自己的坦克
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750); // 填充矩形 默认黑色
        g.fillRect(hero.getX(), hero.getY(), 30, 30); // 绘制坦克
    }
}
