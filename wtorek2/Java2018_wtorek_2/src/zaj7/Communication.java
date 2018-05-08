package zaj7;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by Krzysztof Podlaski on 24.04.2018.
 */
public class Communication {
    private Socket socket;
    private UI ui;
    private ListeningThread lt;
    private OutputStream os;

    public Communication(Socket socket, UI ui){
        this.socket=socket;
        this.ui=ui;
    }

    public void start() throws IOException {
        lt = new ListeningThread();
        lt.start();
        os=socket.getOutputStream();
    }

    public void sendMsg(String msg) throws IOException {
        os.write(msg.getBytes());
    }

    public void close() throws IOException {
        lt.close();
        os.close();
        socket.close();
    }

    class ListeningThread extends Thread{
        InputStream is;
        public void run(){
            try {
                is = socket.getInputStream();
                byte[] bufer = new byte[1024];
                int bSize;
                while ((bSize = is.read(bufer)) >0) {
                    ui.receivedMsg(new String(bufer,0,bSize));
                }
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }

        public void close() throws IOException {
            is.close();
        }
    }
}
