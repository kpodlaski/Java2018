package zajecia4;

import java.util.*;

/**
 * Created by Krzysztof Podlaski on 13.03.2018.
 */
public class ContainersInJava {

    public static void main(String[] a){
        //listExample();
        //setExample();
        mapExample();
    }

    private static void mapExample() {
        Map<Point2D,Double> mapa = new HashMap<>();
        mapa.put(new Point2D(),145.0);
        mapa.put(new Point2D(1,11),245.0);
        mapa.put(new Point2D(17,13),15.0);
        mapa.put(new Point2D(1,11),3.0);
        for(Point2D p : mapa.keySet()){
            System.out.print(p+"\t");
            System.out.println( mapa.get(p) );
        }

    }

    private static void setExample() {
        Set<Point2D> set = new HashSet<>();
        set.add(new Point2D(1,13));
        System.out.println();
        set.add(new Point2D(-1,22));
        System.out.println();
        set.add(new Point2D(-3,3));
        System.out.println();
        set.add(new Point2D(1,13));
        System.out.println();
        System.out.println(set.size());
        for(Point2D p : set){
            System.out.println(p);
        }
    }

    private static void listExample() {
        List<Point2D> lista = new ArrayList<>();
        lista.add(new Point2D(2,4));
        lista.add(new Point2D(3,5));
        lista.add(new Point2D(-1,-3));
        for(int i=0; i<lista.size(); i++){
            System.out.println(lista.get(i));
        }
        System.out.println("++++++++++++++++");
        for(Point2D p : lista){
            System.out.println(p);
        }
        System.out.println("++++++++++++++++");
        Iterator<Point2D> it =lista.iterator();
        while(it.hasNext()){
            Point2D p = it.next();
            if (p.getX()>4 || p.getY()>4) it.remove();
            else
                System.out.println(p);
        }
        System.out.println("++++++++++++++++");
        System.out.println(lista.size());
        //lista.sort(...)
        Point2D p = new Point2D(-1,-3);
        System.out.println(p);
        System.out.println(lista.contains(p));
    }

}
