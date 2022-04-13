package _09_dsa_java.practice.class_list_simple;

public class MyListTest {
   public static class Student{
       private  int id;
       private String name;

       public Student(int id, String name) {
           this.id = id;
           this.name = name;
       }

       public Student(){

       }

       public int getId() {
           return id;
       }

       public void setId(int id) {
           this.id = id;
       }

       public String getName() {
           return name;
       }

       public void setName(String name) {
           this.name = name;
       }
   }

    public static void main(String[] args) {
        Student a= new Student(1,"hao");
        Student b= new Student(2,"hung");
        Student c= new Student(3,"hoang");
        Student d= new Student(4,"bao");
    }

}
