/*
 * @file: 
 * @author: Luis Oliveira <https://github.com/LuisCarlosOliveira>
 * @date
 * @brief
 */
package pp_fp10;

import Interfaces.CoffeeService;

/**
 *
 * @author Luis Oliveira <https://github.com/LuisCarlosOliveira>
 */
public class LargeGasStation extends GasStation implements CoffeeService {

    private double coffeePrice;

    public LargeGasStation(String name, int vatNumber, double gasprice, double coffeePrice) {
        super(name, vatNumber, gasprice);
        this.coffeePrice = coffeePrice;
    }

    @Override
    public double getCoffeePrice() {
        return this.coffeePrice;
    }

    @Override
    public void setCoffeePrice(double p) {
        this.coffeePrice = p;
    }

    @Override
    public double getCoffeeTotal(int coffees) {
        return this.coffeePrice * coffees;

    }

    @Override
    public String toString() {
        String text = "";

        text += super.toString() + "Preço do Café: " + this.coffeePrice + "€" + "\n";
        return text;
    }

}
