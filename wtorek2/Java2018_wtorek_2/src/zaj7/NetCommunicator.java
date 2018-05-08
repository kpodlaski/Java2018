package zaj7;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Krzysztof Podlaski on 24.04.2018.
 */
public class NetCommunicator implements UI{
    private JTextArea commHistory;
    private JTextField message;
    private JButton serverBtn;
    private JButton clientBtn;
    private JButton sendBtn;
    private JPanel panel;
    private Communication comm;

    public NetCommunicator() {

        ActionListener an = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String msg = message.getText();
                    comm.sendMsg(msg);
                    commHistory.append("\n[JA]:"+msg);
                    message.setText("");
                } catch (IOException e1) {
                    e1.printStackTrace();
                }


            }
        };
        sendBtn.addActionListener(an);
        message.addActionListener(an);
        clientBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Socket socket = new Socket("localhost",8000);
                    comm = new Communication(socket,NetCommunicator.this);
                    comm.start();
                    commHistory.setText("Rozpoczynam komunikacje");
                    sendBtn.setEnabled(true);
                    clientBtn.setEnabled(false);
                    serverBtn.setEnabled(false);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });
        serverBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    ServerSocket ss = new ServerSocket(8000);
                    commHistory.setText("Czekam na klienta");
                    Socket socket = ss.accept();
                    comm = new Communication(socket,NetCommunicator.this);
                    comm.start();
                    commHistory.setText("Rozpoczynam komunikacje");
                    sendBtn.setEnabled(true);
                    clientBtn.setEnabled(false);
                    serverBtn.setEnabled(false);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });
    }

    @Override
    public void receivedMsg(String msg) {
        commHistory.append("\n[ON]:"+msg);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("NetCommunicator");
        frame.setContentPane(new NetCommunicator().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
