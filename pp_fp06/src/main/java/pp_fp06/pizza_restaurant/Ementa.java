/*
 * @file: 
 * @author: Luis Oliveira <https://github.com/LuisCarlosOliveira>
 * @date
 * @brief
 */
package pp_fp06.pizza_restaurant;

/**
 *
 * @author Luis Oliveira <https://github.com/LuisCarlosOliveira>
 */
public class Ementa {

    protected String designation;
    protected String discription;
    protected String menuID;
    protected String startDate;
    protected String endDate;
    protected int nrPizzas;
    protected Pizza[] pizzas;
    private int MAX_PIZZAS = 10;
    protected boolean status = false;

    public Ementa(String designation, String discription, String menuID,
            String startDate, String endDate, Pizza[] pizzas) {
        this.designation = designation;
        this.discription = discription;
        this.menuID = menuID;
        if (pizzas.length < MAX_PIZZAS) {
            this.pizzas = new Pizza[pizzas.length];
            this.nrPizzas = pizzas.length;
            this.pizzas = pizzas;
        } else {
            this.nrPizzas = MAX_PIZZAS;
            this.pizzas = new Pizza[MAX_PIZZAS];
            for (int i = 0; i < MAX_PIZZAS; i++) {
                
                this.pizzas[i] = pizzas[i];
            }
        }
        this.startDate = startDate;
        this.endDate = endDate;
    }
    
    public Ementa(String designation, String discription, String menuID,
            String startDate, Pizza[] pizzas) {
        this.designation = designation;
        this.discription = discription;
        this.menuID = menuID;
        if (pizzas.length < MAX_PIZZAS) {
            this.pizzas = new Pizza[pizzas.length];
            this.nrPizzas = pizzas.length;
            this.pizzas = pizzas;
        } else {
            this.nrPizzas = MAX_PIZZAS;
            this.pizzas = new Pizza[MAX_PIZZAS];
            for (int i = 0; i < MAX_PIZZAS; i++) {
                this.pizzas[i] = pizzas[i];
            }
        }
        this.startDate = startDate;
    }
    
    public void activateEmenta(){
        if(this.status != true){
            this.status = true;
            System.out.println("EMENTA ATIVADA");
        }else{
            System.out.println("EMENTA JÁ ATIVA");
        }        
    }

}
