package pl.lodz.uni.wfis.podlaski.javawyklad.wyklad2;

class Dom2
{
	private Pokoj sypialnia;
	protected class Pokoj
	{
		public Pokoj() { System.out.println("Pokoj w domu");}
	}
	public Dom2()
	{
		System.out.println("Nowy Dom"); 
		sypialnia=new Pokoj();
	}
	public void nowaSypialnia(Pokoj s) { sypialnia = s;}
}


public class Przyklad2_9 extends Dom2 //Klasa opisująca Blok
{
	protected class Pokoj extends Dom2.Pokoj
	{
		public Pokoj() { System.out.println("Pokoj w bloku");}
	}
	public Przyklad2_9()
	{ 
		System.out.println("Nowy Blok");
		nowaSypialnia( new Pokoj() );
	}
	
	public static void main(String[] args)
	{
		Przyklad2_9 p = new Przyklad2_9();
	}
}