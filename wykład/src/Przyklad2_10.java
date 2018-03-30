package pl.lodz.uni.wfis.podlaski.javawyklad.wyklad2;

public class Przyklad2_10
{
	public static void main(String[] args)
	{
	   Integer i;
	   i=null;
	   try
	   {
			//Przerwanie wykonywania bloku try
			if (i==null) throw new NullPointerException();
			System.out.println("To nie zostanie napisane");
	   }
	   catch (Exception e)
	   {
			System.out.println("Wylapano "+e); 
	   }
	   finally
	   {
			System.out.println("Teraz mozna posprzatac");
	   }
	   if (i==null) throw new RuntimeException("NullPointerException");
	   System.out.println("\n To byl wyjatek niesprawdzalny");
	}
}