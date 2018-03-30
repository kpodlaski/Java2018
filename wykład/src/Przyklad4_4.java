package pl.lodz.uni.wfis.podlaski.javawyklad.wyklad4;
import java.util.*;

public class Przyklad4_4
{
	public static void main(String[] args)
	{
		Map zbior = new HashMap();     
		zbior.put("Eryk","Szwed");
		zbior.put("Wiek",new Integer(32));
		zbior.put("Zawod","Kolejarz");
		System.out.println(zbior);
		System.out.println(zbior.get("Eryk"));
		boolean czyKlucz = zbior.containsKey("Eryk");
		System.out.println( czyKlucz);
		if (zbior.containsValue("Kolejarz"))  System.out.println("Obiekt Jest Kolejarzem");
	}
}