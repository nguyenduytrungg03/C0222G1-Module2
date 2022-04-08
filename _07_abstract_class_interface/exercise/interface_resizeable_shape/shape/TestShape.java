package _07_abstract_class_interface.exercise.interface_resizeable_shape.shape;

import _07_abstract_class_interface.exercise.interface_resizeable_shape.shape.Circle;
import _07_abstract_class_interface.exercise.interface_resizeable_shape.shape.Rectangle;
import _07_abstract_class_interface.exercise.interface_resizeable_shape.shape.Shape;

public class TestShape  {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("red",true, 4.0);
        shapes[1] = new Rectangle("blue",true, 4.0,6.0);
        shapes[2]= new Square("red",true,4.0);
        for (Shape item : shapes) {
            item.resize(50);
            System.out.println(item);
        }


    }
}
