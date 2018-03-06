package zaj3;

import java.awt.*;

/**
 * Created by Krzysztof Podlaski on 06.03.2018.
 */
public abstract class Figure {
    protected double x;
    protected double y;
    protected FigureTypes type;

    public Figure(double x, double y, FigureTypes type) {
        this.y = y;
        this.x = x;
        this.type = type;
    }

    public abstract void draw(Graphics g);

    public void move(double X, double Y){
        x+=X;
        y+=Y;
    }

    public abstract void scale(double factor);

    public static void main(String[] args) {
        Figure f = new Circle(12,13,5);
        Circle c = (Circle) f;
        double field = c.field();
        Figure[] figs = new Figure[]
                {c, new Square(1,2,3)};
        f= CompositeFigure.create(1,1,figs);
        f.scale(2);
        System.out.println(c.r);

    }
}
