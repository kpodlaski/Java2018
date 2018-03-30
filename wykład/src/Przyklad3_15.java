package pl.lodz.uni.wfis.podlaski.javawyklad.wyklad3;

public class Przyklad3_15 extends Thread
{	
	private Thread watek ;
	private String name;
	public Przyklad3_15(String text)
	{
		name=text;
		watek = new Thread(new Przyklad3_9());
		watek.start();
	}	
	public void run()
	{	
		try
		{
			watek.join();
		}
		catch (InterruptedException e) {e.printStackTrace();}
		for (int x=0;x<10;x++)
		{
			System.out.println(name+" : "+x);
		}
		
	}
	
	public static void main(String[] args)
	{
		Thread t= new Thread(new Przyklad3_15("t"));
		t.start();
	}
}
