/*
 * @file: 
 * @author: Luis Oliveira <https://github.com/LuisCarlosOliveira>
 * @date
 * @brief
 */
package pp_fp07.bikeStore;

import Enumeration.Suspension_Type;
import Enumeration.BikeTools;
import Enumeration.Brakes_Type;
import Enumeration.Material_Type;

/**
 *
 * @author Luis Oliveira <https://github.com/LuisCarlosOliveira>
 */
public class MountainBike extends Bicycle {

    protected int numberOfLights;
    protected Suspension_Type suspencion;
    protected BikeTools[] bikeTools;
    private final int MAX_TOOLS = 5;

    public MountainBike(int id, int numberOfGears, String mainColor, int wheelSize,
            Brakes_Type brakes, Material_Type material, double price, int guarantee,
            int numberOfLights, Suspension_Type suspencion, BikeTools[] bikeTools) {
        super(id, numberOfGears, mainColor, wheelSize, brakes, material, price, guarantee);
        this.numberOfLights = numberOfLights;
        this.suspencion = suspencion;
        if (bikeTools.length < MAX_TOOLS) {
            this.bikeTools = new BikeTools[bikeTools.length];
            this.bikeTools = bikeTools;
        } else {
            this.bikeTools = new BikeTools[MAX_TOOLS];
            for (int i = 0; i < this.bikeTools.length; i++) {
                this.bikeTools[i] = bikeTools[i];
            }
        }

    }

    public void printMountainBike() {
        super.printBicycle();
        System.out.println("Numero de luzes: " + this.numberOfLights);
        System.out.println("Tipo de Suspenção: " + this.suspencion);
        System.out.println("Acessórios:");
        for(int i = 0; i < this.bikeTools.length; i++){
            System.out.println((i+1) + " : " + this.bikeTools[i]);
        }
    }

}
