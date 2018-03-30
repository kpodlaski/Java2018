package pl.lodz.uni.wfis.podlaski.javawyklad.wyklad3;
public class Przyklad3_11 extends Thread
{
	public static void main(String[] args)
	{
	Thread t1= new Thread ( new Watek() );
	Thread t2= new Thread ( new Watek() );
	Thread t3= new Thread ( new Watek() );
	t1.setPriority(Thread.NORM_PRIORITY);
	t2.setPriority(Thread.MIN_PRIORITY);
	t3.setPriority(Thread.NORM_PRIORITY);
	t1.start();
	t2.start();
	t3.start();
	}
}

class Watek extends Przyklad3_9
{
	private int priority;
	public void setPriority(int p)
	{
		this.priority=p;
	}
}