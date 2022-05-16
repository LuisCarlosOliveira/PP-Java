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
public class Square extends Shape {

    private double width = 1.0;

    public Square(boolean filled) {
        super(filled);
    }

    public Square(boolean filled, String color) {
        super(filled, color);
    }

    public Square(boolean filled, String color, double width) {
        super(filled, color);
        this.width = width;
    }

    /**
     * @return the width
     */
    
    
    public double getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(double width) {
        this.width = width;
    }
    
    @Override
    public String toString() {
        String text = super.toString() + "Width: " + this.width + "\n";
        text += "Area: " + String.format("%,.2f", getArea()) + "\n";
        text += "Perimeter: " + String.format("%,.2f", getPerimeter()) + "\n";

        return text;
    }

    @Override
    public double getArea() {
        return this.width * this.width;
    }

    @Override
    public double getPerimeter() {
        return this.width * 4;
    }
    

}
