package pl.lodz.uni.wfis.podlaski.javawyklad.wyklad3;

import java.io.*;

public class Przyklad3_2
{
	public static void main(String[] args)
	{
		String nazwaPliku="src\\pl\\lodz\\uni\\wfis\\podlaski\\javawyklad\\wyklad3\\Przyklad3_2.java";
		try
		{	
			String doOdczytania = Przyklad3_1.odczyt(nazwaPliku);
			StringReader wejscie = new StringReader(doOdczytania);
			int znak;
			StringBuffer sBuffer = new StringBuffer();
			while (( znak=wejscie.read() ) != -1)   //Warunek wyj�cia znak=-1
			{										//read() zwraca bajt 
				sBuffer.append((char) znak);  		//Potrzbene wi�c rzutowanie na char
			}
			// 	wejscie.close();			Wej�cie z pami�ci nie trzeba zamuka�, cho� wywo�a� metod� da si� :)
			System.out.print(sBuffer);
		}
		catch (IOException e)
		{
			System.out.println("Nie moge czytac pliku");
		}
	}
}