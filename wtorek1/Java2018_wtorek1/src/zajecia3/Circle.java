package zajecia3;

import java.awt.Graphics;
import java.util.Comparator;

public class Circle extends Figure {

	protected double r;
	
	public Circle(double r){
		super(); //konstruktor bezargumentowy rodzica
		this.r=r;
	}
	
	public Circle(double x, double y, double r){
		super(x,y); //konstruktor 2 argumentowy rodzica
		this.r=r;
	}
	
	@Override
	public void rotate(double angle) {
		return;
	}

	@Override
	public void scale(double s) {
		// TODO Auto-generated method stub
		r=r*s;
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		//x,y œrodek okrêgu a nie wsp. bounding box
	}

	public double field() { return Math.PI*r*r;};
	public double perimeter() {return 2*Math.PI*r;};
	
	public MathematicalFigure asMathematicleFigure(){
		return new MathematicalFigure() {
			
			@Override
			public double perimeter() {
				return Circle.this.perimeter();
			}
			
			@Override
			public double fied() {
				// TODO Auto-generated method stub
				return Circle.this.field();
			}

			@Override
			public void scale(double x) {
				Circle.this.scale(x);
			}
		};
	}
	
	public CircleComparator getComparator(){
		return new CircleComparator();
	}
	
	public Comparator<Circle> getDecreasingComparator(){
		return new Comparator<Circle>(){

			@Override
			public int compare(Circle o1, Circle o2) {
				// TODO Auto-generated method stub
				return (int) (-o1.r+o2.r);
			}
			
		};
	}
	
	private class CircleComparator implements Comparator<Circle>{

		@Override
		public int compare(Circle o1, Circle o2) {
			// TODO Auto-generated method stub
			return (int) (o1.r-o2.r);
		}
		
		public String toString(){
			return " Comparator "+r;
		}
		
	}
	
	public static void main(String[] s){
		Figure f = new Circle(1,2,12);
		Circle c2 = new Circle(2,3,17);
		
		CircleComparator cc = c2.getComparator();// c2.new CircleComparator();
		System.out.println(cc.compare(c2, (Circle) f));
		Comparator<Circle> cc2 = c2.getDecreasingComparator();
		System.out.println(cc2);
		
		MathematicalFigure mf = c2.asMathematicleFigure();
		mf.scale(2);
		System.out.println(c2.r);
	}
	
}


