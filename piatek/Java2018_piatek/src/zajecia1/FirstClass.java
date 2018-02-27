package zajecia1;

/**
 * Created by Krzysztof Podlaski on 23.02.2018.
 */
public class FirstClass {

    public static void main(String[] a){
        System.out.println("Coś tam");
        Vehicle v = new Vehicle("Jan Kowalski",
            "PL123123",
            1978);
        System.out.println("V: "+v);
        Vehicle v2 = new Vehicle();
        System.out.println("V: "+v2);
        Vehicle tab[] = new Vehicle[3];
        tab[0]=new Vehicle("Arkadia", "AA123", 2015);
        tab[1] = new Vehicle("Tamara","EE4455",2007);
        tab[2] = new Vehicle("Zofia","XX4455",1999);
        for (int i=0; i<tab.length; i++){
            System.out.println(tab[i]);
        }
        String s = tab[5].owner;
    }
}
