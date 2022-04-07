package _03_array_java.exercise;

import java.util.Arrays;

public class test2 {
    public static void main(String[] args) {
        int[] num ={24};
        changeValuePassByReference(num);
        System.out.println(Arrays.toString(num));
    }
    static void changeValuePassByReference(int[] arg){
        arg[0]=1;
    }
}
