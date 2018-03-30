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
}
public class Przyklad2_3
{
	public static void main(String[] args)
	{	
		ObiektA A1=new ObiektA(1,2);
		ObiektA A2=new ObiektA(1,2);
		ObiektB B1=new ObiektB(1,2);
		ObiektB B2=new ObiektB(1,2);
		System.out.println("Wynik porownania A1==A2 : "+ (A1==A2));
		System.out.println("Wynik porownania A1.equals(A2) : "+ (A1.equals(A2)));
		System.out.println("Wynik porownania B1==B2 : "+ (B1==B2));
		System.out.println("Wynik porownania B1.equals(B2) : "+ (B1.equals(B2)));
	}
}