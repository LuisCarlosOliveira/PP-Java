/*
 * @file: 
 * @author: Luis Oliveira <https://github.com/LuisCarlosOliveira>
 * @date
 * @brief
 */
package pp_fp08.stand;

/**
 *
 * @author Luis Oliveira <https://github.com/LuisCarlosOliveira>
 */
public class VehicleManagement {

    private Vehicle[] vehicles;
    private int count;
    private static int nextCount = 0;

    public VehicleManagement(int size) {

        this.vehicles = new Vehicle[size];
        this.count = 0;

    }

    public boolean expandVehicleList() {

        if (this.count == this.vehicles.length) {
            Vehicle[] temp = new Vehicle[this.vehicles.length * 2];
            System.arraycopy(this.vehicles, 0, temp, 0, this.vehicles.length);
            this.vehicles = temp;
            System.out.println(this.vehicles.length);
            return true;
        }
        return false;
    }

    public boolean verifyVin(int vin) {

        for (int i = 0; i < this.count; i++) {
            if (vin == this.vehicles[i].vin) {
                return false;
            }
        }
        return true;
    }

    /**
     * @return the vehicles
     */
    public Vehicle[] getVehicles() {
        return vehicles;
    }

    /**
     * @param vehicles the vehicles to set
     */
    public void setVehicles(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }

    /**
     * @return the count
     */
    public int getCount() {
        return count;
    }

    /**
     * @param count the count to set
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * @return the nextCount
     */
    public static int getNextCount() {
        return nextCount;
    }

    /**
     * @param aNextCount the nextCount to set
     */
    public static void setNextCount(int aNextCount) {
        nextCount = aNextCount;
    }

    public boolean addVehicles(Vehicle v) {
        if (count != 0) {
            if (!verifyVin(v.vin)) {
                System.out.println("Repetido");
                return false;
            }
        }
        expandVehicleList();
        this.vehicles[this.count] = v;
        this.count++;
        return true;

    }

    public void compareVehicle(int vin) {
        if (count != 0) {
            for (int i = 0; i < this.count; i++) {
                if (vin == this.vehicles[i].vin) {
                    System.out.println("Veiculo existe");
                }
            }
        } else {
            System.out.println("VEICULO NÃO EXISTE");
        }
    }

    public void compareVehicle(Vehicle v) {
        if (count != 0) {
            for (int i = 0; i < this.count; i++) {
                if (v.equals(this.vehicles[i])) {
                    System.out.println("Veiculo existe");
                }
            }
        } else {
            System.out.println("VEICULO NÃO EXISTE");
        }
    }

    public void printVehicles() {

        if (this.vehicles.length == 0) {
            System.out.println("Não há veiculos");
            return;
        }
        for (int i = 0; i < this.vehicles.length; i++) {
            if (vehicles[i] == null) {
                return;
            }
            System.out.println((i + 1) + ":\n" + vehicles[i].toString());
        }

    }
    
    public String printVehiclesbyType() {
        int bikes = 0, trucks = 0, cars =0;
        if (count != 0) {
            for (int i = 0; i < this.count; i++) {
                if (this.vehicles[i] instanceof Car){
                    cars++;
                }else if(this.vehicles[i] instanceof Bike){
                    bikes++;
                }else if(this.vehicles[i] instanceof Truck){
                    trucks++;
                }
            }
            return "Vehicles for sale:\nCars :" + cars +"\nBikes:" + bikes +
                    "\nTrucks:" + trucks ;
            
            
        }
        return "LISTA VAZIA";
    }
    
}
