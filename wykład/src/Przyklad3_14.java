package pl.lodz.uni.wfis.podlaski.javawyklad.wyklad3;
import java.util.Random;
import java.util.concurrent.*;

public class Przyklad3_14 extends Thread
{	
	private String name;
	public Przyklad3_14(String text) {name=text;}
	public void run()
	{	for (int x=0;x<10;x++)
		{
			System.out.println(name+" : "+x);
			if (x==5) yield();
		}
		
	}
	
	public static void main(String[] args)
	{
		Thread t1= new Thread(new Przyklad3_14("t1"));
		Thread t2= new Thread(new Przyklad3_14("t2"));
		t1.start();
		t2.start();
	}
}
