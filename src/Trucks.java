/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Александр
 */
public final class Trucks extends Automobile{
    private double weightToCarry;

    public Trucks(int cylinder, double weight, int prise, String colour, double fuel, double speed, String carName, double weightToCarry) {
        super(cylinder, weight, prise, colour, fuel, speed, carName);
        setWeightToCarry(weightToCarry);
    }

    public void setWeightToCarry(double weightToCarry) {
        if(weightToCarry < 0){
            throw  new IllegalArgumentException("Weight to carry can not be under zero");
        }
        this.weightToCarry = weightToCarry;
    }

    public double getWeightToCarry() {
        return weightToCarry;
    }
    
 
    
}
