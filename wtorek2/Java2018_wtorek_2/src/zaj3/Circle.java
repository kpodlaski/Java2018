package zaj3;

import java.awt.*;

/**
 * Created by Krzysztof Podlaski on 06.03.2018.
 */
public class Circle extends Figure {
    protected double r;

    public Circle(double x, double y, double r) {
        super(x, y,FigureTypes.Circle);
        this.r = r;
    }

    @Override
    public void draw(Graphics g) {
        g.drawOval((int)x,(int)y,
                (int)r,(int) r);
    }

    @Override
    public void scale(double factor) {
        r*=factor;
    }

    public double field() {
        return Math.PI*r*r;
    }
}
