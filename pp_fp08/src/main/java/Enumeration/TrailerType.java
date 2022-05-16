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
public enum TrailerType {
    TIPPER,
    OPEN,
    CLOSED,
    FRIDGE;
    
    
    @Override
    public String toString() {//https://stackoverflow.com/questions/2497521/implementing-tostring-on-java-enums
        switch (this) {
            case TIPPER:
                return "Tipper";
            case OPEN:
                return "Open";
            case CLOSED:
                return "Closed";
            case FRIDGE:
                return "Fridge";
            default:
                throw new IllegalArgumentException();
        }
    }
    
}
