package zajecia1;

public class Vehicle implements Comparable{
	public String owner = new String("Alan");
	public int yearOfProduction = 12;
	
	public Vehicle(String owner, int yearOfProduction) {
		this.owner = owner;
		this.yearOfProduction = yearOfProduction;
	}

	
	public String toString() {
		return "Vehicle [owner=" + owner + ", yearOfProduction=" + yearOfProduction + "]";
	}


	@Override
	public int compareTo(Object arg0) {
		Vehicle b =(Vehicle) arg0;
		return yearOfProduction-b.yearOfProduction;
	}
	
	
	public void mojaMetoda(){
		
	}
	

}
