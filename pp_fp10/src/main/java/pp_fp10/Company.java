/*
 * @file: 
 * @author: Luis Oliveira <https://github.com/LuisCarlosOliveira>
 * @date
 * @brief
 */
package pp_fp10;

/**
 *
 * @author Luis Oliveira <https://github.com/LuisCarlosOliveira>
 */
public abstract class Company {
    
    private String name;
    private int vatNumber;

    /**
     * @param name
     * @param vatNumber
     */
    
    public Company(String name, int vatNumber) {
        this.name = name;
        this.vatNumber = vatNumber;
    }
    
    
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
    
    @Override
    public String toString(){
        String text = "";
        
        text += "Company Name : " + this.name + "\n"
                + "VAT number: " + this.vatNumber + "\n";
        
        return text;
    }
    
    
}
