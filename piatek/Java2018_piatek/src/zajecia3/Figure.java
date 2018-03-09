package zajecia3;

import java.awt.*;
/**
 * Created by Krzysztof Podlaski on 09.03.2018.
 */
public abstract class Figure implements GraphicObject {
    protected double x,y;

    public Figure(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(double dx, double dy){
        x+=dx;
        y+=dy;
    }

}
