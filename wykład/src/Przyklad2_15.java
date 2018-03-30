package pl.lodz.uni.wfis.podlaski.javawyklad.wyklad2;


public class Przyklad2_15 {
	private static void  wyjatek()   throws Wyjatek {
		throw new Wyjatek(); 
	}
	private static void tensam() throws Wyjatek{
		try {
			wyjatek();
		}
		catch (Wyjatek e) {
			System.out.println("Wyjatek w funkcji tensam");
			throw e;    			//Ten sam z zachowaniem informacji o pochodzeniu
		}	}
	private static void nanowo() throws Wyjatek{
		try {
			wyjatek();
		}
		catch (Wyjatek e) {
			System.out.println("Wyjatek w funkcji na nowo");
			throw (Wyjatek) e.fillInStackTrace();    //Ten sam ale nowa informacja o pochodzeniu
		} 	}
	public static void main(String[] args) 	{
	   try {
			tensam();
	   }
	   catch (Exception e) {
			e.printStackTrace(); 
	   }
	   try {
			nanowo();
	   }
	   catch (Exception e) {
			e.printStackTrace(); 
	   }}
}