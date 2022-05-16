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
public class Rectangle extends Square{
    
    private double height = 1.0;
    
    public Rectangle(boolean filled) {
        super(filled);
    }

    public Rectangle(boolean filled, String color) {
        super(filled, color);
    }

    public Rectangle(boolean filled, String color, double width) {
        super(filled, color, width);
    }
    
    public Rectangle(boolean filled, String color, double width, double heigth) {
        super(filled, color, width);
        this.height = height;
    }

    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }
    
    @Override
    public String toString() {
        String text = super.toString() + "Height: " + this.height + "\n";
        text += "Area: " + String.format("%,.2f", getArea()) + "\n";
        text += "Perimeter: " + String.format("%,.2f", getPerimeter()) + "\n";

        return text;
    }

    @Override
    public double getArea() {
        return this.height * getWidth();
    }

    @Override
    public double getPerimeter() {
        return (this.height * 2) + (getWidth()*2);
    }
    
}
