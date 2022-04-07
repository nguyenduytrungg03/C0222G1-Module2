package _05_access_modifier_static_java.exercise.class_write_java;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("trung");
        System.out.println(student.getName());
        student.setClasses("C0222G1");
        System.out.println(student.getClasses());
    }

}
