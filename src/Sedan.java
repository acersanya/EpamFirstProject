/**
 * @author Александр
 */
public class Sedan extends Car implements CarBody {

    bodyType type;

    public Sedan(int cylinder, double weight, int prise, String colour, double fuel, int seat, String carName, double speed, int seats) {
        super(cylinder, weight, prise, colour, fuel, seat, carName, speed, seats);
        SetBody();
    }



    public void SetBody() {
        type = bodyType.sedan;
    }

    @Override
    public bodyType Get() {
        return this.type;
    }

}
