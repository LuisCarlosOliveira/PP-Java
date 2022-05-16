/*
 * @file: 
 * @author: Luis Oliveira <https://github.com/LuisCarlosOliveira>
 * @date
 * @brief
 */
package pp_fp07.bikeStore;

import Enumeration.BikeTools;
import Enumeration.Brakes_Type;
import Enumeration.Material_Type;
import Enumeration.Suspension_Type;

/**
 *
 * @author Luis Oliveira <https://github.com/LuisCarlosOliveira>
 */
public class RoadBike extends Bicycle  {

    protected int handlebelt;
    protected int frameSize;
    protected String observations;

    public RoadBike(int id, int numberOfGears, String mainColor, int wheelSize,
            Brakes_Type brakes, Material_Type material, double price, int guarantee,
            int handlebelt, int frameSize, String observations) {

        super(id, numberOfGears, mainColor, wheelSize, brakes, material, price, guarantee);
        this.handlebelt = handlebelt;
        this.frameSize = frameSize;
        if (observations.length() >= 50) {
            this.observations = observations.substring(0, 49);
        } else {
            this.observations = observations;
        }
    }

    public RoadBike(int id, int numberOfGears, String mainColor, int wheelSize, 
            double price, int guarantee, int handlebelt, int frameSize, 
            String observations) {

        super(id, numberOfGears, mainColor, wheelSize, price, guarantee);
        this.brakes = brakes.HYDRAULIC;
        this.material = material.CARBON;
        this.handlebelt = handlebelt;
        this.frameSize = frameSize;
        if (observations.length() >= 50) {
            this.observations = observations.substring(0, 49);
        } else {
            this.observations = observations;
        }
    }
    
    public void printRoadBike() {
        super.printBicycle();
        System.out.println("handlebelt: " + this.handlebelt);
        System.out.println("Quadro: " + this.frameSize);
        System.out.println("observações: " + this.observations);


}
}
