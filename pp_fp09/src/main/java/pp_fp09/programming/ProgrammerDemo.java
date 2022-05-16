/*
 * @file: 
 * @author: Luis Oliveira <https://github.com/LuisCarlosOliveira>
 * @date
 * @brief
 */
package pp_fp09.programming;

import Enumeration.DegreeLevels;
import Enumeration.ProgrammerType;
import Enumeration.contractType;

/**
 *
 * @author Luis Oliveira <https://github.com/LuisCarlosOliveira>
 */
public class ProgrammerDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        Programmer p1 = new Administrative("Luis", "05-07-1991", "Lousa", 1234, 
                45678, 1000.0, contractType.INTEGRAL, DegreeLevels.DEGREE, 
                "05-05-2005", "05-05-2005", 0.9, "LU");
        
        Programmer p2 = new Administrative("Carlos", "05-07-1991", "Lousa", 1234, 
                45678, 1000.0, contractType.INTEGRAL, DegreeLevels.MASTER, 
                "05-05-2005", "05-05-2005", 0.9, "Ca");
        
        Programmer p3 = new ProjectManager("Mendes", "05-07-1991", "Lousa", 1234, 
                45678, 1000, "abc", 5, "05-15-2000");
        
        Programmer p4 = new JavaProgrammer("Oliveira", "05-07-1991", "Lousa", 1234, 
                45678, 1000, "abc", 5, "proj1", ProgrammerType.SENIOR);
        
        Programmer p5 = new JavaProgrammer("Patricia", "05-07-1991", "Lousa", 1234, 
                45678, 1000, "abc", 5, "proj1", ProgrammerType.JUNIOR);
        
        Programmer p6 = new ProjectManager("Santos", "01-01-1991", "Felgas", 55555, 
                666666, 1000, "cdc", 4, "05-15-2010");
        
        
        /*
        System.out.println(p1.getBaseSalary());
        System.out.println(p1.calculateSalaty());
        System.out.println(p2.getBaseSalary());
        System.out.println(p2.calculateSalaty());
        System.out.println(p3.getBaseSalary());
        System.out.println(p3.calculateSalaty());
        System.out.println(p4.getBaseSalary());
        System.out.println(p4.calculateSalaty());
        System.out.println(p5.getBaseSalary());
        System.out.println(p5.calculateSalaty());
        */
        
        ProgrammingManagement p_arr = new ProgrammingManagement(2);
        
        p_arr.addProgrammer(p1);
        p_arr.addProgrammer(p2);
        p_arr.addProgrammer(p3);
        p_arr.addProgrammer(p4);
        p_arr.addProgrammer(p5);
        p_arr.addProgrammer(p6);
        
        p_arr.printAllManagement();
        System.out.println("------------------------");
        System.out.println(p6.calculateSalaty());
        System.out.println("------------------------");
        p_arr.printOnlyManagemers();
        
        
    }
    
}
