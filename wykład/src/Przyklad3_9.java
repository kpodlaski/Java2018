package pl.lodz.uni.wfis.podlaski.javawyklad.wyklad3;

public class Przyklad3_9 implements Runnable
{
	public static int iloscWatkow=0;
	private int nrWatku=0;
	private int licznik=0;
        private double temp = 0.0;
	public Przyklad3_9()
	{
		nrWatku=++iloscWatkow;
	}
	public void run()
	{
		while (licznik<2000)
		{
                    if (licznik%100==0) System.out.println("watek["+nrWatku+"]"+licznik+"  ");
                    temp+= Math.log(licznik);
                    licznik++;
		}
	}
	public static void main(String[] args)
	{
	Przyklad3_9 w1= new Przyklad3_9();
	Przyklad3_9 w2= new Przyklad3_9();
	System.out.println("Zaczynam watek 1");
	w1.run();
	System.out.println("Zaczynam watek 2");
	w2.run();
	System.out.println("Koniec Programu");
	}
}

//Jak wida� sam interfejs Runnable nie daje nam �adnego efektu w�tku