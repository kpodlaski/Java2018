package pl.lodz.uni.wfis.podlaski.javawyklad.wyklad3;

import java.util.concurrent.*;
public class UcztaFilozofow
{
	private Filozof[] filozof;
	private  Widelec[] widelec;
	public UcztaFilozofow(int ilosc)
	{
		filozof = new Filozof[ilosc];
		widelec = new Widelec[ilosc+1];
		for (int i=0; i<ilosc;i++)
		{
			widelec[i]=new Widelec("Widelec:"+i);
		}
		widelec[ilosc]=widelec[0];
		for (int i=0; i<ilosc;i++)
		{
			filozof[i]=new Filozof("Filozof :"+i,widelec[i],widelec[i+1]);
			filozof[i].start();
		}
	}
	public static void main(String[] args)
	{
		new UcztaFilozofow(5);
	}
	

}
class Widelec 
{
	private boolean wolny=true;
	private String nazwa;
	private String stan="lezy";
	//Kwestia synchronizacji
	public Widelec(String nazwa)
	{
		this.nazwa=nazwa;
	}
	public synchronized boolean wez(Filozof filozof)
	{
		if (wolny) 
		{
			wolny=false;
			stan="wzi�ty przez "+filozof;
			return true;
		}
		return false;
	}
	public synchronized boolean  odloz(Filozof filozof)
	{
		wolny=true;
		stan = "lezy";
		notify();
		return true;
	}
	public String toString()
	{
		return nazwa+" "+stan;
	}	
}
	
class Filozof extends Thread
{
	private static int czas=200;
	private String nazwa;
	private  Widelec lewyWidelec;
	private  Widelec prawyWidelec;
	private void wezWidelec(Widelec widelec)
	{
		while (!widelec.wez(this))
		{
		};
	}
	private void odlozWidelec(Widelec widelec)
	{
		widelec.odloz(this);
	}
	public Filozof(String nazwa, Widelec lewy, Widelec prawy)
	{
		this.nazwa=nazwa;
		lewyWidelec=lewy;
		prawyWidelec=prawy;
	}
	public Filozof(String nazwa, Widelec lewy, Widelec prawy, int czas)
	{
		this(nazwa,lewy,prawy);
		this.czas=czas;
	}
	public String toString()
	{
		return nazwa;
	}
	public void run()
	{
		while(true)
		{
			try 
			{
				wezWidelec(lewyWidelec);
				System.out.println(nazwa+" Mam widelec lewy");;
				wezWidelec(prawyWidelec);
				System.out.println(nazwa+" Mam oba widelce i jem");
				TimeUnit.MILLISECONDS.sleep(czas);
				System.out.println(nazwa+" Zjadlem");
				odlozWidelec(lewyWidelec);
				System.out.println(nazwa+" Polozylem widelec lewy");
				odlozWidelec(prawyWidelec);
				System.out.println(nazwa+" Polozylem oba widelce");
				System.out.println(nazwa+" Teraz Mysle"); 
				TimeUnit.MILLISECONDS.sleep(czas);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}