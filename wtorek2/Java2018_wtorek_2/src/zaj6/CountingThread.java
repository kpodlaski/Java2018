package zaj6;

/**
 * Created by Krzysztof Podlaski on 17.04.2018.
 */
public class CountingThread implements Runnable{
    private int id;
    private Thread t;
    public static int sum=0;
    private static String monitor="Monitor";
    private Sumator sumator;

    public CountingThread(int id,Sumator s) {
        this.id = id;
        sumator = s;
        t = new Thread(this);
    }

    @Override
    public void run() {
        for(int i=0; i<10; i++){
            sumator.add(i);
            synchronized (monitor){
                sum+=i;
            }
            System.out.println(id+":\t"+i);
        }
        System.out.println("Wątek "+id+" zakończył działanie");
    }

    public void start() {
        t.start();
    }
}
