package chegg;

import java.awt.Color;
import java.awt.*;

import javax.swing.JApplet;

public class Rings extends JApplet{
	public Rings(){}
	public static final int RING_DIAMETER=40;
	public void paint(Graphics canvas){
		super.paint(canvas);
		canvas.setColor(Color.blue);
		canvas.drawOval(0, 0, RING_DIAMETER, RING_DIAMETER);
	}
public static void main(String args[]) {
	
}

}
