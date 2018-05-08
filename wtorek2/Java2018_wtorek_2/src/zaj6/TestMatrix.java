package zaj6;

import java.util.Arrays;

/**
 * Created by Krzysztof Podlaski on 17.04.2018.
 */
public class TestMatrix {
    public int[][] matrix;

    public TestMatrix(int n){
        matrix = new int[n][n];
        int val=1;
        for(int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                matrix[i][j]=val++;
            }
        }
    }

    public TestMatrix(int n, int constValue){
        matrix = new int[n][n];
        int val=constValue;
        for(int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                matrix[i][j]=val;
            }
        }
    }

    public void show(){
        for (int i=0; i< matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        TestMatrix A = new TestMatrix(100);
        //A.show();
        System.out.println("=========================");
        long start = System.currentTimeMillis();
        TestMatrix r = A.multiply(A);
        long end = System.currentTimeMillis();
        System.out.println("time = "+ (end-start));
        //r.show();
        TestMatrix r2 = new TestMatrix(100,0);
        A.threadSaveMultiplyN(A,r2);
        System.out.println("=========================");
        Thread.sleep(3000);
        //r2.show();
        System.out.println(r.equals(r2));
    }

    public TestMatrix multiply(TestMatrix A){
        TestMatrix result = new TestMatrix(this.matrix.length,0);
        for (int i=0; i<matrix.length; i++){
            for (int k=0; k<A.matrix[0].length;k++){
                int r=0;
                for (int j=0; j<matrix[i].length;j++){
                    r+=matrix[i][j]*A.matrix[j][k];
                }
                result.matrix[i][k]=r;
            }
        }
        return result;
    }

    public void threadSaveMultiplyN
            (TestMatrix A, TestMatrix result){
        final ElapsedTimeMeasurement time = new ElapsedTimeMeasurement();
        for (int n=0; n<matrix.length; n++) {
            final int x = n;
            Runnable task = new Runnable() {
                private int row;
                { row = x;}
                public void run() {
                    for (int k=0; k<A.matrix[0].length; k++) {
                        int r = 0;
                        for (int j = 0; j < result.matrix[row].length; j++)
                            r+=matrix[row][j] * matrix[j][k];
                        result.matrix[row][k] =r;
                    }
                }
            };
            Thread t = new Thread(task);
            t.start();
            time.joinToThread(t);
        }
        time.start();
    }

    public TestMatrix threadSaveMultiplyN2(TestMatrix A){
        return A;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestMatrix that = (TestMatrix) o;
        return Arrays.deepEquals(matrix, that.matrix);
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(matrix);
    }
}
