package pl.lodz.uni.wfis.podlaski.javawyklad.wyklad4;
import java.util.Arrays;

public class Przyklad4_1
{
	public static void main(String[] args)
	{
		String[] tab = new String[] {"tadeusz", "Izabela", "Agnieszka"};
		String[] tab2 = tab.clone(); // tworzenie kopi tablicy
		for (int i=0; i<tab.length;i++) System.out.println(tab[i]);
		tab2[2] = "S";
		for (int i=0; i<tab.length;i++) System.out.println("Orginal :" +tab[i] +"\t Kopia :"+ tab2[i]);
		Arrays.sort(tab);
		for (int i=0; i<tab.length;i++) System.out.println(tab[i]);
		int index = Arrays.binarySearch(tab,"Izabela")+1; // Tablica  musi byc posortowana
		System.out.println("Izabela jest elementem nr:"+index);
	}
}