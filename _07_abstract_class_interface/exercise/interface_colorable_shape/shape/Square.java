package _07_abstract_class_interface.exercise.interface_colorable_shape.shape;

import _07_abstract_class_interface.exercise.interface_colorable_shape.Colorable;

public class Square extends Shape implements Colorable {
    private double size;

    public Square() {
    }

    public Square(double size) {
        this.size = size;
    }

    public Square(String color, boolean filled, double size) {
        super(color, filled);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Square: " + super.toString()+
                "size=" + size ;
    }


    @Override
    public void howToColor() {
        System.out.println("Color all four size");
    }
}
