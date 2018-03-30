package pl.lodz.uni.wfis.podlaski.javawyklad.wyklad2;

import java.util.*;
interface Samochod2{
	public String danePojazdu();
	public void przejechal(int km);
	public void przeglad(String data);
}
class Osobowy implements Samochod2{
	private String nrRej, marka, data_przegl;
	private int przebieg, rok_prod;
	public Osobowy(String _marka, String rej, int rok) 	{
		nrRej=rej; marka=_marka; rok_prod=rok; 
	}
	public String danePojazdu() 	{
		return marka + " nr. rej. "+nrRej;
	}
	public void przejechal(int km) {przebieg+=km;}   //Zakomentowanie linijki spowoduje b��d kompilacji
	public void przeglad (String data) {data_przegl=data;}
	public int wiek() {
		Calendar time =Calendar.getInstance();
		int rok = time.get(time.YEAR);
		return rok-rok_prod;}
}
public class Przyklad2_2
{	
	public static void wypis(Samochod2 car)
	{
		System.out.println(car.danePojazdu());
		//System.out.println(car.wiek());    //Odkomentowanie linijki spowoduje b��d kompilacji
	}
	public static void main (String[] args)  	{
		Osobowy samochod=new Osobowy("Fiat Siena", "EL45322", 2002 );
		wypis(samochod );
		System.out.println("wiek="+samochod.wiek());
	}
}

