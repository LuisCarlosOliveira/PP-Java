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
public interface GasService {
    
    public double getGasPrice();
    
    public void setGasPrice(double p);
    
    public double getGasTotal(double litres); 
    
}
