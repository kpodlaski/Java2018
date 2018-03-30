package pl.lodz.uni.wfis.podlaski.javawyklad.wyklad3;
import java.io.*;

public class Przyklad3_6
{
	public static void main(String[] args)
	{
		try
		{	
			DataOutputStream zapis = new DataOutputStream(new BufferedOutputStream
									(new FileOutputStream("Przyklad3_6.out")));
			zapis.writeDouble(7.423);
			zapis.writeUTF("wpisano liczbe double");
			zapis.writeFloat(3.25f);
			zapis.writeUTF("wpisano liczbe float");
			zapis.close();
			DataInputStream odczyt = new DataInputStream(new BufferedInputStream
									(new FileInputStream("Przyklad3_6.out")));
			System.out.println(odczyt.readDouble());
			System.out.println(odczyt.readUTF());
			System.out.println(odczyt.readFloat());
			System.out.println(odczyt.readUTF());
		}
		catch (IOException e)
		{
			System.out.println("Nie moge czytac pliku");
		}
	}
}