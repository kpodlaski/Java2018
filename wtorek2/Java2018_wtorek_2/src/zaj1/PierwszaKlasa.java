package zaj1;

import java.util.Arrays;

/**
 * Created by Krzysztof Podlaski on 20.02.2018.
 */
public class PierwszaKlasa {

    public static void main(String[] a){
        System.out.println("Ala ma kota");
        Osoba o = new Osoba("Alan",
                "Doe",
                172);
        System.out.println(o.imie);
        System.out.println(o.nazwisko);
        System.out.println(o.wzrost);
        System.out.println("Osoba "+o);
        Osoba[] osoby = new Osoba[3];
        osoby[0]=new Osoba("Matylda","Kowal", 162);
        osoby[1]=new Osoba("Mateusz","Nowak", 197);
        osoby[2]=new Osoba("Alicja","Tomaszewska",176);
        for(int i=0; i<osoby.length;i++){
            System.out.println(osoby[i]);
        }
        System.out.println("========================");
        Arrays.sort(osoby);
        Arrays.sort(osoby,new OsobaImieComparator());
        for(int i=0; i<osoby.length;i++){
            System.out.println(osoby[i]);
        }
    }
}
