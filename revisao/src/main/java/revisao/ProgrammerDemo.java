/*
 * @file: 
 * @author: Luis Oliveira <https://github.com/LuisCarlosOliveira>
 * @date
 * @brief
 */
package revisao;
import Enum.ProgrammerType;

/**
 *
 * @author Luis Oliveira <https://github.com/LuisCarlosOliveira>
 */
public class ProgrammerDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ProgrammingManagement p_arr = new ProgrammingManagement();
        
        
        Software p3 = new ProjectManager("Mendes", "05-07-1991", "Lousa", 1234, 
                45678, 1000, "abc", 5, "05-15-2000");
        
        Software p4 = new JavaProgrammer("Oliveira", "05-07-1991", "Lousa", 1234, 
                45678, 1000, "abc", 5, "proj1", ProgrammerType.SENIOR);
        
        Software p5 = new JavaProgrammer("Patricia", "05-07-1991", "Lousa", 1234, 
                45678, 1000, "abc", 5, "proj1", ProgrammerType.JUNIOR);
        
        Software p6 = new ProjectManager("Santos", "01-01-1991", "Felgas", 55555, 
                666666, 1000, "cdc", 4, "05-15-2010");
        
        
        p_arr.addWorker(p3);
        p_arr.addWorker(p4);
        p_arr.addWorker(p5);
        p_arr.addWorker(p6);
        
        p_arr.printProjectManager();
        
        
        
    }
    
}
