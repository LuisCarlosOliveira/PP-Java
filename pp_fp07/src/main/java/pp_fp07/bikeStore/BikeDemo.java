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
public class BikeDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BikeTools[] tools1 ={BikeTools.CELLPHONE_HANDLER, BikeTools.TIRE_REPAIR_KIT,
        BikeTools.CELLPHONE_HANDLER, BikeTools.TIRE_REPAIR_KIT, BikeTools.CELLPHONE_HANDLER, BikeTools.TIRE_REPAIR_KIT};
        
        MountainBike b1 = new MountainBike(1, 7, "Black", 57, Brakes_Type.HYDRAULIC, 
                Material_Type.CARBON, 99.99, 2, 2, Suspension_Type.DOUBLE, 
                tools1);
        
        /*
        b1.printMountainBike();
        System.out.println();
        */
        
        RoadBike b2 = new RoadBike(2, 5, "Red", 55, Brakes_Type.RIM, Material_Type.ALUMINIUM,
        55.99, 3, 4, 155, "ABCDEFGHIJKLMNOPRSTUVXVABCDEFGHIJKLMNOPQTKRSTABCDEFCHGKS");
        
        RoadBike b3 = new RoadBike(3, 4, "Green", 40, 40.99, 8, 3, 88, "ABCDEFGHIJKLM");
        
        /*
        b2.printRoadBike();
        System.out.println();

        b3.printRoadBike();
        */
        
        MountainBike b4 = new MountainBike(4, 7, "Yellow", 57, Brakes_Type.HYDRAULIC, 
                Material_Type.CARBON, 199.99, 3, 3, Suspension_Type.DOUBLE, 
                tools1);
        
        Bicycle[] bikes = {b1, b2, b3, b4};
        
        BicycleManagement store = new BicycleManagement(bikes);
        
        store.printOnlyMountain();
        
        MountainBike b5 = new MountainBike(5, 7, "Grey", 57, Brakes_Type.HYDRAULIC, 
                Material_Type.CARBON, 199.99, 3, 3, Suspension_Type.DOUBLE, 
                tools1);
        
        
        
        
    }
    
    
    
}
