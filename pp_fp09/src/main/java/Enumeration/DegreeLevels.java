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
public enum DegreeLevels {
    DEGREE,
    MASTER,
    DOCTORATE;

    public String toString() {
        switch (this) {
            case DEGREE:
                return "Degree";
            case MASTER:
                return "Master";
            case DOCTORATE:
                return "Doctorate";
            default:
                throw new IllegalArgumentException();
        }
    }
}
