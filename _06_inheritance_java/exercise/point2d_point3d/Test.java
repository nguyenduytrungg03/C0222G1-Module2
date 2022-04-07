package _06_inheritance_java.exercise.point2d_point3d;

public class Test {
    public static void main(String[] args) {
        Point2d point2d = new Point2d();
        System.out.println(point2d);

        Point2d point2d1 = new Point2d(3.0f,4.0f);
        System.out.println(point2d1);


        Point3d point3d = new Point3d();
        System.out.println(point3d);

        Point3d point3d1 = new Point3d(4.6f,5.2f,6.2f);
        System.out.println(point3d1);
    }
}
