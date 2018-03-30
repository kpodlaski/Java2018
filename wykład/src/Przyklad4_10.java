package pl.lodz.uni.wfis.podlaski.javawyklad.wyklad4;
import java.util.*;

public class Przyklad4_10
{
	public static void main(String[] args)
	{
		
		Pociag pociag = new Pociag("Telimena");
		Narty narty = new Narty("Salomon");
		Pojazd samochod = new Samochod("Polski Ekspres");
		Object[] tab = new Object[] {pociag,narty,samochod};
		for (int i=0; i<tab.length;i++)
		{
			if (tab[i] instanceof Pojazd) wypisz((Pojazd) tab[i]);
			else if (tab[i] instanceof Narty) System.out.println("Narty to nie jest pojazd");
		}
	}
	public static void wypisz(Pojazd p) { System.out.println(p);};
}

