package pl.lodz.uni.wfis.podlaski.javawyklad.wyklad4;
import java.util.*;

public class Przyklad4_3
{
	public static void main(String[] args)
	{
		Set zbior = new HashSet();     //LinkedHashSet()
		zbior.add("Eryk");
		zbior.add(new Integer(32));
		zbior.add("Szwed");
		System.out.println(zbior);
		Iterator element = zbior.iterator();  
		while (element.hasNext() )
		{
			System.out.println(element.next());  //unchecked unsave operation
 		}
		element = zbior.iterator();  
		while (element.hasNext() )
		{
			if (element.next().equals("Szwed")) element.remove();  //unchecked unsave operation
 		}
		System.out.println(zbior);
		System.out.println("Ponownie dodajemy Eryka");
		boolean czyDodane = zbior.add("Eryk");
		System.out.println(zbior+ "\t" + czyDodane);
		if (zbior.contains("Szwed")) System.out.println("Jest Szwed");
		else if (zbior.contains("Eryk")) System.out.println("Niema Szwed ale jest Eryk");
	}
}