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
public enum contractType {
    PARTIAL,
    INTEGRAL;

    @Override
    public String toString(){
        switch (this) {
            case PARTIAL:
                return "Partial";
            case INTEGRAL:
                return "Integral";
            default:
                throw new IllegalArgumentException();
        }
    }
}


