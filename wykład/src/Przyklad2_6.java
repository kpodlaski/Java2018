package pl.lodz.uni.wfis.podlaski.javawyklad.wyklad2;

public class Przyklad2_6
{
	public Object napis()
		{ return new Object() 
                    {
			private String text="tekst";
			//konstruktor klasy anonimowej
			{
				System.out.println("konstruktor klasy anonimowej");
			}
			public String toString() {return text;}
                    };    //Musi być tu średnik
		}	
	public static void main(String[] args)
	{
		Przyklad2_6 p = new Przyklad2_6();
		System.out.println(p.napis());
	}
}