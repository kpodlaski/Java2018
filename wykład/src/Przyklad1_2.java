package pl.lodz.uni.wfis.podlaski.wyklad;

class Dodatkowa
{
	static public char c='1';
	public Dodatkowa(char start)
	{
		System.out.println("Inicjalizacja obiektu klasy Dodatkowa z argumentem: "+start);
		c=start;
	}
}
public class Przyklad2_2
{
	public static boolean test = true;
	private int i=3;
	private Dodatkowa d= new Dodatkowa('2');
	
	public Przyklad2_2()
	{
		System.out.println("Inicjalizacja obiektu klasy Przyklad2_2 ");
		System.out.println("i= "+i);
		i=12;	
	}
		
	public static void main(String[] args)
	{
		System.out.println("Element statyczny klasy Dodatkowa: "+Dodatkowa.c);
		System.out.println("Element statyczny klasy Przyklad3: "+test);
		System.out.println("Przyklad3 przyklad=new Przyklad2_2(); ");
		Przyklad2_2 przyklad=new Przyklad2_2();
		System.out.println("Dodatkowa dodatek=new Dodatkowa('R'); ");
		Dodatkowa dodatek=new Dodatkowa('3');	
		System.out.println("Przyklad3 przyklad2;");
		Przyklad2_2 przyklad2;
		System.out.println("przyklad2=new Przyklad2_2();");
		przyklad2=new Przyklad2_2();
		
	}
}