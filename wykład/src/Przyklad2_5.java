package pl.lodz.uni.wfis.podlaski.javawyklad.wyklad2;

public class Przyklad2_5   //Przesyłka Pocztowa
{
	private double stawka=0.3;
	class Zawartosc
	{
		private int waga;
		public Zawartosc(int kg) { waga=kg;}
		public String toString() { return  ""+waga*stawka;}   
	}
	class Adresat
	{
		private String adres;
		public Adresat(String dokad) {adres=dokad;}
		public String toString() { return adres;}
	}
	public Zawartosc ile(int waga) {return new Zawartosc(waga); }
	public Adresat dokad(String adres) {return new Adresat(adres); }
	
	public void nadanie(int waga, String adresat)
	{
		Zawartosc z= ile(waga);
		Adresat a= dokad(adresat);
		System.out.println(adresat+" "+z+"zl");
	}
	public static void main(String[] args)
	{
		Przyklad2_5 p = new Przyklad2_5();
		p.nadanie(14,"Tomasz Cwalina ze Szczecina");
	}
}