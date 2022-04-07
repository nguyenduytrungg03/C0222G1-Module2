package _04_class_java.exercise.fan;

public class Fan {
    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;

    public Fan() {
        this(1, false, 5, "blue");
    }
    public Fan(int speed, boolean status, double radius, String color) {
        this.speed = speed;
        this.status = status;
        this.radius = radius;
        this.color = color;
    }

    private int speed;

    private boolean status;

    private double radius;

    private String color;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return status;
    }

    public void setOn(boolean on) {
        this.status = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (isOn()) {
            return "speed: " + getSpeed() + ";" + " color: " + getColor() + ";" + " radius: " + getRadius()+ ";" + " fan is on";
        } else {
            return "color: " + getColor()+ ";" + " radius: " + getRadius() + ";" + " fan is off";
        }
    }


}
