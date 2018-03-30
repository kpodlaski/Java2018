package pl.lodz.uni.wfis.podlaski.javawyklad.wyklad3;
import java.io.*;

public class Przyklad3_4
{
	public static void main(String[] args)
	{
		String nazwaPliku="Przyklad3_4.out";
		try
		{	
			// dane do zapisu
			BufferedReader text=new BufferedReader( new StringReader
								(Przyklad3_1.odczyt("src\\pl\\lodz\\uni\\wfis\\podlaski\\javawyklad\\wyklad3\\Przyklad3_4.java")));
			PrintWriter zapis=new PrintWriter(new BufferedWriter
								(new FileWriter(nazwaPliku)));
			int linia =1;
			String temp;
			while ((temp=text.readLine())!=null)
			{
				zapis.println("["+linia++ +"]" + temp);
			}
			zapis.close();
			System.out.println(Przyklad3_1.odczyt(nazwaPliku));
		}
		catch (IOException e)
		{
			System.out.println("Nie moge czytac pliku");
		}
	}
}