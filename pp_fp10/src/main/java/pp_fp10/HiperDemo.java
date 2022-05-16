/*
 * @file: 
 * @author: Luis Oliveira <https://github.com/LuisCarlosOliveira>
 * @date
 * @brief
 */
package pp_fp10;

import Interfaces.CoffeeService;
import Interfaces.CreditService;
import Interfaces.GasService;
import Interfaces.HipermarketService;
import Interfaces.MarketService;
        

/**
 *
 * @author Luis Oliveira <https://github.com/LuisCarlosOliveira>
 */
public class HiperDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       GasStation g1 = new GasStation("Galp Pequena", 123456789, 1.98);
       System.out.println(g1.toString());
       
       LargeGasStation l1 = new LargeGasStation("Galp Central", 1924648, 1.98, 0.60);
       System.out.println(l1.toString());
       
    }
    
}
