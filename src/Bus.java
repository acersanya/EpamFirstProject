/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Александр
 */
public class Bus extends PassengerCars {

    public Bus(int cylinder, double weight, int prise, String colour, double fuel, int seat, String carName, double speed) {
        super(cylinder, weight, prise, colour, fuel, seat, carName, speed);
        setSeats(seat);
    }

   
    @Override
    public void setSeats(int seats) {
       if(seats < 9) {
           throw  new IllegalArgumentException("Seats in bus should be more then 9");
       }
    }
    
}
