package _05_access_modifier_static_java.practice.static_method;

public class Student {
    private  int rollno;
    private  String name;
    private static String college = "BBDIT"; //biến//

     Student(int r, String n) { //contructor//
        rollno = r;
        name = n;
    }

    static void change(){ //phương thức static//
         college = "Codegym";
    }

    void display(){ //phương thức
        System.out.println(rollno + "" + name + "" + college);
    }
}
