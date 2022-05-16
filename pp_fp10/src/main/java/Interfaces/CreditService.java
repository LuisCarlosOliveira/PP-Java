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
public interface CreditService {
    
    public double getAnnualRate();
    
    public void setAnnualRate(double r);
    
    public double computeMonthlyPayment(double ammount, int months);
    
}
