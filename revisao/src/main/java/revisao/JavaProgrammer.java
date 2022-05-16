/*
 * @file: 
 * @author: Luis Oliveira <https://github.com/LuisCarlosOliveira>
 * @date
 * @brief
 */
package revisao;
import Enum.ProgrammerType;
import Interface.Worker;

/**
 *
 * @author Luis Oliveira <https://github.com/LuisCarlosOliveira>
 */
public class JavaProgrammer extends Software implements Worker{
    private String code;
    private int programmingYears;
    private String projectName;
    private ProgrammerType programmerType;
    
    public JavaProgrammer(String nome, String date, String address, int citizenCard,
            int vatNumber, double baseSalary, String code, int programmingYears,
            String projectName, ProgrammerType programmerType){
        
        super( nome,  date,  address,  citizenCard, vatNumber,  baseSalary);
        this.code = code;
        this.programmingYears = programmingYears;
        this.projectName = projectName;
        this.programmerType = programmerType;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the programmingYears
     */
    public int getProgrammingYears() {
        return programmingYears;
    }

    /**
     * @param programmingYears the programmingYears to set
     */
    public void setProgrammingYears(int programmingYears) {
        this.programmingYears = programmingYears;
    }

    /**
     * @return the projectName
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * @param projectName the projectName to set
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * @return the programmerType
     */
    public ProgrammerType getProgrammerType() {
        return programmerType;
    }

    /**
     * @param programmerType the programmerType to set
     */
    public void setProgrammerType(ProgrammerType programmerType) {
        this.programmerType = programmerType;
    }
    
    @Override
    public String toString(){
        String text = "";
        
        text += super.toString() + "Code: " + this.code + "\nProgramming Years: "
                + this.programmingYears + "\nProject Name: " + this.projectName +
                "\nProgrammer Type: " + this.programmerType.toString() + "\nSalary: "
                +  this.calculateSalary();
        
        return text;
    }
    
    @Override
    public double calculateSalary(){
        double salary;
        
        salary = (super.getBaseSalary() + 1.05);
        
        if(this.programmerType == ProgrammerType.JUNIOR){
            salary *=  1.05;
        }else{
            salary *=  1.15;
        }
        
        for(int i = 0; i < this.programmingYears; i++){
            salary *= 1.005;
        }
        
        return salary;
        
    }
    
    @Override
    public String works(){
        return "Works from home";
    }
 
    
}
