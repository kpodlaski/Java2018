package pl.lodz.uni.wfis.podlaski.javawyklad.wyklad4;
import java.util.*;

public class Przyklad4_6
{
	public static void main(String[] args)
	{
		Map zbior = new HashMap();     
		zbior.put(new Klucz2("Eryk"),"Szwed");
		zbior.put(new Klucz2("Wiek"),new Integer(32));
		zbior.put(new Klucz2("Zawod"),"Kolejarz");
		System.out.println(zbior);
		System.out.println(zbior.get(new Klucz2("Eryk")));
		boolean czyKlucz = zbior.containsKey(new Klucz2("Eryk"));
		System.out.println( czyKlucz);
		Klucz2 t = new Klucz2("Eryk");
		System.out.println(t.hashCode());
		System.out.println(t.hashCode());
		System.out.println(t.equals(new Klucz2("Eryk")));
	}
}

class Klucz
{
	protected String nazwa;
	public Klucz(String nazwa) {this.nazwa=nazwa;}
	public String toString() {return nazwa;}
}

class Klucz2 extends Klucz
{
	public Klucz2(String nazwa) {super(nazwa);}
	public int hashCode() { return nazwa.hashCode();}
	public boolean equals(Object kl) {return kl.hashCode() == this.hashCode();} //ta metoda nie jest doskona�a
	//public boolean equals(Klucz kl) {return kl.hashCode() == this.hashCode();}
}