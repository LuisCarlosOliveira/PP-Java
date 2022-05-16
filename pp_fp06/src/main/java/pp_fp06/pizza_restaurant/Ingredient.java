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
public class Ingredient {

    protected String ingredientID;
    protected String ingredientName;

    protected enum IngredientOrigen {
        ANIMAL,
        VEGETAL,
        MINERAL;

        public String origenToString(IngredientOrigen origen) {
            switch (origen) {
                case ANIMAL:
                    return "The ingredient origin is Animal";
                case VEGETAL:
                    return "The ingredient origin is Vegetal";
                default:
                    return "The ingredient origin is Mineral";
            }
        }
    };
    private IngredientOrigen origen;
    protected double calories;

    public Ingredient(String ingredientID, String ingredientName, IngredientOrigen origen,
            double calories) {
        this.ingredientID = ingredientID;
        this.ingredientName = ingredientName;
        this.origen = origen;
        this.calories = calories;
    }

    public void setIngredientId(String ingredientID) {
        this.ingredientID = ingredientID;
    }

    public String getIngredientId() {
        return this.ingredientID;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public String getIngredientName() {
        return this.ingredientName;
    }

    public void setIngredientOrigen(IngredientOrigen origen) {
        this.origen = origen;
    }

    public IngredientOrigen getIngredientOrigen() {
        return this.origen;
    }

    public void setIngredientCalories(double calories) {
        this.calories = calories;
    }

    public double getIngredientCalories() {
        return this.calories;
    }

}
