package pl.lodz.uni.wfis.podlaski.wyklad;
class Pierwotna{
	private int i;
	public Pierwotna()	{
		System.out.println("Inicjalizacja obiektu klasy Pierwotna");
		i=1;
	}
	public int pokaz()	{
		return i;
	}
	public String toString() 	{
		return "I="+i;
	}
}
class Dziedziczna extends Pierwotna{
	private int i;
	public Dziedziczna() 	{
		System.out.println("Inicjalizacja obiektu klasy Dziedziczna");
		i=12;
	}
	public int pokaz() 	{
		return i+super.pokaz();
	}
}
public class Przyklad2_5
{	public static void main (String[] args)  	{
		System.out.println("Start");
		Dziedziczna obiekt= new Dziedziczna();
		System.out.println("Po inicjalizacji");
		System.out.println("metoda pokaz():"+obiekt.pokaz());
		System.out.println("metoda toString():"+obiekt);	
	}
}

