package pl.lodz.uni.wfis.podlaski.javawyklad.wyklad2;

public class Przyklad2_12
{										//Wstawmy komentarz przed throws
	private static boolean test(int x)   throws UjemnaLiczba, ZaDuzaLiczba {
		if (x<0) throw new UjemnaLiczba();
		if (x>5) throw new ZaDuzaLiczba();
		return true; 
	}
	public static void main(String[] args) 	{
	 for(int i=-1;i<10; i=i+4){ 
	 try {
			System.out.println("\nWynik testu : "+test(i));
			System.out.println("Wykonalo obliczenia");
	   }
	/*  catch (Exception e) 
		{
			System.out.println("Exception "+e);
		}
	*/
	   catch (UjemnaLiczba e) {
			System.out.println("Wylapano "+e); 
	   }
	   catch (Exception e) 
		{
			System.out.println("Exception "+e);
		}
	
		}	 
	  System.out.println("\nKoniec Testu");
	}
}