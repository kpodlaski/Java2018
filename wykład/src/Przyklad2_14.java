package pl.lodz.uni.wfis.podlaski.javawyklad.wyklad2;

class Wyjatek extends Exception { }

public class Przyklad2_14
{										
	private static void  wyjatek()   throws Wyjatek {
		throw new Wyjatek(); 
	}
	private static void exception() throws Exception{
		try {
			System.out.println("Zignorujmy wyjatek");
			wyjatek();
		}
		catch (Wyjatek e) { }  
	}
	private static void rException() {
		try {
			System.out.println("Pominmy ten wyjatek");
			wyjatek();
		}
		catch (Wyjatek e) { throw new RuntimeException(e);}  
	}
	public static void main(String[] args) 	{
	   try {
			exception();
			System.out.println("Wyjatek zignorowano");
	   }
	   catch (Exception e) {
			e.printStackTrace(); 
	   }
	   rException();  
	   System.out.println("A program dziala dalej");
	}
}