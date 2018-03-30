package pl.lodz.uni.wfis.podlaski.wyklad;


class ObiektA
{
	int a,b;
	public ObiektA(int _a, int _b)
	{
		a=_a; b=_b;
	}
}
class ObiektB
{
	int a,b;
	public ObiektB(int _a, int _b)
	{
		a=_a; b=_b;
	}
	public boolean equals(ObiektB obB)
	{
		if (a==obB.a && b==obB.b) return true;
		return false;
	}
	public String toString() {return "Obiekt a="+a + " b="+b;}
}
public class Przyklad2_4
{
	public static void main(String[] args)
	{	
		ObiektA A1=new ObiektA(1,2);
		ObiektB B1=new ObiektB(1,2);
		System.out.println("Wypisz A1 : "+ A1);
		System.out.println("Wypisz B1 : "+ B1);
	}
}