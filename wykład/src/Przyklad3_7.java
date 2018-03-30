package pl.lodz.uni.wfis.podlaski.javawyklad.wyklad3;
import java.io.*;

public class Przyklad3_7
{
	public static void main(String[] args)
	{
		try
		{	
			BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
			String wejscie;
			while ( (wejscie=stdin.readLine())!= null && wejscie.length()!=0)
			{
				System.out.println(wejscie);
			}
			//Pusty wiersz przewywa dzia�anie
		}
		catch (IOException e)
		{
			System.out.println("Nie moge czytac pliku");
		}
	}
}