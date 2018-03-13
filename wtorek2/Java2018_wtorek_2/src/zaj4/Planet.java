package zaj4;

/**
 * Created by Krzysztof Podlaski on 13.03.2018.
 */
public class Planet {
    private double mass;
    private String name;
    private Point2D coords;



    public Planet(double mass, String name, Point2D coords) {
        this.mass = mass;
        this.name = name;
        this.coords = coords;
    }

    public Planet(double mass, String name) {
        this.mass = mass;
        this.name = name;
        coords = new Point2D();
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Point2D getCoords() {
        return coords;
    }

    public void setCoords(Point2D coords) {
        this.coords = coords;
    }
}
