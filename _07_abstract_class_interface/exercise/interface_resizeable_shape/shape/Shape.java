package _07_abstract_class_interface.exercise.interface_resizeable_shape.shape;

import _07_abstract_class_interface.exercise.interface_resizeable_shape.Resizeable;

public abstract class Shape implements Resizeable {
    private String color = "green";
    private boolean filler = true; // thuộc tính

    public Shape() {
    }

    public Shape(String color, boolean filler) {
        this.color = color;
        this.filler = filler;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFiller() {
        return filler;
    }

    public void setFiller(boolean filler) {
        this.filler = filler;
    }

    @Override
    public String toString() {
        return "color=" + color + "\t" +
                ", filler= " + filler ;
    }
}
