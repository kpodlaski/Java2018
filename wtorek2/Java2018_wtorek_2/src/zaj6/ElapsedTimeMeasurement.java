package zaj6;

/**
 * Created by Krzysztof Podlaski on 17.04.2018.
 */
public class ElapsedTimeMeasurement extends Thread{
    private long start;

    public ElapsedTimeMeasurement(){
        this(System.currentTimeMillis());
    }

    public ElapsedTimeMeasurement(long start){
        this.start = start;
    }

    public void joinToThread(Thread t){
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void run(){
        long end = System.currentTimeMillis();
        System.out.println("Measured time "+ (end-start)+" ms");
    }
}
