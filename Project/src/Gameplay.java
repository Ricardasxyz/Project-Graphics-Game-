import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Gameplay extends JPanel implements KeyListener, ActionListener {

	private boolean play = false;
	private int score = 0;

	private int totalBricks = 21;

	private Timer timer;
	private int delay = 10;

	private int playerx = 310;

	private int ballposX = 120;
	private int ballposY = 350;
	private int ballxdir = -1;
	private int ballydir = -2;

	public Gameplay() {
		addKeyListener(this);// leidzia KeyListener naudotis
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);

		timer = new Timer(delay, this);
		timer.start();
	}

	public void paint(Graphics g) { // background
		g.setColor(Color.black);
		g.fillRect(1, 1, 692, 592);

		// borders
		g.setColor(Color.yellow);
		g.fillRect(0, 0, 3, 592);
		g.fillRect(0, 0, 692, 3);
		g.fillRect(691, 0, 3, 592);

		// paddle
		g.setColor(Color.red);
		g.fillRect(playerx, 550, 100, 8);

		// the ball
		g.setColor(Color.yellow);
		g.fillOval(ballposX, ballposY, 20, 20);
		
		g.dispose();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		timer.start();
	
			if(play){
				if(new Rectangle(ballposX, ballposY, 20, 20).intersects(new Rectangle(playerx,550,100,0))){
					ballydir = -ballydir; //nesuranda ball ir paddle 
				}
			
			ballposX += ballxdir;
			ballposY += ballydir;
			if(ballposX < 0){
				ballxdir = -ballxdir;
			}
			if(ballposY < 0){
				ballydir = -ballydir;
			}
			if(ballposX > 670){
				ballxdir = -ballxdir;
			}

		}
		repaint();
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			if (playerx >= 600) {
				playerx = 600;
			} else {
				moveRight();
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			if (playerx < 10) {
				playerx = 10;
			} else {
				moveLeft();
			}
		}
	}

	public void moveRight() {
		play = true;
		playerx += 20;
	}

	public void moveLeft() {
		play = true;
		playerx -= 20;
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

}
