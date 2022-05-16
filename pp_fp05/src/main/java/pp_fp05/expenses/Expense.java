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
public class Expense {

    protected int id;
    protected static int count = 1; //https://stackoverflow.com/questions/49111006/auto-increment-id-in-java
    protected String type;
    protected double amount;
    protected String date;

    public Expense(String tempType, double tempAmount, String tempDate) {
        id = count++;
        type = tempType;
        date = tempDate;
        amount = tempAmount;
    }

}
