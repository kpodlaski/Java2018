package pl.lodz.uni.wfis.podlaski.javawyklad.wyklad3;
public class Przyklad3_17
{	
	private int x=0;
	public synchronized void next()
	{	
		x++;
		x++;
		
	}
	public synchronized int wartosc() { return x;}
	//Dwie zsynchronizowane metody next() i waro��() nie mog�  jednocze�nie mie� 
	//dost�pu do x
	public static void main(String[] args)
	{
		Przyklad3_17 licz=new Przyklad3_17();
		Thread test = new Thread(new Tester2(licz));
		test.start();
		while (true)  licz.next();
	}
}
	class Tester2 implements Runnable
	{
		Przyklad3_17 licznik;
		public Tester2 (Przyklad3_17 l) {licznik=l;}
		public void run()
		{	int x;
			while(true)
			{
				x=licznik.wartosc();
				if (x % 2 !=0 ) 
				{
					System.out.println("x jest nieparzyste :"+x);
					System.exit(1);
				}
			}
		}
	}
