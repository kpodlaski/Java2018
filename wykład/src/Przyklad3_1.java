package pl.lodz.uni.wfis.podlaski.javawyklad.wyklad3;
import java.io.*;

public class Przyklad3_1
{
	public static String odczyt(String nazwaPliku)  throws IOException
	{
		BufferedReader plik = new BufferedReader(new FileReader(nazwaPliku));
		String temp;
		StringBuilder sBuilder = new StringBuilder();
		while (( temp=plik.readLine() ) != null)
		{
			sBuilder.append(temp+"\n");
		}
		plik.close();
		return sBuilder.toString();
	}
    public static void main(String[] args)
	{	
		try
		{
                        String nazwaPliku="src\\pl\\lodz\\uni\\wfis\\podlaski\\javawyklad\\wyklad3\\Przyklad3_1.java";
			System.out.print(odczyt(nazwaPliku));
		}
		catch (IOException e)
		{
			System.out.println("Nie moge czytac pliku");
		}
	}
}