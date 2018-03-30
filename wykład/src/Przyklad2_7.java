package pl.lodz.uni.wfis.podlaski.javawyklad.wyklad2;

public class Przyklad2_7  //Przesyłka Pocztowa
{
	
	class Adresat
	{
		private String adres;
		public Adresat(String dokad) 
		{
			System.out.println("Konstruktor obiektu");
			adres=dokad;
		}
		public String toString() { return adres;}
	} 
	public Adresat dokad(final String dokad, final double cena) 
	{
		return new Adresat(dokad)
			{
				private int koszt;
				{
				koszt=(int) cena;
				if (koszt<20) System.out.println("Towar czeka na wieksza wysylke");
				}
				private String adres = dokad;
				public String toString() {return adres;}
			};
	}
	
	public static void main(String[] args)
	{
		Przyklad2_7 p = new Przyklad2_7();
		Adresat ad = p.dokad("Tomasz Cwalina ze Szczecina", 12.75); 
	}
}