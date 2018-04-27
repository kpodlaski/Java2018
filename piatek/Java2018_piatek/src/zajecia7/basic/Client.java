package zajecia7.basic;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by Krzysztof Podlaski on 27.04.2018.
 */
public class Client {
    private String address;
    private int port;
    private Socket socket;
    private InputStream in;
    private OutputStream out;

    public Client(int port, String address) {
        this.port = port;
        this.address=address;
    }

    public void start() throws IOException {
        socket = new Socket(address, port);
        in = socket.getInputStream();
        out = socket.getOutputStream();
        Thread t = new Thread(new SocketListener());
        t.start();
    }

    public void sendMsg(String s) throws IOException {
        out.write(s.getBytes());
    }

    public void close() throws IOException {
        in.close();
        out.close();
        socket.close();
    }

    public static void main(String[] args) throws IOException {
        Client c =new Client(8000,"localhost");
        c.start();
        c.sendMsg("Tu Wisła tu Wisła wzywam Odrę");
    }

    class SocketListener implements Runnable{
        @Override
        public void run() {
            int c;
            try {
                while ((c=in.read() )>-1){
                    System.out.print((char) c);
                }
                close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
