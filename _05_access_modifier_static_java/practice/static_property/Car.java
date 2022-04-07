package _05_access_modifier_static_java.practice.static_property;

public class Car {
    private String name;
    private String engine; // khai báo biến

    public static int numberOfCars;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
        // dựng contructor
    }
}
