package _07_abstract_class_interface.exercise.interface_colorable_shape.shape;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Square("yellow", true, 4.0);

        shape[1] = new Circle("gray", true, 5.0);

        shape[2] = new Rectangle("red", true, 4.0, 6.0);
        for (Shape item : shape) {

            if (item instanceof Square) {

                Square square = (Square) item;

                square.howToColor();
            }
            System.out.println(item);
        }
    }
}
