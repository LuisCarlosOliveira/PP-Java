/*
 * @file: 
 * @author: Luis Oliveira <https://github.com/LuisCarlosOliveira>
 * @date
 * @brief
 */
package revisao;
import Interface.Worker;

/**
 *
 * @author Luis Oliveira <https://github.com/LuisCarlosOliveira>
 */
public class ProjectManager extends Software implements Worker {
    
    private String code;
    private int projects;
    private String contractDate;
    static protected int year = 2022;
    
    public ProjectManager(String nome, String date, String address, int citizenCard,
            int vatNumber, double baseSalary, String code, int projects, 
            String contractDate){
        
        super( nome,  date,  address,  citizenCard, vatNumber,  baseSalary);
        this.code = code;
        this.projects = projects;
        this.contractDate = contractDate;
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
     * @return the projects
     */
    public int getProjects() {
        return projects;
    }

    /**
     * @param projects the projects to set
     */
    public void setProjects(int projects) {
        this.projects = projects;
    }

    /**
     * @return the contractDate
     */
    public String getContractDate() {
        return contractDate;
    }

    /**
     * @param contractDate the contractDate to set
     */
    public void setContractDate(String contractDate) {
        this.contractDate = contractDate;
    }
    
    public int getYears(){
        int len = this.contractDate.length();
        
        String temp = this.contractDate.substring(len-4, len);
        
        int yearOfContract = Integer.parseInt(temp);
        
        return year - yearOfContract;
        
    }
    
    
    @Override
    public double calculateSalary(){
        double salary = super.getBaseSalary() * 1.15;
        
        for(int i = 0; i < getYears(); i++){
            salary += super.getBaseSalary() * 1.015;
        }
        
        for(int i = 0; i < this.projects; i++){
            salary += super.getBaseSalary() * 1.01;
        }
        
        return salary;
    }
    
    @Override
    public String toString(){
        String text = "";
        
        text += super.toString() + "Code: " + this.code + "\nProjects: " + this.projects
                + "\nDate of Contract: " + this.contractDate + "\nSalary: " +
                calculateSalary();
        
        return text;
    }
    
    @Override
    public String works(){
        return "Works from home and office";
    }

}
