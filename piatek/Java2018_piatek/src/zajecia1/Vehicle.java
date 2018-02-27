package zajecia1;

/**
 * Created by Krzysztof Podlaski on 23.02.2018.
 */
public class Vehicle {
    public String owner;
    public String regNr;
    public int yearOfProduction;

    public Vehicle(String owner, String regNr, int yearOfProduction) {
        this.owner = owner;
        this.regNr = regNr;
        this.yearOfProduction = yearOfProduction;
    }

    public Vehicle(){}

    @Override
    public String toString() {
        return "Vehicle{" +
                "owner='" + owner + '\'' +
                ", regNr='" + regNr + '\'' +
                ", year=" + yearOfProduction +
                '}';
    }
}
