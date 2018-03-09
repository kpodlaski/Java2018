package zajecia2;

import zajecia3.*;
import zajecia3.Rectangle;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Krzysztof Podlaski on 02.03.2018.
 */
public class DrawingPanel extends JPanel {
    private Ball ball;
    private GraphicObject cGO;

    public DrawingPanel(Ball ball) {

        this.ball = ball;
        cGO= ComplexGraphicObject.create(
                new Circle(12,13,7),
                new Rectangle(50,120,30,30),
                new Square(100,100,15)
        );
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        cGO.draw(g);
        g.drawRect(30,45,50,80);
        g.setColor(new Color(25,182,73));
        g.fillOval(ball.x-40/2,ball.y-40/2,40,40);
    }
}
