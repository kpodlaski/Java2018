package zajecia2;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class SimulationScreen extends JPanel {

	public int x=20,y=30;
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.setColor(Color.RED);
		g.fillOval(x, y, 40, 40);
		g.setColor(Color.BLUE);
		g.drawLine((int)1.5*x, 2*y, 90, 40);
		
	}

}
