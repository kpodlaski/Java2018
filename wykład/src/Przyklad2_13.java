package pl.lodz.uni.wfis.podlaski.javawyklad.wyklad2;


public class Przyklad2_13
{	
	public static void main(String[] args) 	{
	   try {
			throw new Exception("Moj Wyjatek");
	   }
	   catch (Exception e) 
		{
			System.out.println("getMessage() "+e.getMessage());
			System.out.println("toString() "+e);
			System.out.println("printStackTrace() :");
                        System.out.println("");
			e.printStackTrace();
	
		}
	}
}