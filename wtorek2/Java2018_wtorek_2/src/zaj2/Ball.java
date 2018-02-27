package zaj2;

/**
 * Created by Krzysztof Podlaski on 27.02.2018.
 */
public class Ball {
    public int x;
    public int y;
    public int r;

    public Ball(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public void move(int dx, int dy){
        x+=dx;
        y+=dy;
    }
}
