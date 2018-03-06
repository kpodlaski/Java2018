package zaj3;

/**
 * Created by Krzysztof Podlaski on 06.03.2018.
 */
public class Square extends Rectangle {

    public Square(double x, double y,
                  double width) {
        super(x, y, width, width);
        type=FigureTypes.Square;
    }
}
