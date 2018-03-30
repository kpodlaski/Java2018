package pl.lodz.uni.wfis.podlaski.javawyklad.wyklad3;
import java.util.Random;
import java.util.concurrent.*;

public class Przyklad3_12 extends Thread
{	
	private static int ilosc=0;
	private int id=++ilosc;
 	private static Random rand = new Random();
	public void run()
	{	int x=0;
		while (x<5)
			{
				System.out.print(id+":"+x++ +"  ");
			}
		try{		
		if (rand.nextInt(10)>5) 
			{
				System.out.println("Watek "+id+"spi");
				TimeUnit.MILLISECONDS.sleep(100);
			}
		}
		catch (InterruptedException e)
			{e.printStackTrace();}
		while (x<10)
			{
				System.out.print(id+":"+x++ +"  ");
			}
	}
	
	public static void main(String[] args)
	{
		Thread t;
		for (int s=0;s<5;s++)
		{
			t= new Thread ( new Przyklad3_12() );
			t.start();
		}
	}
}
