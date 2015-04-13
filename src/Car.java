/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Александр
 */
public class Car extends PassengerCars{

    
    public Car(int cylinder, double weight, int prise, String colour, double fuel, int seat, String carName, double speed , int seats) {
        super(cylinder, weight, prise, colour, fuel, seat, carName, speed);
        setSeats(seat);
    }

    @Override
    public void setSeats(int seats) {
      if(seats < 0 || seats > 8 ) {
          throw  new IllegalArgumentException("Seats should be more then zero and less 9");
      }
    }
    
}
