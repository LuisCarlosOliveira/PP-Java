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
public class Student extends Person {

    protected int ID;
    protected UC[] ucs;

    public Student(String name, String birthDate, String address, String CC,
            String NIF, int ID, UC[] ucs) {

        super(name, birthDate, address, CC, NIF);
        this.ID = ID;
        this.ucs = ucs;
    }

    public void printStudent() {
        super.printPerson();
        System.out.println("Student ID: " + this.ID);
        System.out.println("UCs: ");
        for (int i = 0; i < this.ucs.length; i++) {
            System.out.print((i + 1) + "- ");
            this.ucs[i].printUC();
            System.out.println();
        }
        System.out.println();
    }

}
