
import java.util.ArrayList;

/**
 * @author Александр
 */
public class AutoPark implements Filter {

    private double prize = 0;
    private ArrayList<Automobile> myPark;

    public AutoPark() {
        this.myPark = new ArrayList<>();
    }

    public void setPrize(Automobile auto) {
        this.prize += auto.getPrise();
    }

    public double getPrize() {
        return this.prize;
    }

    public ArrayList<? extends Automobile> getMyPark() {
        return myPark;
    }
    
    public void addAuto(Automobile a){
        myPark.add(a);
        setPrize(a);
    }

    public boolean apply(Automobile auto, double a, double b) {
        return auto.getFuel() > a && auto.getFuel() < b;
    }

    public ArrayList<? extends Automobile> getAutoFuelRange(double a, double b) {
        ArrayList<  Automobile> res = new ArrayList<>();

        getMyPark().stream().filter((auto) -> (apply(auto, a, b) == true)).forEach((auto) -> {
            res.add(auto);
        });
        if(res.size()==0){
            System.out.println("No Automobiles with such criteria");
        }
        return res;
    }

    public static void main(String[] args) {
        AutoPark a = new AutoPark();
        a.addAuto(new  Jeep(10, 2500, 10500, "BLACK", 6.5, 150, "Suzuki"));
        a.addAuto(new Wagon(5, 1800, 9800, "WHITE", 7.5, 120,"Volvo"));
       ArrayList<Automobile> s = (ArrayList<Automobile>) a.getAutoFuelRange(1,2);
        for(Automobile auto:s){
            System.out.println(auto);
        }
          
    }
}
