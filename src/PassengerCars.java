/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Александр
 */
public abstract class PassengerCars extends Automobile{
    private int seats;
        
    public PassengerCars(int cylinder, double weight, int prise, String colour, double fuel,int seat,String carName , double  speed) {
        super(cylinder, weight, prise, colour, fuel,speed , carName);
          if(seat < 0) {
            throw  new IllegalArgumentException("Seats can't be bellow zero");
        }
        setSeats(seats);
    }

    public abstract void setSeats(int seats);

    public int getSeats() {
        return seats;
    }

}
