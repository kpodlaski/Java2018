package zaj7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by Krzysztof Podlaski on 24.04.2018.
 */
public class ConsoleUI implements  UI{

    private Communication comm;

    public void start() throws IOException {
        comm.start();
        KeyBoardListener kb = new KeyBoardListener();
        kb.start();
    }

    @Override
    public void receivedMsg(String msg) {
        System.out.println("Received: "+msg);
    }

    public void setComm(Communication communictaion) {
        this.comm = communictaion;
    }

    class KeyBoardListener extends Thread{
        @Override
        public void run(){
            BufferedReader keyboard = new BufferedReader(
                    new InputStreamReader(System.in));
            String line;
            try {
                while((line=keyboard.readLine())!=null ){
                    try {
                        comm.sendMsg(line);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                comm.close();
                keyboard.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
