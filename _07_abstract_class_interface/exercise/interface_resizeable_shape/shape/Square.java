package _07_abstract_class_interface.exercise.interface_resizeable_shape.shape;

import _07_abstract_class_interface.exercise.interface_resizeable_shape.Resizeable;

public class Square extends Shape implements Resizeable {
    private double side ;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filler, double side) {
        super(color, filler);
        this.side = side;
    }

    public Square(String color, boolean filler) {
        super(color, filler);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square: " + super.toString() +
                ", side= " + side ;
    }

    @Override
    public void resize(double percent) {
        this.side = this.side+ this.side * percent/100;
    }
}
