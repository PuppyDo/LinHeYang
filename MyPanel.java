import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

// 坦克大战的绘图区域
public class MyPanel extends JPanel implements KeyListener{
    // 定义我坦克
    Herotank hero = null;
    
    //定义敌人的坦克
    Vector<EnemyTank> enemyTanks = new Vector<>();
    int enemyTankSize = 3;
    public MyPanel() {
    	// 初始化自己的坦克
        hero = new Herotank(100, 100); 
        
        //初始化敌人坦克
        for(int i = 0 ; i < enemyTankSize; i++) {
        	EnemyTank enemyTank = new EnemyTank(100 * (i + 1), 0);
        	//设置方向
        	enemyTank.setDirect(2);
        	//加入
        	enemyTanks.add(enemyTank);
        }
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750); // 填充矩形，默认黑色
        
        //画出自己的坦克封装
        drawTank(hero.getX(), hero.getY(), g, hero.getDirect(), 0);
        
        //敌人的坦克
        for(int i = 0 ; i < enemyTanks.size();i++) {
        	//输出（显示）坦克
        	EnemyTank enemyTank = enemyTanks.get(i);
        	drawTank(enemyTank.getX(),enemyTank.getY(),g,enemyTank.getDirect(),1);
        }
    }
    
    /*编写方法 画出坦克
     * x 坦克左上角x坐标
     * y 坦克左上角y坐标
     * g 画笔
     * direct 坦克方向
     * type  坦克类型
     */
    public void drawTank(int x, int y, Graphics g, int direct, int type) {
    	
    	switch(type) {
    		case 0: // 自己的坦克
    			g.setColor(Color.cyan);
    			hero.setSpeed(30);
    			break;
    		case 1: // 敌人坦克
    			g.setColor(Color.yellow);
    			break;
    	}
    	
    	// 根据坦克方向来绘制坦克
    	switch(direct) {
    		case 0: // 向上
    			g.fill3DRect(x, y, 10, 60, false); // 画出坦克左边的轮子
    			g.fill3DRect(x + 30, y, 10, 60, false); // 画出坦克右边的轮子
    			g.fill3DRect(x + 10, y + 10, 20, 40, false); // 画出坦克的盖子
    			g.fillOval(x + 10, y + 20, 20, 20); // 画出坦克的原盖
    			g.drawLine(x + 20, y + 30, x + 20, y); // 画出坦克的炮筒
    			break;
    			
    		case 1: // 向右
    		    g.fill3DRect(x, y, 60, 10, false); // 画出坦克上面的轮子
    		    g.fill3DRect(x, y + 30, 60, 10, false); // 画出坦克下面的轮子
    		    g.fill3DRect(x + 10, y + 10, 40, 20, false); // 画出坦克的盖子
    		    g.fillOval(x + 20, y + 10, 20, 20); // 画出坦克的圆形盖子
    		    g.drawLine(x + 30, y + 20, x + 60, y + 20); // 画出坦克的炮筒
    		    break;
    		    
    		case 2: // 向下
    		    g.fill3DRect(x, y, 10, 60, false); // 画出坦克左边的轮子
    		    g.fill3DRect(x + 30, y, 10, 60, false); // 画出坦克右边的轮子
    		    g.fill3DRect(x + 10, y + 10, 20, 40, false); // 画出坦克的盖子
    		    g.fillOval(x + 10, y + 20, 20, 20); // 画出坦克的圆形盖子
    		    g.drawLine(x + 20, y + 30, x + 20, y + 60); // 画出坦克的炮筒
    		    break;
    		    
    		case 3: // 向左
    		    g.fill3DRect(x, y, 60, 10, false); // 画出坦克上面的轮子
    		    g.fill3DRect(x, y + 30, 60, 10, false); // 画出坦克下面的轮子
    		    g.fill3DRect(x + 10, y + 10, 40, 20, false); // 画出坦克的盖子
    		    g.fillOval(x + 20, y + 10, 20, 20); // 画出坦克的圆形盖子
    		    g.drawLine(x + 30, y + 20, x, y + 20); // 画出坦克的炮筒
    		    break;
    			
    		default:
    			System.out.println("暂时没有处理的方向");
    			break;
    	}
    }
  //当字符输出时 方法会被触发
  @Override
  public void keyTyped(KeyEvent e) {
  }

  // 当某个键按下 该方法会被触发
  @Override
  public void keyPressed(KeyEvent e) {
      
  	//根据用户按下的不同键，来处理坦克的移动（wdsa键）
  	//java会给每个键分配一个code
  	//keycode就是向下的箭头对应code
  	if(e.getKeyCode() == KeyEvent.VK_W) {//向上
  		hero.setDirect(0);
  		hero.moveUp();
  	}
  	
  	else if(e.getKeyCode() == KeyEvent.VK_D){//向右
  		hero.setDirect(1);
  		hero.moveRight();
  	}
  	
  	else if (e.getKeyCode() == KeyEvent.VK_S) {//向下
  		hero.setDirect(2);
  		hero.moveDown();
  	}
  	
  	else if(e.getKeyCode() == KeyEvent.VK_A) {//向左
  		hero.setDirect(3);
  		hero.moveLeft();
  	}
  	
  	//输出按键后 面板重新绘制
  	this.repaint();
  	
  }

@Override
public void keyReleased(KeyEvent e) {
    // 在键盘按键释放时触发的操作
    // 在这里你可以添加释放键的逻辑，如果需要的话
	}
}
