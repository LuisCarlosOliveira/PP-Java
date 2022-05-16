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
public abstract class Programmer{

    private String name;
    private String birthDate;
    private String address;
    private int citizenCard;
    private int vatNumber;
    private double baseSalary;

    public Programmer(String name, String birthDate, String address, int citizenCard,
                      int vatNumber, double baseSalary) {

        this.name = name;
        this.birthDate = birthDate;
        this.address = address;
        this.citizenCard = citizenCard;
        this.vatNumber = vatNumber;
        this.baseSalary = baseSalary;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the birthDate
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate the birthDate to set
     */
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the citizenCard
     */
    public int getCitizenCard() {
        return citizenCard;
    }

    /**
     * @param citizenCard the citizenCard to set
     */
    public void setCitizenCard(int citizenCard) {
        this.citizenCard = citizenCard;
    }

    /**
     * @return the vatNumber
     */
    public int getVatNumber() {
        return vatNumber;
    }

    /**
     * @param vatNumber the vatNumber to set
     */
    public void setVatNumber(int vatNumber) {
        this.vatNumber = vatNumber;
    }

    /**
     * @return the baseSalary
     */
    public double getBaseSalary() {
        return baseSalary;
    }

    /**
     * @param baseSalary the baseSalary to set
     */
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    
    abstract public double calculateSalaty();
    abstract public void printInfo();
    
    
}
