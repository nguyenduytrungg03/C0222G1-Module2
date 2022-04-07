package _06_inheritance_java.practice.system_object;

public class Rectangle extends Shape {
    private double width =1.0;
    private double lenght =1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }

    public Rectangle(String color, Boolean filled, double width, double lenght) {
        super(color, filled);
        this.width = width;
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }
    public double getArea(){
        return this.lenght*this.width;
    }
    public double getPerimeter(){
        return (this.width+ this.lenght)*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + getWidth() +
                ", lenght=" + getLenght() +
                '}'+
                " which is a subclass of "+
                 super.toString();
    }
}
