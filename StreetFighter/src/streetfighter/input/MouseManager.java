package streetfighter.input;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseManager implements MouseListener,MouseMotionListener{
	
	private boolean leftPressed,rightPressed;
	private int mouseX,mouseY;
	
	public MouseManager() {
		
	}

	public  boolean isLeftPressed() {
		return leftPressed;
	}
	
	public boolean isRightPressed() {
		return rightPressed;
	}
	
	public int getMouseX() {
		return mouseX;
	}
	
	public int getMouseY() {
		return mouseY;
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		mouseX=e.getX();
		mouseY=e.getY();
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		//Click izquierdo
		if(e.getButton()==MouseEvent.BUTTON1) {
			leftPressed=true;
		}
		//Click derecho
		else if(e.getButton()==MouseEvent.BUTTON3) {
			rightPressed=true;
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		//Click izquierdo
				if(e.getButton()==MouseEvent.BUTTON1) {
					leftPressed=false;
				}
				//Click derecho
				else if(e.getButton()==MouseEvent.BUTTON3) {
					rightPressed=false;
				}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
