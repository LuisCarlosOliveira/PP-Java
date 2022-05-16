/*
 * @file: 
 * @author: Luis Oliveira <https://github.com/LuisCarlosOliveira>
 * @date
 * @brief
 */
package Interfaces;

/**
 *
 * @author Luis Oliveira <https://github.com/LuisCarlosOliveira>
 */
public interface HipermarketService extends CoffeeService, MarketService, CreditService, GasService {
    
    public abstract int getPoints(double purchaseValue);
    
}
