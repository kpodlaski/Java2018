package zaj1;

import java.util.Comparator;

/**
 * Created by Krzysztof Podlaski on 20.02.2018.
 */
public class Osoba implements Comparable{
    public String imie;
    public String nazwisko;
    public int wzrost;

    public Osoba(String imie, String nazwisko, int wzrost) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wzrost = wzrost;
    }

    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wzrost=" + wzrost + "cm"+
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Osoba os =(Osoba) o;
        return wzrost-os.wzrost;
    }
}

class OsobaImieComparator implements Comparator<Osoba>{

    @Override
    public int compare(Osoba o1, Osoba o2) {
        return o1.imie.compareToIgnoreCase(o2.imie);
    }
}