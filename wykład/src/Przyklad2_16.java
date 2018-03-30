package pl.lodz.uni.wfis.podlaski.javawyklad.wyklad2;

class Wyjatek2 extends Exception {
	public Wyjatek2(String s) { super(s); }
}

public class Przyklad2_16
{										
	private static void  wyjatek()   throws Wyjatek2 {
		throw new Wyjatek2("Wyrzcono z wyjatek()");
	}
	private static void exception() throws Exception{
		try {
			wyjatek();
		}
		catch (Wyjatek2 e) {
			System.out.println("Wyjatek w funkcji exception");
			throw new Exception(e.getMessage());    //Mozliwe ZGUBIENIE wyjątku
		}
	}
	public static void main(String[] args) 	{
	   try {
			exception();
	   }
	   catch (Exception e) {
			e.printStackTrace(); 
	   }
	}
}