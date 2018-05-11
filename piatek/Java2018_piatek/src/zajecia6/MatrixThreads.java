package zajecia6;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Krzysztof Podlaski on 20.04.2018.
 */
public class MatrixThreads {
    int N;
    int[][] matrix;
    int sum=0;

    public MatrixThreads(int N){
        this.N=N;
        matrix = new int[N][N];
        Random r = new Random();
        for (int i=0; i<matrix.length; i++){
            for (int k=0; k<matrix[i].length; k++){
                matrix[i][k]=Math.abs(r.nextInt())%100;
            }
        }
    }

    public int sumOfElements(){
        int sum=0;
        for (int i=0; i<matrix.length; i++){
            for (int k=0; k<matrix[i].length; k++){
                sum+=matrix[i][k];
            }
        }
        return sum;
    }

    public void multiThreadSummation(){
        for (int i=0; i<N; i++) {
            final int x =i;
            new Thread(new Runnable() {
                int row;
                {row=x;}
                public void run() {
                    int s=0;
                    for(int k=0; k<matrix[row].length;k++){
                        s+=matrix[row][k];
                    }
                    synchronized(MatrixThreads.this) {
                        sum += s;
                    }
                }
            }).start();
        }
    }
    public static void main(String[] args) throws InterruptedException {
        int N=1000;
        MatrixThreads m = new MatrixThreads(N);
        System.out.println("One thread:\t\t"+m.sumOfElements());
        //System.out.println(Arrays.deepToString(m.matrix));
        m.multiThreadSummation();
        Thread.sleep(3000);
        System.out.println(N+" threads:\t"+m.sum);
    }
}
