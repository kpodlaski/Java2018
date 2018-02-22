package zajecia1;

import java.util.Arrays;

public class PierwszaKlasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ala ma kota");
		
		Vehicle v = new Vehicle("Alicja",1616);
		System.out.println(v.owner);
		System.out.println("Vehicle " +v);
		
		Vehicle[] vh = new Vehicle[4];
		vh[0]=new Vehicle("Tamara",1992);
		vh[1]=new Vehicle("Tomasz",2002);
		vh[2]=new Vehicle("Ilona",2012);
		vh[3]=new Vehicle("Tadeusz",1982);
		
		System.out.println("==============================");
		for(int i=0; i<vh.length; i++){
			System.out.println(vh[i]);
		}
		
		Arrays.sort(vh);
		
		System.out.println("==============================");
		for(int i=0; i<vh.length; i++){
			System.out.println(vh[i]);
		}
		
	}

}
