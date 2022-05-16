/*
 * @file: 
 * @author: Luis Oliveira <https://github.com/LuisCarlosOliveira>
 * @date
 * @brief
 */
package pp_fp07.publicSchool;
import Enumeration.CourseType;
import Enumeration.SemesterType;

/**
 *
 * @author Luis Oliveira <https://github.com/LuisCarlosOliveira>
 */
public class UC {
    
    protected String ucName;
    protected String ucSigla;
    protected CourseType course;
    protected int ano;
    protected SemesterType semester;
    
    public UC(String ucName, String ucSigla, CourseType course, int ano, SemesterType semester){
        this.ucName = ucName;
        this.ucSigla = ucSigla;
        this.course = course;
        this.ano = ano;
        this.semester = semester;
    }
    
    public void printUC(){
        System.out.println("Name: " +this.ucName );
        System.out.println("Acronym: " +this.ucSigla );
        System.out.println("Course: " + this.course);
        System.out.println("Ano: " +this.ano );
        System.out.println("Semester: " +this.semester );
    }
    
}
