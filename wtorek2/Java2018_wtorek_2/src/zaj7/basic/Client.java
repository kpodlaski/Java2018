package zaj7.basic;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by Krzysztof Podlaski on 24.04.2018.
 */
public class Client {
    int port;
    String ipServer;
    Socket socket;

    public Client(int port, String domain) {
        this.port=port;
        this.ipServer=domain;
    }


    public static void main(String[] args) throws IOException, InterruptedException {
        Client c = new Client(8000,"localhost");
        c.startClient();

    }

    private void startClient() throws IOException, InterruptedException {
        socket = new Socket(ipServer,port);
        OutputStream os = socket.getOutputStream();
        new ListeningThread().start();
        String msg = "Ja Grad 1";
        for (int i=0; i<10; i++){
            os.write(msg.getBytes());
        }
        Thread.sleep(2000);
        os.close();

    }

    class ListeningThread extends Thread{
        public void run(){
            try {
                InputStream is = socket.getInputStream();
                int c;
                while ((c = is.read()) != -1) {
                    System.out.print((char) c);
                }
                is.close();
                socket.close();
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}
