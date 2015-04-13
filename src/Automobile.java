
/**
 * @author Александр
 */
public class Automobile {

    private enum Colour {

        BLACK, WHITE, RED, GREY, BLUE, PINK
    }

    private Colour colour;
    private String carName;
    private int cylinder;
    private double weight;
    private double prise;
    private double fuel;
    private double speed;

    public double getFuel() {
        return fuel;
    }

    @Override
    public String toString() {
        return "Automobile{" + "colour=" + colour + ", carName=" + carName + ", cylinder=" + cylinder + ", weight=" + weight + ", prise=" + prise + ", fuel=" + fuel + ", speed=" + speed + '}';
    }

    
    
    public void setSpeed(double speed) {
          if (speed < 0) {
            throw new IllegalArgumentException("Speed can't be under zero");
        }
        this.speed = speed;
    }
    
    

    public void setFuel(double fuel) {
        if (fuel < 0) {
            throw new IllegalArgumentException("fuel consumption should be more then zero");
        }
        this.fuel = fuel;
    }

    public String getCarName() {
        return this.carName;
    }

    public void setCarName(String name) {
        if(name.length() < 0){
             throw new IllegalArgumentException("Name should be at least 1 symblo length");
        }
        this.carName = name;
    }

    public double getPrise() {
        return prise;
    }

    public int getCylinder() {
        return cylinder;
    }

    public double getWeight() {
        return weight;
    }

    public void setCylinder(int cylinder) {
        if (cylinder < 0) {
            throw new IllegalArgumentException("Should be at least one cylinder");
        }
        this.cylinder = cylinder;
    }

    public void setWeight(double weight) {
        if (weight < 0) {
            throw new IllegalArgumentException("Weight can't be under zero");
        }
        this.weight = weight;
    }

    public void setColour(String colour) {
        for (Colour value : Colour.values()) {
            if (colour.equalsIgnoreCase(value.name())) {
                this.colour = value;
            }
        }
        if (this.colour == null) {
            throw new IllegalArgumentException("Proper colour should be set");
        }

    }

    public void setPrise(int prise) {
        if (prise < 0) {
            throw new IllegalStateException("prise can't be under zero");
        }
        this.prise = prise;
    }

    public Colour getColour() {
        return colour;
    }

    public Automobile(int cylinder, double weight, int prise, String colour, double fuel,double  speed , String carName) {
        setCylinder(cylinder);
        setWeight(weight);
        setPrise(prise);
        setColour(colour);
        setFuel(fuel);
        setSpeed(speed);
        setCarName(carName);
    }

 
}
