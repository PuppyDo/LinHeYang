import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Explosion implements Runnable {
    // 爆炸效果的坐标
    private int x;
    private int y;
    // 爆炸效果的图片资源
    private Image[] images = new Image[8];
    // 是否存活
    private boolean live = true;
    // 爆炸效果的生命周期
    private int index = 0;

    // 构造方法
    public Explosion(int x, int y) {
        this.x = x;
        this.y = y;
        // 初始化爆炸效果的图片资源
        for (int i = 0; i < 8; i++) {
            images[i] = Toolkit.getDefaultToolkit().getImage("explosion/e" + (i + 1) + ".gif");
        }
    }

    // 绘制爆炸效果
    public void draw(Graphics g) {
        if (!live) {
            return;
        }
        // 绘制爆炸效果
        if (index >= 8) {
            live = false;
            return;
        }
        g.drawImage(images[index], x, y, null);
        index++;
    }

    // 爆炸效果的生命周期
    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        live = false;
    }

    // 判断爆炸效果是否存活
    public boolean isLive() {
        return live;
    }
}
