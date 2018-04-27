package zajecia7.basic;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Krzysztof Podlaski on 27.04.2018.
 */
public class Server {
    private int port;
    private Socket socket;
    private InputStream in;
    private OutputStream out;

    public Server(int port) {
        this.port = port;
    }

    public void start() throws IOException {
        ServerSocket ssocket = new ServerSocket(port);
        socket = ssocket.accept();
        in = socket.getInputStream();
        out=socket.getOutputStream();
        Thread t = new Thread(new SocketListener());
        t.start();
    }

    public void close() throws IOException {
        in.close();
        out.close();
        socket.close();
    }

    public static void main(String[] args) throws IOException {
        Server s = new Server(8000);
        s.start();

    }

    class SocketListener implements Runnable{

        @Override
        public void run() {
            int c;
            try {
                while ((c=in.read() )>-1){
                    out.write(c);
                    System.out.print((char) c);
                }
                close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
