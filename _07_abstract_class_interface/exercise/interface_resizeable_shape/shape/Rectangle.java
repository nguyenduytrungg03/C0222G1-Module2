package _07_abstract_class_interface.exercise.interface_resizeable_shape.shape;

import _07_abstract_class_interface.exercise.interface_resizeable_shape.Resizeable;
import _07_abstract_class_interface.exercise.interface_resizeable_shape.shape.Shape;

public class Rectangle extends Shape implements Resizeable {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean filler, double width, double height) {
        super(color, filler);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return this.height*this.width;
    }

    @Override
    public String toString() {
        return "Rectangle: " + super.toString() +
                ", width= " + width +
                ", height= " + height +
                ", Area= " + getArea();
    }

    @Override
    public void resize(double percent) {
        this.height = this.height + this.height * percent/100;
        this.width = this.width + this.width * percent/100;
    }
}
