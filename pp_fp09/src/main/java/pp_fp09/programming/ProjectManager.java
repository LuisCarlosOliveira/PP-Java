/*
 * @file: 
 * @author: Luis Oliveira <https://github.com/LuisCarlosOliveira>
 * @date
 * @brief
 */
package pp_fp09.programming;

/**
 *
 * @author Luis Oliveira <https://github.com/LuisCarlosOliveira>
 */
public class ProjectManager extends Programmer {

    private String code;
    private int projects;
    private String contractDate;

    public ProjectManager(String name, String birthDate, String address,
            int citizenCard, int vatNumber, double baseSalary, String code,
            int projects, String contractDate) {

        super(name, birthDate, address, citizenCard, vatNumber, baseSalary);

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
    
    public int calculateYears(){
        int len = this.contractDate.length();
        
        String strTemp = this.contractDate.substring(len-4, len);
        
        int years = Integer.parseInt(strTemp);
        years = 2022-years;
        //System.out.println(years);
        return years;
    }
    
    @Override
    public double calculateSalaty() {
        //System.out.println("1 - " + getBaseSalary());
        double salary = 0;
        salary = getBaseSalary()*1.15;
        //System.out.println("2 - " + getBaseSalary());
        
        for(int i = 0; i < calculateYears(); i++) {
            salary *= 1.015;
            //System.out.println("3 " + i + "- " + getBaseSalary());
        }
        
        
        for (int i = 0; i < this.projects; i++) {
            salary *= 1.01;
            //System.out.println("4 " + i + "- " + getBaseSalary());
        }
        
        return salary;
    }
    
    public void printInfo(){
        System.out.println();
        System.out.println("Nome - " + getName());
        System.out.println("Birthdate - " + getBirthDate());
        System.out.println("Address - " + getAddress());
        System.out.println("CC - " + getCitizenCard());
        System.out.println("VAT - " + getVatNumber());
        System.out.println("Salary - " + calculateSalaty());
        System.out.println("Code - " + getCode());
        System.out.println("Projectos - " + getProjects());
        System.out.println("Data contracto - " + getContractDate());
    }


}
