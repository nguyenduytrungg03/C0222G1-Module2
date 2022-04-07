package _06_inheritance_java.exercise.shape;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(double hight) {
        this.height = hight;
    }

    public Cylinder(double radius, String color, double hight) {
        super(radius, color);
        this.height = hight;
    }
    public double getVolumeOfCylinder(){
        return height*Math.PI*getRadius()*getRadius();
    }

    @Override
    public String toString() {
        return "Cylinder " +
                "height= " + height +
                '}'+
                ", Volume= "+getVolumeOfCylinder()+"\n"
                + super.toString();
    }
}
