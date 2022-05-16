/*
 * @file: 
 * @author: Luis Oliveira <https://github.com/LuisCarlosOliveira>
 * @date
 * @brief
 */
package pp_fp09.programming;

import Enumeration.contractType;
import Enumeration.DegreeLevels;

/**
 *
 * @author Luis Oliveira <https://github.com/LuisCarlosOliveira>
 */
public class Administrative extends Programmer {

    private String initials;
    private contractType contract;
    private DegreeLevels degree;
    private String beginDate;
    private String endDate;
    private double percentage;

    public Administrative(String name, String birthDate, String address, int citizenCard,
            int vatNumber, double baseSalary, contractType contract,
            DegreeLevels degree, String beginDate, String endDate, double percentage,
            String initials) {

        super(name, birthDate, address, citizenCard, vatNumber, baseSalary);
        this.contract = contract;
        this.beginDate = beginDate;
        this.degree = degree;
        if (this.contract == contractType.PARTIAL) {

            this.endDate = endDate;
        }
        this.percentage = percentage;
        this.initials = initials;

    }

   
    public double calculateSalaty() {
        //System.out.println(this.getDegree());

        setBaseSalary(getBaseSalary() * this.getPercentage());

        //System.out.println("1 - " + getBaseSalary());
        if (this.getDegree() == DegreeLevels.DEGREE) {
            setBaseSalary(getBaseSalary() * 1.1);
            //System.out.println("2 - " + getBaseSalary());

        } else if (this.getDegree() == DegreeLevels.DOCTORATE) {
            setBaseSalary(getBaseSalary() * 1.2);
            //System.out.println("3 - " + getBaseSalary());

        } else {
            setBaseSalary(getBaseSalary() * 1.3);
            //System.out.println("4 - " + getBaseSalary());
        }

        //System.out.println("5 - " + getBaseSalary());
        return getBaseSalary();
    }

    /**
     * @return the initials
     */
    public String getInitials() {
        return initials;
    }

    /**
     * @param initials the initials to set
     */
    public void setInitials(String initials) {
        this.initials = initials;
    }

    /**
     * @return the contract
     */
    public contractType getContract() {
        return contract;
    }

    /**
     * @param contract the contract to set
     */
    public void setContract(contractType contract) {
        this.contract = contract;
    }

    /**
     * @return the degree
     */
    public DegreeLevels getDegree() {
        return degree;
    }

    /**
     * @param degree the degree to set
     */
    public void setDegree(DegreeLevels degree) {
        this.degree = degree;
    }

    /**
     * @return the beginDate
     */
    public String getBeginDate() {
        return beginDate;
    }

    /**
     * @param beginDate the beginDate to set
     */
    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    /**
     * @return the endDate
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * @return the percentage
     */
    public double getPercentage() {
        return percentage;
    }

    /**
     * @param percentage the percentage to set
     */
    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
    
    public void printInfo(){
        System.out.println();
        System.out.println("Nome - " + getName());
        System.out.println("Birthdate - " + getBirthDate());
        System.out.println("Address - " + getAddress());
        System.out.println("CC - " + getCitizenCard());
        System.out.println("VAT - " + getVatNumber());
        System.out.println("VAT - " + getVatNumber());
        System.out.println("initials - " + getInitials());
        System.out.println("Contrato - " + getContract());
        System.out.println("Data inicio - " + getBeginDate());
    }

}
