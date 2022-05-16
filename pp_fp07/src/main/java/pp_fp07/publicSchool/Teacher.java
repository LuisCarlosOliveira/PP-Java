/*
 * @file: 
 * @author: Luis Oliveira <https://github.com/LuisCarlosOliveira>
 * @date
 * @brief
 */
package pp_fp07.publicSchool;

import Enumeration.CourseType;
import Enumeration.SemesterType;
import Enumeration.ContractType;

/**
 *
 * @author Luis Oliveira <https://github.com/LuisCarlosOliveira>
 */
public class Teacher extends Person{
    protected String teacherSigla;
    protected ContractType contract;
    protected UC[] ucs;
    
    public Teacher(String name, String birthDate, String address, String CC, 
            String NIF, String teacherSigla, ContractType contract, UC[] ucs){
        
        super(name, birthDate, address, CC, NIF);
        //super(String name, String birthDate, String address, String CC, String NIF);
        this.teacherSigla = teacherSigla;
        this.contract = contract;
        this.ucs = ucs;
    }
    
    public void printTeacher(){
        super.printPerson();
        System.out.println("Teacher acro: " + this.teacherSigla);
        System.out.println("Contract type: " + this.contract);
        System.out.println("UCs: ");
        for(int i =0; i <this.ucs.length; i++){
            System.out.print((i+1) + "- ");
            this.ucs[i].printUC();
            System.out.println();
        }
        System.out.println();
        
    }
    
}
