package zajecia3;

import java.awt.*;

/**
 * Created by Krzysztof Podlaski on 09.03.2018.
 */
public interface GraphicObject {
    void move(double dx, double dy);

    void scale(double factor);

    void draw(Graphics g);
}
