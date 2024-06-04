import javax.swing.*;

public class HspTankGame extends JFrame {
    
    // 定义一个Panel
    MyPanel mp = null;
    
    public static void main(String[] args) {
        new HspTankGame();
    }
    
    public HspTankGame() {
        mp = new MyPanel();
        this.add(mp); // 面版就是游戏的绘图区域
        this.setSize(1000, 750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
