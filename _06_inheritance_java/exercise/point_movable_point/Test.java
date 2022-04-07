package _06_inheritance_java.exercise.point_movable_point;

public class Test {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);

        Point point1 = new Point(4.0f,5.0f);
        System.out.println(point1);

        MovablePoint movablePoint= new MovablePoint();
        System.out.println(movablePoint);

        MovablePoint movablePoint1 = new MovablePoint(5.0f,6.0f,7.0f,8.0f);
        System.out.println(movablePoint1);
        System.out.println(movablePoint1.move());


    }

}
