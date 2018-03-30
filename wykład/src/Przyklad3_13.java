package pl.lodz.uni.wfis.podlaski.javawyklad.wyklad3;
import java.util.Random;
import java.util.concurrent.*;

public class Przyklad3_13 extends Thread
{	
	private int krok;
	public Przyklad3_13(int step) {krok=step;}
	public void run()
	{	for (int x=0;x<10;x+=krok)
		{
			System.out.println(x +"  ");
		}
	}
	
	public static void main(String[] args)
	{
		Thread t1= new Thread(new Przyklad3_13(1));
		Thread t2= new Thread(new Przyklad3_13(-1));
		t2.setDaemon(true);
		t2.start();
		t1.start();
	}
}
