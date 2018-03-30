package pl.lodz.uni.wfis.podlaski.javawyklad.wyklad4;
import java.util.*;

public class Przyklad4_9
{
	public static void main(String[] args)
	{
		Pociag pociag = new Pociag("Telimena");
		Narty narty = new Narty("Salomon");
		Pojazd pojazd = new Pojazd("Telimena");
		Pojazd samochod = new Samochod("Polski Ekspres");
		wypisz(pojazd);
		wypisz(pociag);
		wypisz(samochod);
		Object[] tab = new Object[] {pociag,narty,samochod};
		for (int i=0; i<tab.length;i++)
		{
			wypisz((Pociag) tab[i]);
		}
	}
	public static void wypisz(Pojazd p) { System.out.println(p);};
}

class Samochod extends Pojazd
{
	static String typ = "Samochod";
	public Samochod(String nazwa) { super(nazwa);};
	public String toString() {return typ+" : "+super.toString();}
}

class Narty
{
	protected String nazwa;
	public Narty(String nazwa) {this.nazwa=nazwa;}
	public String toString() {return nazwa;}
}