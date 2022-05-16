/*
 * @file: 
 * @author: Luis Oliveira <https://github.com/LuisCarlosOliveira>
 * @date
 * @brief
 */
package pp_fp08.stand;

import Enumeration.Condition;
import Enumeration.Origin;
import Enumeration.TrailerType;
import Enumeration.TruckType;

/**
 *
 * @author Luis Oliveira <https://github.com/LuisCarlosOliveira>
 */
public class VehicleDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Car c1 = new Car(555, "Peugeot", "307", "2010-02-20", 199.25, Condition.NEW, 
        Origin.NATIONAL, 1000, 4, 4);
        
        Car c2 = new Car(556, "Peugeot", "307", "2010-02-20", 199.25, Condition.USED, 
        Origin.NATIONAL, 1000, 4);
        
        System.out.println(c1.getPrice());
        System.out.println(c1.getDoorsNumber());
        System.out.println(c2.getPrice());
        System.out.println(c2.getDoorsNumber());  
        
        System.out.println("CAR");
        System.out.println(c2.toString());
        System.out.println(c1.toString());
        System.out.println("Trailer");
        
        TowHaul tow1 = new TowHaul(2, TrailerType.OPEN);
        System.out.println(tow1.toString());
        TowHaul tow2 = new TowHaul(4,2, TrailerType.TIPPER);
        System.out.println(tow2.toString());
        SemiTrailer semi1 = new SemiTrailer(3, 3, 1);
        System.out.println(semi1.toString());
        SemiTrailer semi2 = new SemiTrailer( 4, 2);
        System.out.println(semi2.toString());
        
         System.out.println("Trucks");
        Truck t1 = new Truck(557, "Ford", "Truck", "2020-02-20", 0, Condition.NEW,
        Origin.IMPORTED, 10000, 6, 5, TruckType.TRUCK, tow1);
        System.out.println(t1.toString());
        Truck t2 = new Truck(558, "Jeep", "Jeep", "2020-02-20", 0, Condition.NEW,
        Origin.IMPORTED, 10000, 6, 5, TruckType.TRUCK);
        System.out.println(t2.toString());
        Truck t3 = new Truck(559, "Ford", "T2", "2020-02-20", 0, Condition.USED,
        Origin.IMPORTED, 10000, 6, 5, TruckType.TRUCK);
        System.out.println(t3.toString());
        Truck t4 = new Truck(560, "Jeep", "t3", "2020-02-20", 0, Condition.USED,
        Origin.IMPORTED, 10000, 6, 5, TruckType.TRUCK, tow2);
        System.out.println(t4.toString());
        Truck t5 = new Truck(561, "Escalade", "t4", "2020-02-20", 0, Condition.NEW,
        Origin.NATIONAL, 10000, 6, 5, TruckType.TRUCK, semi1);
        System.out.println(t5.toString());
        System.out.println(t5.getPrice());
        
        System.out.println();
        
        VehicleManagement v_arr = new VehicleManagement(2);
        
        v_arr.addVehicles(t3);
        v_arr.addVehicles(t5);
        v_arr.printVehicles();
        v_arr.addVehicles(t5);
        v_arr.printVehicles();
        System.out.println();
        v_arr.addVehicles(t2);
        v_arr.addVehicles(c1);
        v_arr.addVehicles(c2);
        v_arr.printVehicles();
        
        v_arr.compareVehicle(561);
        v_arr.compareVehicle(t5);
        System.out.println();
        System.out.println(v_arr.printVehiclesbyType());

        
        
        

    }
    
}
