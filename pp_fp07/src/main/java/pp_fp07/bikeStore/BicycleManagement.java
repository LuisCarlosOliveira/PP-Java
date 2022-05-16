/*
 * @file: 
 * @author: Luis Oliveira <https://github.com/LuisCarlosOliveira>
 * @date
 * @brief
 */
package pp_fp07.bikeStore;

/**
 *
 * @author Luis Oliveira <https://github.com/LuisCarlosOliveira>
 */
public class BicycleManagement {
    private int TEMP = 20;
    protected int nrBicycles;
    protected Bicycle[] bicycles;

    public BicycleManagement(Bicycle[] bicycles) {
        int count = 0;
        //this.TEMP = nrBicycles;
        //this.bicycles = new Bicycle[bicycles.length];
        this.bicycles = bicycles;
        for(int i = 0; i <this.bicycles.length; i++ ){
            if(this.bicycles[i] != null){
                count++;
            }
        }
        this.nrBicycles = count;
    }


    public void printOnlyMountain() {
        for (int i = 0; i < bicycles.length; i++) {
            if (bicycles[i] instanceof MountainBike) {
                bicycles[i].printBicycle();
                System.out.println();
            }
        }
    }


}