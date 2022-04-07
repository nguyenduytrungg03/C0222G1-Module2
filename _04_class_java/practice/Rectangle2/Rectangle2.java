package _04_class_java.practice.Rectangle2;


public class Rectangle2 {
    private double width;
    private double hight;

    public Rectangle2(double width, double hight) {
        this.width = width;
        this.hight = hight;
    }
    public double getArea(){
        return this.hight*this.width;
    }
    public double getPerimeter(){
        return (this.width+ this.hight)*2;
    }
    public String display(){
        return "Rectangle của bạn có chiều dài là " + width + "chiều rộng là: " + hight ;
    }
}
