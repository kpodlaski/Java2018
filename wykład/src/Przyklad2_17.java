package pl.lodz.uni.wfis.podlaski.javawyklad.wyklad2;

public class Przyklad2_17
{						
	public int i;
	public static int s=3;
	public Przyklad2_17() throws Exception
	{
		i=7;
		s=2;
		throw new Exception("Blad z konstruktora");
	}
	
	public static void main(String[] args) 	{
	   Przyklad2_17 p= null;
	   // p=new Przyklad2_16();
	   System.out.println("Zmienna statyczna na początku ");
	   System.out.println("p.s="+p.s);
	   try {
			 p=new Przyklad2_17();
	   }
	   catch (Exception e) {
			e.printStackTrace(); 
	   }
	   System.out.println("p="+p);
	   System.out.println("Obiekt p nie powstal, jednak zmieniono zmienna statyczna");
	   System.out.println("p.s="+p.s);
	}
}