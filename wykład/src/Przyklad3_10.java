package pl.lodz.uni.wfis.podlaski.javawyklad.wyklad3;
public class Przyklad3_10 extends Thread
{
	public static void main(String[] args)
	{
	Thread t1= new Thread ( new Przyklad3_9() );
	Thread t2= new Thread ( new Przyklad3_9() );
        Thread t3= new Thread ( new Przyklad3_9() );
	System.out.println("Zaczynam watek 1");
	t1.start();
	System.out.println("Zaczynam watek 2");
	t2.start();
        System.out.println("Zaczynam watek 3");
	t3.start();
	System.out.println("Koniec Programu");
	}
}
