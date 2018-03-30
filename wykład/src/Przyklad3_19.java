package pl.lodz.uni.wfis.podlaski.javawyklad.wyklad3;
import java.io.*; import java.util.concurrent.*;
public class Przyklad3_19
{
	public static void main(String[] args)
	{
		try
		{
		Nadawca nadawca = new Nadawca();
		Odbiorca odbiorca = new Odbiorca(nadawca);
		nadawca.start();
		odbiorca.start();
		}
		catch (IOException e) {e.printStackTrace();}
	}
}

class Nadawca extends Thread
{
	String msg = "Ala ma Kota";
	private PipedWriter medium = new PipedWriter();
	public PipedWriter polaczenie() {return medium;}
	public void run()
	{
		try{
		for (int i=0;i<msg.length();i++)
		{
			medium.write(msg.charAt(i));
			TimeUnit.MILLISECONDS.sleep(10);
		}}
		catch (IOException e) {e.printStackTrace();}
		catch (InterruptedException e) {e.printStackTrace();}
	}
}
class Odbiorca extends Thread
{
	private PipedReader medium;
	public Odbiorca (Nadawca nadawca) throws IOException 
	{ medium = new PipedReader(nadawca.polaczenie());}
	public void run ()
	{	
		try{
		while (true) { 
		System.out.println("Odebrano: "+(char) medium.read());
		// Brak sprawdzania ko�ca potoku wi�c wyst�pi wyj�tek		
		}}
		catch (IOException e) {e.printStackTrace();}
	}
}