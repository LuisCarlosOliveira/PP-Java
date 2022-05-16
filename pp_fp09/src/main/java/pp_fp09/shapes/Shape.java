/*
 * @file: 
 * @author: Luis Oliveira <https://github.com/LuisCarlosOliveira>
 * @date
 * @brief
 */
package pp_fp09.shapes;

/**
 *
 * @author Luis Oliveira <https://github.com/LuisCarlosOliveira>
 */
public abstract class Shape {

    private String color = "red";
    private boolean filled;

    public Shape(boolean filled) {
        this.filled = filled;
    }

    public Shape(boolean filled, String color) {
        this.filled = filled;
        this.color = color;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the filled
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * @param filled the filled to set
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        String text = "";

        text += "Color: " + this.color + "\n" + "Filled: " + this.filled + "\n";
        return text;
    }

    abstract public double getArea();

    abstract public double getPerimeter();

}
