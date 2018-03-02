package zajecia2;

import javax.swing.*;
import java.awt.event.*;

/**
 * Created by Krzysztof Podlaski on 02.03.2018.
 */
public class SampleGUI {
    private JTextField textField1;
    private JButton klikButton;
    private JPanel mainPanel;
    private JPanel drawPanel;
    private  Ball ball;

    public SampleGUI() {
        klikButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("Kliknieto klawisz");
                ball.x+=20;
                ball.y+=5;
                drawPanel.repaint();
            }
        });
        textField1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                int x =e.getX();
                textField1.setText("x: "+x);
            }
        });
        drawPanel.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
                ball.x = e.getX();
                ball.y=e.getY();
                drawPanel.repaint();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("SampleGUI");
        frame.setContentPane(new SampleGUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocation(200,200);
        frame.setSize(600,600);
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        ball = new Ball (75,30);
        drawPanel = new DrawingPanel(ball);
    }
}
