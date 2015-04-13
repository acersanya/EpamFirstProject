
public class Coupe extends Car implements CarBody{

    bodyType type;

    public Coupe(int cylinder, double weight, int prise, String colour, double fuel, int seat, String carName, double speed, int seats) {
        super(cylinder, weight, prise, colour, fuel, seat, carName, speed, seats);
        SetBody();
    }
    



    @Override
    public void SetBody() {
        this.type = bodyType.coupe;
        }

    @Override
    public bodyType Get() {
       return this.type;
    }
   
    
    
}
