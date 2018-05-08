package zaj7;

import java.io.IOException;
import java.net.Socket;

/**
 * Created by Krzysztof Podlaski on 24.04.2018.
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 8000);
        ConsoleUI ui = new ConsoleUI();
        Communication comm = new Communication(socket,ui);
        ui.setComm(comm);
        ui.start();
    }
}
