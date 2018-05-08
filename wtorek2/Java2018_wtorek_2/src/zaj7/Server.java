package zaj7;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Krzysztof Podlaski on 24.04.2018.
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ssocket = new ServerSocket(8000);
        Socket socket = ssocket.accept();
        ConsoleUI ui = new ConsoleUI();
        Communication comm = new Communication(socket,ui);
        ui.setComm(comm);
        ui.start();

    }
}
