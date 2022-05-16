/*
 * @file: 
 * @author: Luis Oliveira <https://github.com/LuisCarlosOliveira>
 * @date
 * @brief
 */
package pp_fp06.pizza_restaurant.enums;

/**
 *
 * @author Luis Oliveira <https://github.com/LuisCarlosOliveira>
 */
public enum PizzaSize {
        SMALL,
        MEDIUM,
        BIG;
        
        public static String pizzaToString(PizzaSize size) {
            switch(size){
                case SMALL:
                    return" Pizza small";
                case BIG:
                    return "Pizza big";
                default:
                    return "Pizza medium";
            }
        }
    }


    
