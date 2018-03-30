package pl.lodz.uni.wfis.podlaski.javawyklad.wyklad3;
import java.util.concurrent.*;

public class Przyklad3_18
{
	public static void main(String[] args)
	{
		Swiatla swiatla = new Swiatla();
		Samochod car;
		swiatla.setDaemon(true);
		swiatla.start();
		for (int i=0; i<10; i++)
		{
			try{
			car = new Samochod("Samochod "+(i+1), swiatla);
			car.start();
			TimeUnit.MILLISECONDS.sleep(30);
			}
			catch(InterruptedException e) {e.printStackTrace();}
		}
	}
	
}

class Swiatla extends Thread
{
	private boolean red = true;
	private int czas = 200;
	public synchronized boolean czyMozna() 
	{
		try{
			while(red) {
				System.out.println("Sprawdza Swiatla");
				wait();
			}
		}
		catch (InterruptedException e) {e.printStackTrace();}
		return !red;
	}
	public synchronized void zmien()
	{
		if (red)
		{
			red = false;
			System.out.println("Zmiana swiatel na Zielone");
		}
		else 
		{ 
			red=true; 
			System.out.println("Zmiana swiatel na Czerwone");
		}
		notifyAll();
	}
	public void run()
	{
		while (true)
		{
			try
			{
				TimeUnit.MILLISECONDS.sleep(80);
				zmien();
			}
			catch(InterruptedException e) {e.printStackTrace();}
		}
	}
}

class Samochod extends Thread
{
	private Swiatla swiatla;
	private String name;
	public void run()
	{
		System.out.println(name + " Podjezdza do swiatel");
		if (swiatla.czyMozna()) System.out.println("Samochod "+name+" przejechal");
	}
	public Samochod(String nazwa, Swiatla sygn)
	{
		swiatla=sygn; name=nazwa;
	}
}