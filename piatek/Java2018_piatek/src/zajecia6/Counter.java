package zajecia6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Krzysztof Podlaski on 20.04.2018.
 */
public class Counter implements Runnable {
    private int id;
    private Thread t;
    static int suma=0;
    static Object monitor = "Monitor";
    private SumForCounters summator;

    public Counter(int id,SumForCounters summator) {
        this.id = id;
        t = new Thread(this);
        this.summator=summator;
    }

    @Override
    public void run() {
        for(int i=0; i<10; i++){
            synchronized (monitor){
                suma += i;
            }
            summator.add(i);
            System.out.println(id+" : "+i);
        }
        System.out.println("Koniec pracy wątku "+id);
    }

    public void start() {
        t.start();
    }

    public static void main(String[] args) throws InterruptedException {
        List<Counter> counters = new ArrayList<>();
        SumForCounters summator = new SumForCounters();
        int N=1000;
        for( int i=0; i<N; i++){
            counters.add(new Counter(i,summator));
        }
        for (Counter c : counters){
            c.start();
        }
        System.out.println("Koniec Maina");
        Thread.sleep(300);
        System.out.println(suma);
        System.out.println(summator.getSum());
    }
}
