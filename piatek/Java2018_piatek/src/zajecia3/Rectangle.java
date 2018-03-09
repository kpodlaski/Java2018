package zajecia3;

import java.awt.*;

/**
 * Created by Krzysztof Podlaski on 09.03.2018.
 */
public class Rectangle extends Figure {
    protected double w,h;

    public Rectangle(double x, double y, double w, double h) {
        super(x, y);
        this.w = w;
        this.h = h;
    }

    @Override
    public void scale(double factor) {
        w*=factor;
        h*=factor;
    }

    @Override
    public void draw(Graphics g) {
        g.drawRect((int) x,(int)y,(int)w,(int)h);
    }
}
