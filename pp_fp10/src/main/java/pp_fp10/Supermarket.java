/*
 * @file: 
 * @author: Luis Oliveira <https://github.com/LuisCarlosOliveira>
 * @date
 * @brief
 */
package pp_fp10;

import Interfaces.MarketService;

/**
 *
 * @author Luis Oliveira <https://github.com/LuisCarlosOliveira>
 */
public class Supermarket extends Company implements MarketService {
    
    private double potatoesPrice;
    
    public Supermarket(String name, int vatNumber, double potatoesPrice){
        super(name, vatNumber);
        this.potatoesPrice = potatoesPrice;
    }

    /**
     * @return the potatoesPrice
     */
    @Override
    public double getPotatoesPrice() {
        return potatoesPrice;
    }

    @Override
    public void setPotatoesPrice(double potatoesPrice) {
        this.potatoesPrice = potatoesPrice;
    }
    
    @Override
    public double getMarketTotal(double kilos){
        return this.potatoesPrice * kilos;
    }
    
    @Override
    public String toString(){
        String text = "";
        
        text += super.toString() + "Potatoes Price = " + getPotatoesPrice() + "€\n";
        
        return text;
    }
    
}
