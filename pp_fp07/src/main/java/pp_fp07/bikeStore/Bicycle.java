/*
 * @file: 
 * @author: Luis Oliveira <https://github.com/LuisCarlosOliveira>
 * @date
 * @brief
 */
package pp_fp07.bikeStore;

import Enumeration.Material_Type;
import Enumeration.Brakes_Type;

/**
 *
 * @author Luis Oliveira <https://github.com/LuisCarlosOliveira>
 */
public class Bicycle {
    protected int id;
    protected int numberOfGears;
    protected String mainColor;
    protected int wheelSize;
    protected Brakes_Type brakes;
    protected Material_Type material;
    protected double price;
    protected int guarantee;
        
    public Bicycle( int id, int numberOfGears, String mainColor, int wheelSize, 
            Brakes_Type brakes, Material_Type material, double price, int guarantee){
        this.id = id;
        this.numberOfGears = numberOfGears;
        this.mainColor = mainColor;
        this.wheelSize =  wheelSize;
        this.brakes = brakes;
        this.material = material;
        this.price = price;
        this.guarantee = guarantee;
        
    }
    public Bicycle( int id, int numberOfGears, String mainColor, int wheelSize, 
            double price, int guarantee){
        this.id = id;
        this.numberOfGears = numberOfGears;
        this.mainColor = mainColor;
        this.wheelSize =  wheelSize;

        this.price = price;
        this.guarantee = guarantee;
        
    }
    
    
    public void printBicycle(){
        System.out.println("ID: " + this.id);
        System.out.println("Nr Mudanças: " + this.numberOfGears);
        System.out.println("Cor: " + this.mainColor);
        System.out.println("Tipo travoes: " + this.brakes);
        System.out.println("Material" + this.material);
        System.out.println("Preço: " + this.price);
        System.out.println("Anos de Garantia: " + this.guarantee);
    
}
    
}
