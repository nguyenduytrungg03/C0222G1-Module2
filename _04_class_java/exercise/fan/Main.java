package _04_class_java.exercise.fan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan(3,true,10,"yellow");
        Fan fan2 = new Fan(2,false,5,"blue");
        Fan fan3 = new Fan();
//        fan1.toString();
//        fan2.toString();
//        System.out.println(fan1);
//        System.out.println(fan2);
        System.out.println(fan3);
    }
}
