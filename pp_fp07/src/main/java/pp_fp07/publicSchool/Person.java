/*
 * @file: 
 * @author: Luis Oliveira <https://github.com/LuisCarlosOliveira>
 * @date
 * @brief
 */
package pp_fp07.publicSchool;

/**
 *
 * @author Luis Oliveira <https://github.com/LuisCarlosOliveira>
 */
public class Person {
    protected String name;
    protected String birthDate;
    protected String address;
    protected String CC;
    protected String NIF;
    
    public Person(String name, String birthDate, String address, String CC, String NIF){
        this.name = name;
        this.birthDate = birthDate;
        this.address = address;
        this.CC = CC;
        this.NIF = NIF;
    }
    
    public void printPerson(){
        System.out.println("Name: " +this.name );
        System.out.println("Birthdate : " +this.birthDate );
        System.out.println("Address: " +this.address );
        System.out.println("CC number: " +this.CC );
        System.out.println("VAT number : " +this.NIF );
    }
}
