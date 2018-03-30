package pl.lodz.uni.wfis.podlaski.javawyklad.wyklad4;
import java.util.*;

public class Przyklad4_5
{
	public static void main(String[] args)
	{
		Map zbior = new HashMap();     
		zbior.put(new Klucz("Eryk"),"Szwed");
		zbior.put(new Klucz("Wiek"),new Integer(32));
		zbior.put(new Klucz("Zawod"),"Kolejarz");
		System.out.println(zbior);
		System.out.println(zbior.get(new Klucz("Eryk")));
		boolean czyKlucz = zbior.containsKey(new Klucz("Eryk"));
		System.out.println( czyKlucz);
		Klucz t = new Klucz("Eryk");
		System.out.println(t.equals(new Klucz("Eryk")));
	}
}

class Klucz
{
	protected String nazwa;
	public Klucz(String nazwa) {this.nazwa=nazwa;}
	public String toString() {return nazwa;}
}
