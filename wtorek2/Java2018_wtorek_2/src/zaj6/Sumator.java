package zaj6;

/**
 * Created by Krzysztof Podlaski on 17.04.2018.
 */
public class Sumator {
    private int sum=0;

    public void add(int x){
        synchronized (this){
            sum+=x;
        }
    }

    public int get(){
        return sum;
    }
}
