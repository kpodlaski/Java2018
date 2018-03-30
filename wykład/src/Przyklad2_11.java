package pl.lodz.uni.wfis.podlaski.javawyklad.wyklad2;

class UjemnaLiczba extends Exception {}
class ZaDuzaLiczba extends Exception {}

public class Przyklad2_11
{										 
	private static boolean test(int x)   throws UjemnaLiczba, ZaDuzaLiczba {
		if (x<0) throw new UjemnaLiczba();
		if (x>5) throw new ZaDuzaLiczba();
		return true; 
	}
	public static void main(String[] args) 	{
	 for(int i=-1;i<10; i=i+4){ 
	  //test(2);
	   try {
			System.out.println("\nWynik testu : "+test(i));
			System.out.println("Wykonalo obliczenia");
	   }
	   catch (UjemnaLiczba e) {
			System.out.println("Wylapano "+e); 
	   }
	   catch (ZaDuzaLiczba e) {
			System.out.println("Wylapano "+e); 
	   }
	   finally
	   {
			System.out.println("Wyduk z finally\n");
	   }
      }	 
	  System.out.println("\nKoniec Testu");
	}
}