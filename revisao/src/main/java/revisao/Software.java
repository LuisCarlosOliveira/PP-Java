/*
 * @file: 
 * @author: Luis Oliveira <https://github.com/LuisCarlosOliveira>
 * @date
 * @brief
 */
package revisao;

/**
 *
 * @author Luis Oliveira <https://github.com/LuisCarlosOliveira>
 */
public abstract class Software {
    private String nome;
    private String date;
    private String address;
    private int citizenCard;
    private int vatNumber;
    private double baseSalary;
    
    public Software(String nome, String date, String address, int citizenCard,
            int vatNumber, double baseSalary){
        this.nome = nome;
        this.date = date;
        this.address = address;
        this.citizenCard = citizenCard;
        this.vatNumber = vatNumber;
        this.baseSalary = baseSalary;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
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
    
    @Override
    public String toString(){
        String text = "";
        
        text += "Name: " + this.nome + "\nDate:" + this.date + "\nAddress: " +
                this.address + "\nCC: " + this.citizenCard + "\nVat: " + 
                this.vatNumber + "\nBase Salary: " + this.baseSalary + "\n";
        return text;
    }
    
    abstract public double calculateSalary();
    
    
}
