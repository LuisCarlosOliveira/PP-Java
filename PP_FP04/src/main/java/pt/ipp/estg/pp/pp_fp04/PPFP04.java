/*
 * @file: 
 * @author: Luis Oliveira <https://github.com/LuisCarlosOliveira>
 * @date
 * @brief
 */
package pt.ipp.estg.pp.pp_fp04;
package pp_fp04.exchange;

import pp_fp04.exchange.CurrencyRates;

/**
 *
 * @author Luis Oliveira <https://github.com/LuisCarlosOliveira>
 */
public class PPFP04 {

    /**
     * @param args the command line arguments
     */
    static User user1, user2;
    
    public static void main(String[] args) {
        
        User user1=null;
        //User user2=null;
        
        user1.id[0] = 'A';
        user1.id[1] = 'B';
        user1.id[2] = 'C';
        
        user1.name = new char[]{'L', 'u', 'i', 's'};
        user1.email = new char[]{'l', 'u', 'i', 's', '@', 'g', 'm', 'a', 'i', 'l', '.', 'p', 't'};
        
        /*user2.id[0] = 'D';
        user2.id[1] = 'E';
        user2.id[2] = 'F';
        
        user2.name = new char[]{'T', 'e', 's', 't'};
        user2.email = new char[]{'t', 'e', 's', 't', '@', 'g', 'm', 'a', 'i', 'l', '.', 'p', 't'};
        */
        
        System.out.println("User 1");
        System.out.print("ID: ");
        System.out.println(user1.id);
        System.out.print("Name: ");
        System.out.println(user1.name);
        System.out.print("Email: ");
        System.out.println( user1.email);
        /*
        System.out.println("User 2");
        System.out.println("ID: " + user2.id);
        System.out.println("Name: " + user2.name);
        System.out.println("Email: " + user2.email);
        */
        user1.expenses.number1=1;
        double j = 1.00;
     
        for(int i = 0; i < 31; i++){
            
            user1.expenses.carValues[i] = j;
            j+=1.00;
        }
        
        /*
        
        System.out.println("--------DESPESAS-------");
        for(int i = 0; i < 31; i++){
            System.out.println(user1.expenses.carValues[i]);
        }
        */
        
        user1.expenses.number2=2;
        for(int i = 0; i < 31; i++){
            
            user1.expenses.foodValues[i] = j;
            j+=1.00;
        }
        
        double totalCar = 0;
        double totalFood = 0;
        
        for(int i = 0; i < 31; i++){
            totalCar += user1.expenses.carValues[i];
            totalFood += user1.expenses.foodValues[i];
        }
        
        double total = totalCar+totalFood;
        
        System.out.println("TOtal carro: " + totalCar);
        System.out.println("TOtal comida: " + totalFood);
        System.out.println("Total: " + (total));
        System.out.println("Media dia: " + (totalCar+totalFood)/31);
        
        System.out.print("Total dolar: " );
        System.out.println(CurrencyRates.euro[0]*total);
        System.out.println("Media dia dolar: " + ((totalCar+totalFood)/31)*CurrencyRates.euro[0]);
        System.out.print("Total ienes: " );
        System.out.println(CurrencyRates.euro[2]*total);
        System.out.print("Total GDP: " );
        System.out.println(CurrencyRates.euro[3]*total);
        
    }
    
}
