/**
 *
 * @author Александр
 */
public class Jeep extends Automobile implements CarBody{
    bodyType type;

    public Jeep(int cylinder, double weight, int prise, String colour, double fuel, double speed, String carName) {
        super(cylinder, weight, prise, colour, fuel, speed, carName);
        SetBody();
    }


    @Override
    public void SetBody() {
      type = bodyType.jeep;
    }

    @Override
    public bodyType Get() {
        return this.type;
    }
    
}
