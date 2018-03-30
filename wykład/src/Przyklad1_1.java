package pl.lodz.uni.wfis.podlaski.wyklad;

class KlasaPomocnicza1
{
	private int pole=1;
	public int wartosc() 
	{
		return pole;
	}
}
class KlasaPomocnicza2
{
	private int pole;
	public KlasaPomocnicza2(int a)
	{
		pole=a;
	}
	public int wartosc()
		{
		return pole;
		}
}
public class Przyklad2_1
{
	class KlasaPomocnicza3
	{
		boolean test = true; 
	}
	KlasaPomocnicza3 obiekt3 = new KlasaPomocnicza3();
	public static void main(String[] args)
	{
		KlasaPomocnicza1 obiekt1 = new KlasaPomocnicza1();
		KlasaPomocnicza2 obiekt2 = new KlasaPomocnicza2(6);
//		KlasaPomocnicza3 obiekt4 = new KlasaPomocnicza3();
		System.out.println(obiekt1.wartosc());
		System.out.println(obiekt2.wartosc());
		Przyklad2_1 obiekt= new Przyklad2_1();
		System.out.println(obiekt.obiekt3.test);		
	}
}