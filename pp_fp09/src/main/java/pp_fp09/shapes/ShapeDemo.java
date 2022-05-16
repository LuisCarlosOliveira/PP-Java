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
public class ShapeDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ShapeManagement shapes = new ShapeManagement();

        Shape c1 = new Circle(true, "Red", 2.0);

        Shape s1 = new Square(true, "Blue", 5.0);

        Shape r1 = new Rectangle(true, "Yellow", 4.0);

        Shape s2 = new Square(true, "Pink", 3.0);

        Shape r2 = new Rectangle(true, "Grey", 4.0);

        shapes.addShape(c1);
        shapes.addShape(s1);
        shapes.addShape(r1);
        shapes.addShape(s2);
        shapes.addShape(r2);

        System.out.println(shapes.printAllShapes());
        System.out.println(shapes.printAllRectangle());
        System.out.println(shapes.printAllSquares());

    }

}
