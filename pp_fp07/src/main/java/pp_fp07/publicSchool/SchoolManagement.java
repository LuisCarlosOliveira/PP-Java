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
public class SchoolManagement {

    protected Person[] persons;

    public SchoolManagement(Person[] persons) {
        this.persons = persons;
    }

    public void printOnlyTeacher() {
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] instanceof Teacher) {
                persons[i].printPerson();
                System.out.println();
            }
        }
    }

    public void printStudentAndStaff() {
        for (int i = 0; i < persons.length; i++) {
            if (!(persons[i] instanceof Teacher)) {
                persons[i].printPerson();
                System.out.println();
            }
        }
    }
}
