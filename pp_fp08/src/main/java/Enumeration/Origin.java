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
public enum Origin {
    NATIONAL,
    IMPORTED;
    
    @Override
    public String toString() {//https://stackoverflow.com/questions/2497521/implementing-tostring-on-java-enums
        switch (this) {
            case NATIONAL:
                return "National";
            case IMPORTED:
                return "Imported";
            default:
                throw new IllegalArgumentException();
        }
    }
}
