package zaj4;

import java.util.*;

/**
 * Created by Krzysztof Podlaski on 13.03.2018.
 */
public class ContainersInJava {
    public static void main(String[] args) {
        //listExample();
        //setExample();
        mapExample();
    }

    private static void mapExample() {
        Map<Point2D,Planet> planetMap = new HashMap<>();
        Planet p = new Planet(17,"Planeta 1", new Point2D(17,85));
        planetMap.put(p.getCoords(),p);
        p = new Planet(217,"Planeta 2", new Point2D(-127,825));
        planetMap.put(p.getCoords(),p);
        p = new Planet(30,"Planeta 3", new Point2D(17,285));
        planetMap.put(p.getCoords(),p);
        p = new Planet(2,"Planeta 4", new Point2D(17,85));
        planetMap.put(p.getCoords(),p);

        System.out.println(planetMap.size());
        for(Point2D point : planetMap.keySet()) {
            Planet planet = planetMap.get(point);
            System.out.println(planet.getName() + " masa:" + planet.getMass());
        }
    }

    private static void setExample() {
        Set<Point2D> set = new HashSet<>();
        set.add(new Point2D(12,12));
        set.add(new Point2D(18,7));
        set.add(new Point2D(122,12));
        set.add(new Point2D(18,70));
        set.add(new Point2D(122,12));
        System.out.println(set.size());
        System.out.println(set);
        for(Point2D p : set){
            System.out.println(p.hashCode());
        }
        Object[] o = set.toArray();
        Point2D[] tab = null;
        tab= set.toArray(tab);
    }

    private static void listExample() {
        List<Point2D> lista = new ArrayList<>();
        lista.add(new Point2D(12,17));
        lista.add(new Point2D(-2,37));
        lista.add(new Point2D(120,-17));
        lista.add(2,new Point2D(13,17));
        for(int i=0; i<lista.size(); i++)
           System.out.println(lista.get(i));
        System.out.println("----------------------");
        for(Point2D p : lista) {
            /* Concurency problem
            if(p.getY()<0) {
                lista.remove(p);
            }
            else
            */
            System.out.println(p);
        }
        Iterator<Point2D> it = lista.iterator();
        System.out.println("----------------------");
        while(it.hasNext()){
            Point2D p = it.next();
            if(p.getX()<0) {
                it.remove();
            }
            else
                System.out.println(p);
        }
        Point2D p = new Point2D(13,17);
        lista.remove(p);
        System.out.println(lista.size());
        System.out.println("----------------------");
        for(Point2D p2 : lista) {
         System.out.println(p2);
        }
        //lista.sort(...);
    }
}
