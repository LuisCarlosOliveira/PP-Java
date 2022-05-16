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
public class ExpensesDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Expense expense1 = new Expense("agua", 38.99, "2022-03-15");
        Expense expense2 = new Expense("luz", 99.99, "2022-03-15");
        Expense expense3 = new Expense("agua", 18.55, "2022-03-15");
        Expense expense4 = new Expense("luz", 80.99, "2022-03-15");
        
        User user1 = new User("Luis", "luis@estg.pt", "1991-07-05", expense1, expense2);
        User user2 = new User("Patricia", "patricia@estg.pt", "1990-02-27", expense3, expense4);
        
        System.out.println(user1.id + "|" + user1.birthDate + "|"  + user1.nome + "|" + user1.email);
        System.out.println(user1.expenses[0].id);
        System.out.println(user1.expenses[0].type);
        System.out.println(user1.expenses[0].amount);
        System.out.println(user1.expenses[1].id);
        System.out.println(user1.expenses[1].type);
        System.out.println(user1.expenses[1].amount);
        System.out.println(user2.id + "|" + user2.birthDate + "|" + user2.nome + "|" + user2.email);
        System.out.println(user2.expenses[0].id);
        System.out.println(user2.expenses[0].type);
        System.out.println(user2.expenses[0].amount);
        System.out.println(user2.expenses[1].id);
        System.out.println(user2.expenses[1].type);
        System.out.println(user2.expenses[1].amount);
    }
    
}
