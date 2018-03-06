package zaj2;

import zaj3.Figure;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Krzysztof Podlaski on 27.02.2018.
 */
public class DrawingPanel extends JPanel {

    public Ball ball = new Ball(23,45,40);
    public Figure figure;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        /*g.drawRect(12,35,40,20);
        g.setColor(new Color(12,15,254));
        g.fillOval(120,80,30,45);
        g.fillArc(220,200,90,90,45,270);
        g.drawString("Ala ma kota",35,70);
        g.setColor(Color.ORANGE);
        g.drawLine(0,0,300,280);
        */
        g.fillOval( ball.x-ball.r,
                    -ball.y-ball.r,
                    2*ball.r,2*ball.r);
        figure.draw(g);
    }
}
