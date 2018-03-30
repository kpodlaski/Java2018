package pl.lodz.uni.wfis.podlaski.javawyklad.wyklad3;
public class Przyklad3_16
{	
	private int x=0;
	public void next()
	{	
			x++;
			x++;
	}
	public int wartosc() { return x;}
	
	public static void main(String[] args)
	{
		Przyklad3_16 licz=new Przyklad3_16();
		Thread test = new Thread(new Tester(licz));
		test.start();
		while (true)  licz.next();
	}
}
	class Tester implements Runnable
	{
		Przyklad3_16 licznik;
		public Tester (Przyklad3_16 l) {licznik=l;}
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
