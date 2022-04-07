package _04_class_java.exercise.quadratic_equation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập a: ");
        double a = sc.nextDouble();
        System.out.println("nhập b: ");
        double b = sc.nextDouble();
        System.out.println("nhập c: ");
        double c = sc.nextDouble();
        QuadraticEquation quadraticEquation =  new QuadraticEquation(a,b,c);
        if(quadraticEquation.getDiscriminant()>0){
            System.out.println("Phương trình ra hai nghiệm: \n " + "Nghiệm thứ nhất :"+ quadraticEquation.getRoot1() + " nghiệm thứ hai: "+quadraticEquation.getRoot2());
        }else if (quadraticEquation.getDiscriminant()==0){
            System.out.println("Phương trình có nghiệm kép: " + quadraticEquation.getRoot1());
        }else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
