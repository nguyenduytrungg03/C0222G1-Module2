package _05_access_modifier_static_java.practice.static_method;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();

        Student student = new Student(111, " Hoang ");
        Student student2 = new Student(222, " Duy ");
        Student student3 = new Student(333, " Phuc ");

        student.display();
        student2.display();
        student3.display();
    }
}
