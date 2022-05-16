/*
 * @file: 
 * @author: Luis Oliveira <https://github.com/LuisCarlosOliveira>
 * @date
 * @brief
 */
package pp_fp10;

import Interfaces.GasService;


/**
 *
 * @author Luis Oliveira <https://github.com/LuisCarlosOliveira>
 */
public class GasStation extends Company implements GasService {

    private double gasprice;

    public GasStation(String name, int vatNumber, double gasprice) {
        super(name, vatNumber);
        this.gasprice = gasprice;
    }

    /**
     * @return the gasprice
     */
    @Override
    public double getGasPrice() {
        return this.gasprice;
    }

    /**
     * @param p
     */
    @Override
    public void setGasPrice(double p) {
        this.gasprice = p;
    }

    @Override
    public double getGasTotal(double litres) {
        return this.gasprice * litres;
    }
    
    @Override
    public String toString(){
        String text = "";
        
        text += super.toString() + "Gas Price: " + this.gasprice + "€\n"; 
        return text;
    }
}
