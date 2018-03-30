package pl.lodz.uni.wfis.podlaski.javawyklad.wyklad3;
import java.io.*;

public class Przyklad3_3
{
	public static void main(String[] args)
	{
		String nazwaPliku="src\\pl\\lodz\\uni\\wfis\\podlaski\\javawyklad\\wyklad3\\Przyklad3_3.java";
		try
		{	
			String doOdczytania = Przyklad3_1.odczyt(nazwaPliku);
			DataInputStream wejscie = new DataInputStream(
						new ByteArrayInputStream(doOdczytania.getBytes()));
							//String.getBytes() zwraca String jako tablic� bajt�w
			while (true)   							
			{										 
				System.out.print(wejscie.readByte());
			}
		}
		catch (EOFException e)
		{
			System.err.println("\nKoniec Strumienia danych");
		}
		catch (IOException e)
		{
			System.out.println("Nie moge czytac pliku");
		}
	}
}