
/**
 * @author Александр
 */
public class Wagon extends Automobile implements CarBody {

    bodyType type;

    public Wagon(int cylinder, double weight, int prise, String colour, double fuel, double speed, String carName) {
        super(cylinder, weight, prise, colour, fuel, speed, carName);
        SetBody();
    }

  

    @Override
    public void SetBody() {
        this.type = bodyType.wagon;
    }

    @Override
    public bodyType Get() {
        return this.type;
    }

}
