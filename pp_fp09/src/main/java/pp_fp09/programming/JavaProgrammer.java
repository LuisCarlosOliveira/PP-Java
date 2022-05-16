/*
 * @file: 
 * @author: Luis Oliveira <https://github.com/LuisCarlosOliveira>
 * @date
 * @brief
 */
package pp_fp09.programming;

import Enumeration.ProgrammerType;

/**
 *
 * @author Luis Oliveira <https://github.com/LuisCarlosOliveira>
 */
public class JavaProgrammer extends Programmer {

    private String code;
    private int programmingYears;
    private String projectName;
    private ProgrammerType progType;

    public JavaProgrammer(String name, String birthDate, String address, int citizenCard,
            int vatNumber, double baseSalary, String code, int programmingYears,
            String projectName, ProgrammerType progType) {

        super(name, birthDate, address, citizenCard, vatNumber, baseSalary);
        this.code = code;
        this.progType = progType;
        this.programmingYears = programmingYears;
        this.projectName = projectName;
    }

    @Override
    public double calculateSalaty() {
        setBaseSalary(getBaseSalary() * 1.05);
        if (this.getProgType() == ProgrammerType.JUNIOR) {
            setBaseSalary(getBaseSalary() * 1.05);
        } else {
            setBaseSalary(getBaseSalary() * 1.15);
        }
        for (int i = 0; i < this.programmingYears; i++) {
            setBaseSalary(getBaseSalary() * 1.005);
        }
        return getBaseSalary();
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
     * @return the progType
     */
    public ProgrammerType getProgType() {
        return progType;
    }

    /**
     * @param progType the progType to set
     */
    public void setProgType(ProgrammerType progType) {
        this.progType = progType;
    }
    
    public void printInfo(){
        System.out.println();
        System.out.println("Nome - " + getName());
        System.out.println("Birthdate - " + getBirthDate());
        System.out.println("Address - " + getAddress());
        System.out.println("CC - " + getCitizenCard());
        System.out.println("VAT - " + getVatNumber());
        System.out.println("VAT - " + getVatNumber());
        System.out.println("Code - " + getCode());
        System.out.println("Programming Years - " + getProgrammingYears());
        System.out.println("Nome projecto - " + getProjectName());
        System.out.println("Tipo de programador - " + getProgType());
        
    }
    

}
