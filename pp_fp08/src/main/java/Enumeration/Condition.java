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
public enum Condition {
    NEW,
    USED;

    @Override
    public String toString() {//https://stackoverflow.com/questions/2497521/implementing-tostring-on-java-enums
        switch (this) {
            case NEW:
                return "New";
            case USED:
                return "Used";
            default:
                throw new IllegalArgumentException();
        }
    }
}
