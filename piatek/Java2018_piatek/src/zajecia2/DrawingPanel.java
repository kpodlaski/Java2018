package zajecia2;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Krzysztof Podlaski on 02.03.2018.
 */
public class DrawingPanel extends JPanel {
    private Ball ball;

    public DrawingPanel(Ball ball) {
        this.ball = ball;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawRect(30,45,50,80);
        g.setColor(new Color(25,182,73));
        g.fillOval(ball.x-40/2,ball.y-40/2,40,40);
    }
}
