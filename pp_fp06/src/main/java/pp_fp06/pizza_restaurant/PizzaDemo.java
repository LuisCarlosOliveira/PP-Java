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
public class PizzaDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Ingredient i1 = new Ingredient("I01", "Tomate", Ingredient.IngredientOrigen.MINERAL, 55);

        System.out.println(i1.getIngredientId());
        System.out.println(i1.getIngredientName());
        System.out.println(i1.getIngredientOrigen());
        System.out.println(i1.getIngredientCalories());

        i1.setIngredientOrigen(Ingredient.IngredientOrigen.VEGETAL);

        System.out.println(i1.getIngredientOrigen());
        System.out.println("-----------------");

        Ingredient i2 = new Ingredient("I02", "Queijo", Ingredient.IngredientOrigen.ANIMAL, 25.5);
        Ingredient i3 = new Ingredient("I03", "Pimenta", Ingredient.IngredientOrigen.MINERAL, 5.5);
        Ingredient i4 = new Ingredient("I04", "Cogumelo", Ingredient.IngredientOrigen.VEGETAL, 25.5);
        Ingredient i5 = new Ingredient("I05", "Fiambre", Ingredient.IngredientOrigen.ANIMAL, 30.5);
        Ingredient i6 = new Ingredient("I06", "Azeitona", Ingredient.IngredientOrigen.VEGETAL, 10);

        Ingredient[] ing1 = {i1, i2, i3};
        Ingredient[] ing2 = {i1, i2, i3, i6, i5};
        Ingredient[] ing3 = {i1, i2, i3, i4, i5, i6};

        Pizza p1 = new Pizza("P01", "Pizza 1", "Pizza teste 1", 19.99, ing1, PizzaSize.MEDIUM);
        Pizza p2 = new Pizza("P02", "Pizza 2", "Pizza teste 2", 39.99, ing2, PizzaSize.BIG);
        //      Pizza p3 = new Pizza("P03", "Pizza 3", "Pizza teste 3", 9.99, ing3, PizzaSize.SMALL);

        p1.imprimeIngredients();
        System.out.println("----Adiciona p1-------------");
        p1.addIngredientToPizza(i6);
        System.out.println("-------Imprime p1----------");
        p1.imprimeIngredients();
        System.out.println("---------Imprime p2--------");
        p2.imprimeIngredients();
        System.out.println("-------Adiciona p2----------");
        p2.addIngredientToPizza(i6);
        System.out.println("-------Imprime p2----------");
        p2.imprimeIngredients();

        System.out.println("---Informação sobre I03 pimenta---");

        p2.ingredientInfo("I03");
        
        System.out.println("-------Descrição ----------");
        p2.printDescriptionAndIngredients();
       
        System.out.println("-------Remove ingrediente nr 3 ----------");
        p2.removeIngredient(3);
        System.out.println("---------Imprime p2--------");
        p2.imprimeIngredients();
        
        System.out.println("---------Imprime calorias p2--------");
        p2.caloriasPizza();
        
        Pizza[] p_arr = new Pizza[9];
        p_arr[0] = p1;
        p_arr[1] = p2;
        
        Ementa e1 = new Ementa("designaçao 1", "Descriçao 1", "E01", "2021-02-20", p_arr);
        System.out.println("-----Testes para ementa------------");
        System.out.println(e1.pizzas.length);
        System.out.println(e1.status);
        //e1.activateEmenta();
        System.out.println(e1.status);
        
        Ementa e2 = new Ementa("designaçao 2", "Descriçao 2", "E02", "2021-02-20", p_arr);
        Ementa e3 = new Ementa("designaçao 3", "Descriçao 3", "E03", "2021-02-20", p_arr);
        
        Ementa[] e_arr = {e1, e2, e3};
        
        Ementas ementas = new Ementas(e_arr);
        
        System.out.println("-----Testes para ementas------------");
        System.out.println(ementas.ementas[0].status);
        ementas.activarEmenta(1);
        System.out.println(ementas.ementas[0].status);
        ementas.activarEmenta(2);
        System.out.println(ementas.ementas[1].status);
        
        
        
        
        
        
        
        
        
    }

}
