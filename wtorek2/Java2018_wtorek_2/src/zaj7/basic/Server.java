package zaj7.basic;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Krzysztof Podlaski on 24.04.2018.
 */
public class Server {

    private int port;
    private ServerSocket serverSocket;
    private Socket clientSocket;

    public Server(int i) {
        this.port=i;
    }

    public static void main(String[] args) throws IOException {
        Server server = new Server(8000);
        server.startServer();
    }

    private void startServer() throws IOException {
        serverSocket = new ServerSocket(port);
        System.out.println("Czekam na klienta");
        clientSocket = serverSocket.accept();
        startCommunication();
        serverSocket.close();
    }

    private void startCommunication() throws IOException {
        InputStream is = clientSocket.getInputStream();
        OutputStream os = clientSocket.getOutputStream();
        int c;
        while ( (c=is.read())!=-1 ){
            os.write(c);
            System.out.print((char) c);
        }
        is.close();
        os.close();
        clientSocket.close();
    }
}
