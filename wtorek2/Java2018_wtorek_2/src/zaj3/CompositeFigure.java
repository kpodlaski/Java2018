package zaj3;

import java.awt.*;

/**
 * Created by Krzysztof Podlaski on 06.03.2018.
 */
public class CompositeFigure extends Figure
{
    protected Figure[] elements;

    public CompositeFigure(double x, double y) {
        super(x, y,FigureTypes.Composite);
    }

    @Override
    public void draw(Graphics g) {
        for(Figure f : elements){
            f.draw(g);
        }
    }

    @Override
    public void scale(double factor) {
        for(Figure f : elements){
            f.scale(factor);
            //+ move elements
            if (f instanceof Circle){
                System.out.println("Skaluje okrąg");
            }
            if (f instanceof Square){
                System.out.println("Skaluje kwadrat");
            }
            if (f instanceof Rectangle){
                System.out.println("Skaluje prostokąt");
            }
            switch(f.type){
                case Rectangle: System.out.println("R");break;
                case Square: System.out.println("S");break;
                case Circle: System.out.println("C");break;
                default: break;
            }
        }
    }

    @Override
    public void move(double X, double Y) {
        super.move(X, Y);
        for(Figure f : elements){
            f.move(X,Y);
        }
    }

    public static CompositeFigure create(
            double x, double y, Figure[] elem){
        CompositeFigure cf = new CompositeFigure(x,y);
        cf.elements=elem;
        return cf;
    }
}
