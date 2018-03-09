package zajecia3;

import java.awt.*;

/**
 * Created by Krzysztof Podlaski on 09.03.2018.
 */
public class ComplexGraphicObject implements GraphicObject {
    private GraphicObject[] objects;

    private ComplexGraphicObject( GraphicObject[] objects)
    {
        this.objects=objects;
    }

    public static GraphicObject
                create(GraphicObject ... elements)
    {
        //Powiąż elementy w celu lepszego skalowania
        ComplexGraphicObject obj =
                new ComplexGraphicObject(elements);
        return obj;
    }

    @Override
    public void move(double dx, double dy) {
        for (int i=0 ; i<objects.length;i++){
            objects[i].move(dx,dy);
        }
        /* DYGRESJA tablice wielowymiarowe
        int [][] tab = new int[20][];
        for (int k=0; k<tab.length; k++){
            tab[k] = new int[40];
        }
        tab[10][15];
        tab[3].length
        */
    }

    @Override
    public void scale(double factor) {
        //Należało by skalować bardziej inteligentnie
        for (GraphicObject o : objects){
            o.scale(factor);
        }

    }

    @Override
    public void draw(Graphics g) {
        for (GraphicObject o : objects){
            o.draw(g);
        }
    }


}
