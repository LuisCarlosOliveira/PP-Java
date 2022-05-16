/*
 * @file: 
 * @author: Luis Oliveira <https://github.com/LuisCarlosOliveira>
 * @date
 * @brief
 */
package pp_fp06.pizza_restaurant;

import pp_fp06.pizza_restaurant.enums.PizzaSize;

/**
 *
 * @author Luis Oliveira <https://github.com/LuisCarlosOliveira>
 */
public class Pizza {

    protected String pizzaID;
    protected String pizzaName;
    protected String pizzaDescription;
    protected double price;
    protected PizzaSize size;
    private int MAX_INGREDIENTS = 5;
    protected int nrIngredients;
    protected Ingredient[] ingredients;

    public Pizza(String pizzaID, String pizzaName, String pizzaDescription, double price,
            Ingredient[] ingredients, PizzaSize size) {

        this.pizzaID = pizzaID;
        this.pizzaName = pizzaName;
        this.pizzaDescription = pizzaDescription;
        this.ingredients = new Ingredient[MAX_INGREDIENTS];
        if (ingredients.length < MAX_INGREDIENTS) {
            this.nrIngredients = ingredients.length;
            for (int i = 0; i < this.nrIngredients; i++) {
                this.ingredients[i] = ingredients[i];
            }
        } else {
            this.nrIngredients = MAX_INGREDIENTS;
            for (int i = 0; i < this.nrIngredients; i++) {
                this.ingredients[i] = ingredients[i];

            }
            this.size = size;
            this.price = price;
        }
    }

    public void printDescriptionAndIngredients() {
        System.out.println(this.pizzaDescription);
        imprimeIngredients();

    }

    public void ingredientInfo(String s) {
        for (int i = 0; i < this.ingredients.length; i++) {
            if (this.ingredients[i].ingredientID.equals(s)) {
                System.out.println(this.ingredients[i].getIngredientId());
                System.out.println(this.ingredients[i].getIngredientName());
                System.out.println(this.ingredients[i].getIngredientOrigen());
                System.out.println(this.ingredients[i].getIngredientCalories());
            }
        }
    }

    public void addIngredientToPizza(Ingredient ingredient) {
        if (nrIngredients < MAX_INGREDIENTS) {
            this.ingredients[nrIngredients] = ingredient;
            this.nrIngredients++;
        } else {
            System.out.println("PIZZA JÁ TEM 5 INGREDIENTS");
        }
    }

    public void imprimeIngredients() {

        for (int i = 0; i < this.ingredients.length; i++) {
            if (this.ingredients[i] != null) {
                System.out.println(this.ingredients[i].getIngredientName());
            }
        }

    }

    public void removeIngredient(int remove) {
        if (this.nrIngredients < remove) {
            System.out.println("Ingrediente não existe");
        } else {
            for (int i = remove - 1; i < ingredients.length - 1; i++) {
                this.ingredients[i] = this.ingredients[i + 1];
            }
            this.ingredients[ingredients.length - 1] = null;
            this.nrIngredients--;
        }

    }
    
    public void caloriasPizza() {
        double total = 0;
        for(int i = 0; i < this.nrIngredients-1; i++){
            total += this.ingredients[i].calories;
        }
        System.out.println("Valor total de calorias: " + total);
    }
}

