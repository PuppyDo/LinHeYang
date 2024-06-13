import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TankGame extends JFrame {

    private MyPanel01 panel;

    public static void main(String[] args) {
        // 在这里设置游戏类型，例如："1" 表示新游戏，"2" 表示继续上局
        String gameType = "1"; // 这里可以根据需要修改
        new TankGame(gameType);
    }

    public TankGame(String gameType){
        // 将panel放入到thread中
        this.panel = new MyPanel01(gameType);

        // 将面板放入到线程中，并启动线程
        Thread panelThread = new Thread(panel);
        panelThread.start();

        // 设置键盘监听器
        this.addKeyListener(panel);
        setFocusable(true);

        // 添加 MyPanel01 到窗口中
        this.add(panel, BorderLayout.CENTER); // 将面板添加到中心位置

        // 设置窗体关闭
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 获取当前屏幕分辨率
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;
        // 设置窗体大小不可变
        this.setResizable(false);
        // 设置窗体位置
        width = (width - 1300) / 2;
        height = (height - 750) / 2;
        this.setBounds(width, height, 1300, 750);
        this.setBackground(Color.black);
        // 设置窗体显示
        this.setVisible(true);

        // 在JFrame 中增加相关关闭窗口的处理
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Recorder.keepRecord();
                System.exit(0);
            }
        });
    }
}





