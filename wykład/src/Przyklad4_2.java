package pl.lodz.uni.wfis.podlaski.javawyklad.wyklad4;
import java.util.*;

public class Przyklad4_2
{
	public static void main(String[] args)
	{
		List lista = new ArrayList();
		lista.add("Eryk");
		lista.add(new Integer(32));
		lista.add("Szwed");
		for (int i=0; i<lista.size();i++) System.out.println(lista.get(i));
		System.out.println(lista);
		Iterator element = lista.iterator();  
		while (element.hasNext() )
		{
			System.out.println(element.next());  //unchecked unsave operation
 		}
		element = lista.iterator();  
		while (element.hasNext() )
		{
			if (element.next().equals("Szwed")) element.remove();  //unchecked unsave operation
 		}
		System.out.print(lista);
	}
}