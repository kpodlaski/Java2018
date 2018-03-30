package pl.lodz.uni.wfis.podlaski.javawyklad.wyklad2;

public class Przyklad2_3   //Przesyłka Pocztowa
{
	class Zawartosc
	{
		private int waga;
		public Zawartosc(int kg) { waga=kg;}
		public String toString() { return  ""+waga+"kg";}
	}
	class Adresat
	{
		private String adres;
		public Adresat(String dokad) {adres=dokad;}
		public String toString() { return adres;}
	}
	
	public void nadanie(int waga, String adresat)
	{
		Zawartosc z=new Zawartosc(waga);
		Adresat a=new Adresat(adresat);
		System.out.println(adresat+" "+z);
	}
	public static void main(String[] args)
	{
		Przyklad2_3 p = new Przyklad2_3();
		p.nadanie(14,"Tomasz Cwalina ze Szczecina");
	}
}