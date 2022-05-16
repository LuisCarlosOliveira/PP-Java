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
public class Vehicle {
    private static int nextId = 0;
    protected int id;
    protected int vin;
    protected String brand;
    protected String model;
    protected String manufacteringDate;
    protected double kms;
    protected Condition condition;
    protected Origin origin;
    protected int price;

    public Vehicle(int vin, String brand, String model, String manufacteringDate,
    double kms, Condition condition, Origin origin, int price){
        this.vin = vin;
        this.brand = brand;
        this.model = model;
        this.manufacteringDate = manufacteringDate;
        this.kms = kms;
        this.condition = condition;
        this.origin = origin;
        this.price = price;
        this.id = ++nextId;
        
    }
    
    /**
     * @return the vin
     */
    public int getVin() {
        return vin;
    }

    /**
     * @param vin the vin to set
     */
    public void setVin(int vin) {
        this.vin = vin;
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the manufacteringDate
     */
    public String getManufacteringDate() {
        return manufacteringDate;
    }

    /**
     * @param manufacteringDate the manufacteringDate to set
     */
    public void setManufacteringDate(String manufacteringDate) {
        this.manufacteringDate = manufacteringDate;
    }

    /**
     * @return the kms
     */
    public double getKms() {
        return kms;
    }

    /**
     * @param kms the kms to set
     */
    public void setKms(double kms) {
        this.kms = kms;
    }

    /**
     * @return the condition
     */
    public Condition getCondition() {
        return condition;
    }

    /**
     * @param condition the condition to set
     */
    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    /**
     * @return the origin
     */
    public Origin getOrigin() {
        return origin;
    }

    /**
     * @param origin the origin to set
     */
    public void setOrigin(Origin origin) {
        this.origin = origin;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vehicle{"+"ID=" +id + "\nvin=" + vin + ", brand=" + brand + ", model=" + model
                + ", manufacteringDate=" + manufacteringDate + ", kms=" + kms + 
                ", condition=" + condition + ", origin=" + origin + ", price=" +
                price + '}';
    }

    
    
}
