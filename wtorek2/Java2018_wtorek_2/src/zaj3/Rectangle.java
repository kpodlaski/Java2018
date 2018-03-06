package zaj3;

import java.awt.*;

/**
 * Created by Krzysztof Podlaski on 06.03.2018.
 */
public class Rectangle extends Figure {
    protected double w;
    protected double h;

    public Rectangle(double x, double y, double width, double height) {
        super(y, x,FigureTypes.Rectangle);
        this.w = width;
        this.h = height;
    }

    @Override
    public void draw(Graphics g){
        //Rysowanie
        g.drawRect((int)x, (int)y, (int) w, (int) h);
    }

    @Override
    public void scale(double factor){
        w*=factor;
        h*=factor;
    }
}
