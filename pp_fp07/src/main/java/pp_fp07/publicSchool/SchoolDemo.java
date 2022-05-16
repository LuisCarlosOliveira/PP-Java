/*
 * @file: 
 * @author: Luis Oliveira <https://github.com/LuisCarlosOliveira>
 * @date
 * @brief
 */
package pp_fp07.publicSchool;
import Enumeration.ContractType;
import Enumeration.CourseType;
import Enumeration.SemesterType;

/**
 *
 * @author Luis Oliveira <https://github.com/LuisCarlosOliveira>
 */
public class SchoolDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     UC uc1 = new UC("UC1", "UC1", CourseType.LEI, 1, SemesterType.Segundo);
     UC uc2 = new UC("UC2", "UC2", CourseType.LSIRC, 2, SemesterType.Primeiro);
     UC uc3 = new UC("UC3", "UC3", CourseType.LEI, 1, SemesterType.Segundo);
     
     UC uc_arr1[] = {uc1, uc2, uc3};
     UC uc_arr2[] = {uc2, uc3};
     
     Teacher t1 = new Teacher("Um", "2000-20-10", "Rua 1", "250790610", "13905570",
     "T1", ContractType.INTEGRAL, uc_arr2);
     Teacher t2 = new Teacher("Dois", "2000-20-10", "Rua 2", "250790610", "13905570",
     "T2", ContractType.PARCIAL, uc_arr1);
     
     StaffMember s1 = new StaffMember("Três", "2000-20-10", "Rua 3", "250790610", "13905570",
     1, ContractType.INTEGRAL);
     
     Student st1 = new Student("Quatro", "2000-20-10", "Rua 4", "250790610", "13905570",
     1, uc_arr1);
     
     Student st2 = new Student("Cinco", "2000-20-10", "Rua 5", "250790610", "13905570",
     2, uc_arr2);
     
     Person[] persons = {t1, t2, s1, st1, st2};
     
     SchoolManagement school = new SchoolManagement(persons);
     
     System.out.println("Only Teachers: ");
     school.printOnlyTeacher();
          
     System.out.println("Staff Members and Student: ");

     school.printStudentAndStaff();
     

    }
    
}
