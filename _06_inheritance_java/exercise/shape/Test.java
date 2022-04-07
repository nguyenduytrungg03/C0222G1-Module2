package _06_inheritance_java.exercise.shape;

public class Test {
    public static void main(String[] args) {

        Circle circle = new Circle(3.0,"red");
        System.out.println(circle);

        Cylinder cylinder = new Cylinder(4.0,"yellow",4.0);
        System.out.println(cylinder);
    }
}
