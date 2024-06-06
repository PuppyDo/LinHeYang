//import javax.swing.JFrame;
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.KeyEvent;
//import java.awt.event.KeyListener;
//
//public class BallMove extends JFrame{//窗口
//	
//	MyPanel mp = null;
//	public static void main(String[] args) {
//		BallMove ballMove = new BallMove();
//	}
//	
//	//构造器
//	public BallMove() {
//		mp = new MyPanel();
//		this.add(mp);
//		this.setSize(400 , 300);
//		this.addKeyListener(mp);
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		this.setVisible(true);
//		
//	}
//}
////面板 画出小球
////KeyListener 可以监管键盘的操作
//class MyPanel extends JPanel implements KeyListener {
//	
//	//为了让小球可以移动 把左上角的坐标型(x,y)做成变量
//	int x = 10;
//	int y = 10;
//    public void paint(Graphics g) {
//        super.paint(g);
//        g.fillOval(x, y, 20, 20);// 默认黑色
//    }
//
//    // 当字符输出时 方法会被触发
//    @Override
//    public void keyTyped(KeyEvent e) {
//    }
//
//    // 当某个键按下 该方法会被触发
//    @Override
//    public void keyPressed(KeyEvent e) {
//        //System.out.println((char) e.getKeyCode() + "被按下....");
//    	//根据用户按下的不同键，来处理小球的移动（上下左右键）
//    	//java会给每个键分配一个code
//    	//keycode就是向下的箭头对应code
//    	if(e.getKeyCode() == KeyEvent.VK_DOWN) {
//    		y++;
//    	}
//    	
//    	else if(e.getKeyCode() == KeyEvent.VK_UP){
//    		y--;
//    	}
//    	
//    	else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
//    		x--;
//    	}
//    	
//    	else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
//    		x++;
//    	}
//    	
//    	//输出按键后 面板重新绘制
//    	this.repaint();
//    	
//    }
//
//    // 当某个键松开了 会被触发
//    @Override
//    public void keyReleased(KeyEvent e) {
//    }
//}