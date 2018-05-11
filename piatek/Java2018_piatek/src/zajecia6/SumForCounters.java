package zajecia6;

/**
 * Created by Krzysztof Podlaski on 20.04.2018.
 */
public class SumForCounters {
    private int sum=0;

    public void add(int x){
        synchronized (this) {
            sum += x;
        }
    }

    public synchronized int getSum(){
        return sum;
    }
}
