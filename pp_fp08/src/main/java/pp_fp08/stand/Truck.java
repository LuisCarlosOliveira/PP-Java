/*
 * @file: 
 * @author: Luis Oliveira <https://github.com/LuisCarlosOliveira>
 * @date
 * @brief
 */
package pp_fp08.stand;

import Enumeration.Condition;
import Enumeration.Origin;
import Enumeration.TruckType;

/**
 *
 * @author Luis Oliveira <https://github.com/LuisCarlosOliveira>
 */
public class Truck extends Vehicle {

    private int length;
    private int load;
    private TruckType truck;
    private Trailer trailer;

    public Truck(int vin, String brand, String model, String manufacteringDate,
            double kms, Condition condition, Origin origin, int price, int length,
            int load, TruckType truck, Trailer trailer) {
        super(vin, brand, model, manufacteringDate, kms, condition, origin, price);
        if (this.condition == Condition.NEW) {
            super.price *= 0.95;
        } else {
            super.price *= 0.85;
        }
        this.length = length;
        this.load = load;
        this.truck = truck;
        this.trailer = trailer;

    }

    public Truck(int vin, String brand, String model, String manufacteringDate,
            double kms, Condition condition, Origin origin, int price, int length,
            int load, TruckType truck) {
        super(vin, brand, model, manufacteringDate, kms, condition, origin, price);
        if (condition == Condition.USED) {
            super.price *= 0.85;
        }
        this.length = length;
        this.load = load;
        this.truck = truck;

    }

    /**
     * @return the length
     */
    public int getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(int length) {
        this.length = length;
    }

    /**
     * @return the load
     */
    public int getLoad() {
        return load;
    }

    /**
     * @param load the load to set
     */
    public void setLoad(int load) {
        this.load = load;
    }

    /**
     * @return the truck
     */
    public TruckType getTruck() {
        return truck;
    }

    /**
     * @param truck the truck to set
     */
    public void setTruck(TruckType truck) {
        this.truck = truck;
    }

    /**
     * @return the trailer
     */
    public Trailer getTrailer() {
        return trailer;
    }

    /**
     * @param trailer the trailer to set
     */
    public void setTrailer(Trailer trailer) {
        this.trailer = trailer;
        
    }

    @Override
    public String toString() {
        return "Truck{"+"ID=" +id + "\nvin=" + vin + ", brand=" + brand + ", model=" + model
                + ", manufacteringDate=" + manufacteringDate + ", kms=" + kms + 
                ", condition=" + condition + ", origin=" + origin + ", price=" +
                price + "length=" + length + ", load=" + load + ", truck=" + truck 
                + ", trailer=" + trailer + '}';
    }
     
}
