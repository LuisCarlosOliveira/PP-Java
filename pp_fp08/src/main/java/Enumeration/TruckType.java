/*
 * @file: 
 * @author: Luis Oliveira <https://github.com/LuisCarlosOliveira>
 * @date
 * @brief
 */
package Enumeration;

/**
 *
 * @author Luis Oliveira <https://github.com/LuisCarlosOliveira>
 */
public enum TruckType {
    TRUCK,
    TIR;
    
    @Override
    public String toString() {//https://stackoverflow.com/questions/2497521/implementing-tostring-on-java-enums
        switch (this) {
            case TRUCK:
                return "Truck";
            case TIR:
                return "Tir";
            default:
                throw new IllegalArgumentException();
        }
    }
}
