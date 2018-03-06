package zajecia3;

import java.awt.Graphics;

public abstract class Figure {
	
	protected double x,y;
	
	public Figure(){
		this(0,0);
	}
	
	public Figure(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public abstract void  rotate(double angle);
	
	public abstract void scale(double s);
	
	public abstract void draw(Graphics g );
	
	public void move (double X, double Y){
		x+=X;
		y+=Y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	

}
