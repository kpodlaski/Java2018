package pl.lodz.uni.wfis.podlaski.javawyklad.wyklad2;

class Dom
{
	private Pokoj sypialnia;
	protected class Pokoj
	{
		public Pokoj() { System.out.println("Pokoj w domu");}
	}
	public Dom()
	{
		System.out.println("Nowy Dom"); 
		sypialnia=new Pokoj();
	}
}


public class Przyklad2_8 extends Dom //Klasa opisująca Blok
{
	protected class Pokoj
	{
		public Pokoj() { System.out.println("Pokoj w bloku");}
	}
	
	
	public static void main(String[] args)
	{
		Przyklad2_8 p = new Przyklad2_8();
	}
}