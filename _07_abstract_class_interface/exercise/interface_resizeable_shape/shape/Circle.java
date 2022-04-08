package _07_abstract_class_interface.exercise.interface_resizeable_shape.shape;

import _07_abstract_class_interface.exercise.interface_resizeable_shape.Resizeable;
import _07_abstract_class_interface.exercise.interface_resizeable_shape.shape.Shape;

public class Circle extends Shape implements Resizeable {
   private double radius ;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filler, double radius) {
        super(color, filler);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle: " + super.toString()+
                ", radius= " + radius + ", Area= " +getArea() ;
    }

    @Override
    public void resize(double percent) {
        this.radius = this.radius + this.radius* percent/100;
    }
}
