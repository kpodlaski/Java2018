package zaj2;

import zaj3.*;

import javax.swing.*;
import java.awt.event.*;

/**
 * Created by Krzysztof Podlaski on 27.02.2018.
 */
public class SimpleGIU {
    private JTextField textField1;
    private JButton kliknijButton;
    private JPanel panel;
    private JPanel drawingPanel;

    public SimpleGIU() {
        kliknijButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("Nowy Text");
                DrawingPanel dp = (DrawingPanel) drawingPanel;
                dp.ball.move(3,-3);
                dp.repaint();
            }
        });
        textField1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                textField1.setText("X:" + e.getX());
            }
        });

        drawingPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                textField1.setText("X:" + e.getX());
                DrawingPanel dp = (DrawingPanel) drawingPanel;
                dp.ball.x=e.getX()+dp.ball.r;
                dp.repaint();
            }
        });


        drawingPanel.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
                textField1.setText("X:" + e.getX());
                DrawingPanel dp = (DrawingPanel) drawingPanel;
                dp.ball.x=e.getX();
                dp.ball.y=-e.getY();
                dp.repaint();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("SimpleGIU");
        frame.setContentPane(new SimpleGIU().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(500,400);
        frame.setLocation(300,500);
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        Figure[] fs = new Figure[]{
                new Circle(125,143,8),
                new Rectangle(12,13,55,2),
                new Square(7,177,23)
        };
        Figure f = CompositeFigure.create(1,1,fs);

        drawingPanel = new DrawingPanel();
        ((DrawingPanel) drawingPanel).figure=f;
    }
}
