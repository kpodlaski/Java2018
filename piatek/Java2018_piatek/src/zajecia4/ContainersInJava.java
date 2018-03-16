package zajecia4;

import java.util.*;

/**
 * Created by Krzysztof Podlaski on 16.03.2018.
 */
public class ContainersInJava {
    public static void main(String[] args) {
        //listExample();
        //setExample();
        mapExample();
    }

    private static void mapExample() {
        Map<Student,Integer> stypendia = new HashMap<>();
        stypendia.put(
                new Student("Anna", "Annicka"),
                1250);
        stypendia.put(new Student("Tomasz", "Tomaszewski"),
                600);
        stypendia.put(new Student("Gabriela", "Gabrielska"),
                950);
        Student student = new Student("Anna", "Annicka");
        student.setIndex(1);
        stypendia.put(
                student,
                2250);

        System.out.println(stypendia);
        for(Student s : stypendia.keySet()){
            int st = stypendia.get(s);
            System.out.println(st);
        }

    }

    private static void setExample() {
        Set<Student> set = new HashSet<>();
        set.add(new Student("Anna", "Annicka"));
        set.add(new Student("Tomasz", "Tomaszewski"));
        set.add(new Student("Gabriela", "Gabrielska"));
        Student st = new Student("Anna", "Annicka");
        st.setIndex(1);
        set.add(st);
        for(Student s : set){
            System.out.println(s.getIndex()+" "+s);
        }
    }


    private static void listExample() {
        List<Student> lista = new ArrayList<>();
        // List == List<Object>
        lista.add(new Student("Anna","Annicka"));
        lista.add(new Student("Tomasz","Tomaszewski"));
        lista.add(new Student("Gabriela","Gabrielska"));
        System.out.println(lista);
        for(int i=0; i<lista.size(); i++){
            System.out.println(i+". "+lista.get(i));
        }

        System.out.println("----------------");
        Iterator<Student> it = lista.iterator();
        while (it.hasNext()){
            Student s = it.next();
            if (s.getName().charAt(1)=='o'){
                it.remove();
            }
        }
        System.out.println("----------------");
        for(Student s : lista){
            System.out.println(s);
        }
        Student st = new Student("Anna","Annicka");
        st.setIndex(lista.get(0).getIndex());
        lista.add(st);
        boolean b = lista.contains(st);
        System.out.println(b);
        System.out.println(lista.lastIndexOf(st));
    }
}
