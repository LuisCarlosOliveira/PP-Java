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
public class ShapeManagement {

    private int SIZE = 2;
    private Shape[] shapes = new Shape[SIZE];
    int count;

    public ShapeManagement() {
        this.count = 0;
    }

    public boolean expandShapeManagement() {
        if (this.count == this.shapes.length) {
            Shape[] temp = new Shape[this.shapes.length * 2];
            System.arraycopy(this.shapes, 0, temp, 0, this.shapes.length);
            this.shapes = temp;
            return true;
        }
        return false;
    }

    public void addShape(Shape p) {
        if (p == null) {
            System.out.println("Shape is null");

        }
        if (this.count == this.shapes.length) {
            expandShapeManagement();

        }
        this.shapes[this.count] = p;
        this.count++;

    }

    public void removeShape(int nr) {
        int size = this.shapes.length;
        if (nr > 0 && nr < size) {
            Shape[] temp = new Shape[size - 1];
            for (int i = 0; i < nr; i++) {
                temp[i] = shapes[i];
            }
            for (int i = nr; i < size - 2; i++) {
                temp[i] = temp[i + 1];
            }
            this.count--;
            this.shapes = temp;

        } else {
            System.out.println("Invalid Position");
        }
    }

    public void removeShape(Shape shape) {
        int pos = -1;
        int size = this.shapes.length;
        if (shape == null) {
            System.out.println("Shape is null");

        } else {
            for (int i = 0; i < size; i++) {
                if (this.shapes[i].equals(shape)) {
                    pos = i;
                }
            }

            if (pos == -1) {
                System.out.println("Shape is not in array");
            } else {

                Shape[] temp = new Shape[size - 1];
                for (int i = 0; i < pos; i++) {
                    temp[i] = shapes[i];
                }

                for (int i = pos; i < size - 2; i++) {
                    temp[i] = temp[i + 1];
                }
                this.count--;
                this.shapes = temp;
            }
        }
    }

    public String printAllShapes() {
        String text = "";
        for (int i = 0; i < this.shapes.length; i++) {
            if (this.shapes[i] != null) {
                text += "------- Shape nr: " + (i + 1) + "-----------\n";
                text += shapes[i].toString() + "\n";
            }
        }
        return text;
    }

    public String printAllSquares() {
        String text = "";
        for (int i = 0; i < this.shapes.length; i++) {
            if ((this.shapes[i] instanceof Square) && !(this.shapes[i] instanceof Rectangle)) {
                text += "------- Shape - Square nr: " + (i + 1) + "-----------\n";
                text += shapes[i].toString() + "\n";
            }
        }
        return text;
    }

    public String printAllRectangle() {
        String text = "";
        for (int i = 0; i < this.shapes.length; i++) {
            if (this.shapes[i] instanceof Rectangle) {
                text += "------- Shape - Rectangle nr: " + (i + 1) + "-----------\n";
                text += shapes[i].toString() + "\n";
            }
        }
        return text;
    }
}
