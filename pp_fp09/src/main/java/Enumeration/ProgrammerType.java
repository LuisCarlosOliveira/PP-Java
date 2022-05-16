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
public enum ProgrammerType {
    JUNIOR,
    SENIOR;
    
   public String toString() {//https://stackoverflow.com/questions/2497521/implementing-tostring-on-java-enums
        switch (this) {
            case JUNIOR:
                return "Junior";
            case SENIOR:
                return "Senior";
            default:
                throw new IllegalArgumentException();
        }
    } 
    
}
