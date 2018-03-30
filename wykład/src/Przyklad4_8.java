package pl.lodz.uni.wfis.podlaski.javawyklad.wyklad4;
import java.util.*;

public class Przyklad4_8
{	public static void main(String[] args)
	{try{
		Class typ = Class.forName("pl.lodz.uni.wfis.podlaski.javawyklad.wyklad4.Pociag");
		System.out.println(typ);
		System.out.println(typ.getName());
		Pociag pociag = new Pociag("Telimena");
		Class typ2 = pociag.getClass();
		System.out.println(typ2);
		System.out.println(typ2.getName());
		Class typ3 = Pociag.class;		//Litera�
		System.out.println(typ3);
		System.out.println(typ3.getName());
		System.out.println(typ.equals(typ2));
		System.out.println("Nazwa klasy pierwotnej " + typ.getSuperclass().getName());
                System.out.println("Wypis wszystkich zadeklarowanych metod:" + Arrays.toString(typ.getDeclaredMethods()));
                System.out.println("Wypis wszystkich metod obiektów klasy: " + Arrays.toString(typ.getMethods()));
		}
		catch (ClassNotFoundException e) {e.printStackTrace();}
	}
}
class Pojazd
{
	protected String nazwa;
	public Pojazd(String nazwa) {this.nazwa=nazwa;}
	public String toString() {return nazwa;}
}
class Pociag extends Pojazd
{
	static String typ = "Pociag";
        private String stacjaDocelowa = "dokądkolwiek";
	public Pociag(String nazwa) { super(nazwa);};
	public String toString() {return typ+" : "+super.toString();}
        public String dokad() {return stacjaDocelowa;}
}
