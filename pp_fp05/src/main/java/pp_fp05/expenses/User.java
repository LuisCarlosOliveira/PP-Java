/*
 * @file: 
 * @author: Luis Oliveira <https://github.com/LuisCarlosOliveira>
 * @date
 * @brief
 */
package pp_fp05.expenses;

/**
 *
 * @author Luis Oliveira <https://github.com/LuisCarlosOliveira>
 */
public class User {
    
    protected final int EXPENSES_SIZE = 31;
    protected int id;
    private static int count = 1; //https://stackoverflow.com/questions/49111006/auto-increment-id-in-java
    protected String nome;
    protected String email;
    protected String birthDate;
    protected Expense[] expenses;
    
    public User( String tempNome, String tempEmail, String tempBirthDate, Expense expense1, Expense expense2 ){
        expenses = new Expense[EXPENSES_SIZE];
        expenses[0] = expense1;
        expenses[1] = expense2;
        id = count++;
        nome = tempNome;
        email = tempEmail;
        birthDate = tempBirthDate;
    }
    
    
}
