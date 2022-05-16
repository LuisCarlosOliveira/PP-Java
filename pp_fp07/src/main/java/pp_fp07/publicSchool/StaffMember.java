/*
 * @file: 
 * @author: Luis Oliveira <https://github.com/LuisCarlosOliveira>
 * @date
 * @brief
 */
package pp_fp07.publicSchool;
import Enumeration.ContractType;

/**
 *
 * @author Luis Oliveira <https://github.com/LuisCarlosOliveira>
 */
public class StaffMember extends Person{
    protected int COD;
    protected ContractType contract;
    
    public StaffMember(String name, String birthDate, String address, String CC, 
            String NIF, int COD, ContractType contract){
        
        super(name, birthDate, address, CC, NIF);
        this.COD = COD;
        this.contract = contract;

    }
    
    public void printStaffMember(){
        super.printPerson();
        System.out.println("Staff Mended id: " + this.COD);
        System.out.println("Contract type: " + this.contract);
        System.out.println();
    }
    
}
