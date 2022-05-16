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
public class Bike extends Vehicle {
    
    protected int cubicCapacity;
    protected int wheelSize;
    
    
    public Bike(int vin, String brand, String model, String manufacteringDate,
    double kms, Condition condition, Origin origin, int price, int cubicCapacity,
    int wheelSize){
        super(vin, brand, model, manufacteringDate, kms, condition, origin, price);
        this.cubicCapacity = cubicCapacity;
        this.wheelSize = wheelSize;
    }

    /**
     * @return the cubicCapacity
     */
    public int getCubicCapacity() {
        return cubicCapacity;
    }

    /**
     * @param cubicCapacity the cubicCapacity to set
     */
    public void setCubicCapacity(int cubicCapacity) {
        this.cubicCapacity = cubicCapacity;
    }

    /**
     * @return the wheelSize
     */
    public int getWheelSize() {
        return wheelSize;
    }

    /**
     * @param wheelSize the wheelSize to set
     */
    public void setWheelSize(int wheelSize) {
        this.wheelSize = wheelSize;
    }

    @Override
    public String toString() {
        return "Bike{"+"ID=" +id + "\nvin=" + vin + ", brand=" + brand + ", model=" + model
                + ", manufacteringDate=" + manufacteringDate + ", kms=" + kms + 
                ", condition=" + condition + ", origin=" + origin + ", price=" +
                price + "cubicCapacity=" + cubicCapacity + ", wheelSize=" + wheelSize + '}';
    }
    
    
}
