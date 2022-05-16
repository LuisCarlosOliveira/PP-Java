/*
 * @file: 
 * @author: Luis Oliveira <https://github.com/LuisCarlosOliveira>
 * @date
 * @brief
 */
package pp_fp08.stand;

import Enumeration.Condition;
import Enumeration.Origin;

/**
 *
 * @author Luis Oliveira <https://github.com/LuisCarlosOliveira>
 */
public class Car extends Vehicle {

    protected int occupantsNumber;
    protected int doorsNumber;

    public Car(int vin, String brand, String model, String manufacteringDate,
            double kms, Condition condition, Origin origin, int price, int occupantsNumber,
            int doorsNumber) {
        super(vin, brand, model, manufacteringDate, kms, condition, origin, price);
        
        if (this.condition == Condition.USED) {
            super.price *= 0.7;
        }
        this.occupantsNumber = occupantsNumber;
        this.doorsNumber = doorsNumber;
    }

    public Car(int vin, String brand, String model, String manufacteringDate,
            double kms, Condition condition, Origin origin, int price, int occupant) {
        super(vin, brand, model, manufacteringDate, kms, condition, origin, price);
        if (super.condition == Condition.USED) { //perguntar ao professor se super ou this ou sem nada
            super.price *= 0.7;
        }
        this.doorsNumber = 3;
        this.occupantsNumber = occupantsNumber;
    }

    /**
     * @return the occupantsNumber
     */
    public int getOccupantsNumber() {
        return occupantsNumber;
    }

    /**
     * @param occupantsNumber the occupantsNumber to set
     */
    public void setOccupantsNumber(int occupantsNumber) {
        this.occupantsNumber = occupantsNumber;
    }

    /**
     * @return the doorsNumber
     */
    public int getDoorsNumber() {
        return doorsNumber;
    }

    /**
     * @param doorsNumber the doorsNumber to set
     */
    public void setDoorsNumber(int doorsNumber) {
        this.doorsNumber = doorsNumber;
    }

    @Override
    public String toString() {
        return "Car{"+"ID=" +id + "\nvin=" + vin + ", brand=" + brand + ", model=" + model + 
                ", manufacteringDate=" + manufacteringDate + ", kms=" + kms + 
                ", condition=" + condition + ", origin=" + origin + ", price=" 
                + price + ", occupantsNumber=" + occupantsNumber + ", doorsNumber=" 
                + doorsNumber + '}';
    }

    

    
}
