package pl.lodz.uni.wfis.podlaski.javawyklad.wyklad2;

public class Przyklad2_4   //Przesy�ka Pocztowa
{
	class Zawartosc
	{
		private int waga;
		public Zawartosc(int kg) { waga=kg;}
		public String toString() { return  ""+waga;}
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
		System.out.println(adresat+" "+z+"kg");
	}
	public static void main(String[] args)
	{
		Przyklad2_4 p = new Przyklad2_4();
		p.nadanie(14,"Tomasz Cwalina ze Szczecina");
		// Użycie bezpośrednio klas wewnętrznych
		Przyklad2_4 p2 = new Przyklad2_4();
		Przyklad2_4.Zawartosc z=p2.ile(35);
		Przyklad2_4.Adresat a = p2.dokad("Adrian Kopara, Bydgoszcz");
	}
}