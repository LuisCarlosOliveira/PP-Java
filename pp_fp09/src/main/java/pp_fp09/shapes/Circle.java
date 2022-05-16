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
public class Circle extends Shape {

    private double radius = 1.0;

    public Circle(boolean filled) {
        super(filled);
    }

    public Circle(boolean filled, String color) {
        super(filled, color);
    }

    public Circle(boolean filled, String color, double radius) {
        super(filled, color);
        this.radius = radius;
    }

    /**
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        String text = super.toString() + "Radius: " + this.radius + "\n";
        text += "Area: " + String.format("%,.2f", getArea()) + "\n";
        text += "Perimeter: " + String.format("%,.2f", getPerimeter()) + "\n";

        return text;
    }

    @Override
    public double getArea() {
        return Math.PI * (getRadius() * getRadius());
    }

    @Override
    public double getPerimeter() {
        return Math.PI * getRadius() * 2;
    }
}
