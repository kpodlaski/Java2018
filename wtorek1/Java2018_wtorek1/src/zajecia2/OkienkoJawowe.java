package zajecia2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;

public class OkienkoJawowe {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OkienkoJawowe window = new OkienkoJawowe();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public OkienkoJawowe() {
		initialize();
	}
	private JButton btnKlik;
	private JTextArea textArea;
	private SimulationScreen panel;
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btnKlik = new JButton("Klik");
		btnKlik.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel.x=panel.x+2;
				panel.y=panel.y+5;
				panel.repaint();
			}
		});
		frame.getContentPane().add(btnKlik, BorderLayout.EAST);
		
		textArea = new JTextArea();
		textArea.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				textArea.setText("Myszka na oknie "+arg0.getX());
			}
		});
		frame.getContentPane().add(textArea, BorderLayout.NORTH);
		
		panel = new SimulationScreen();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
	}

}
