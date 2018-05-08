package zaj6;

import java.io.IOException;

/**
 * Created by Krzysztof Podlaski on 17.04.2018.
 */
public class CountingMain {
    public static void main(String[] args) throws IOException, InterruptedException {
        CountingThread threads[] = new CountingThread[1000];
        Sumator s = new Sumator();
        for (int i=0; i<threads.length; i++){
            threads[i]=new CountingThread(i+1,s);
        }
        for (int i=0; i<threads.length; i++){
            threads[i].start();
        }
        System.out.println("Koniec Programu");
        Thread.sleep(3000);
        System.out.println("Sum ="+ CountingThread.sum);
        System.out.println("Sum2 ="+ s.get());
    }
}
