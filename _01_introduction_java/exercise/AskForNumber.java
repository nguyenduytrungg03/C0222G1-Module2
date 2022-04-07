package _01_introduction_java.exercise;


import java.util.Scanner;

public class AskForNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input your number !");
        String donvi = "";
        String chuc = "";
        String tram = "";

        int number = scanner.nextInt();
        int numberUnits = number % 10;
        int numberDozens = (number % 100) / 10;
        int numberHundreds = number / 100;


        switch (numberUnits) {
            case 1:
                donvi = "one";
                break;
            case 2:
                donvi = "two";
                break;
            case 3:
                donvi = "three";
                break;
            case 4:
                donvi = "four ";
                break;
            case 5:
                donvi = "five ";
                break;
            case 6:
                donvi = "six ";
                break;
            case 7:
                donvi = "seven ";
                break;
            case 8:
                donvi = "eight ";
                break;
            case 9:
                donvi = " nine ";
                break;
        }
        switch (numberHundreds) {
            case 1:
                tram = "one hundred ";
                break;
            case 2:
                tram = "two hundreds ";
                break;
            case 3:
                tram = "three hundreds";
                break;
            case 4:
                tram = "four hundreds";
                break;
            case 5:
                tram = "five hundreds";
                break;
            case 6:
                tram = "six hundreds";
                break;
            case 7:
                tram = " seven hundreds";
                break;
            case 8:
                tram = " eight  hundreds";
                break;
            case 9:
                tram = " nine  hundreds";
                break;
        }
        if (numberDozens == 1) {
            switch (numberUnits) {
                case 0:
                    chuc = "ten";
                case 1:
                    chuc = " eleven ";
                    break;
                case 2:
                    chuc = "twelve";
                    break;
                case 3:
                    chuc = "thirteen";
                    break;
                case 4:
                    chuc = "fourteen";
                    break;
                case 5:
                    chuc = "fifteen";
                    break;
                case 6:
                    chuc = "sixteen";
                    break;
                case 7:
                    chuc = "seventeen";
                case 8:
                    chuc = "eighteen";
                case 9:
                    chuc = "nineteen";
            }

        } else {
            switch (numberDozens) {
                case 2:
                    chuc = " twenty ";
                    break;
                case 3:
                    chuc = " thirty ";
                    break;
                case 4:
                    chuc = " forty ";
                    break;
                case 5:
                    chuc = " fifty ";
                    break;
                case 6:
                    chuc = " sixty ";
                    break;
                case 7:
                    chuc = " seventy ";
                    break;
                case 8:
                    chuc = " eighty ";
                    break;
                case 9:
                    chuc = " ninety ";
                    break;
                default:
                    System.out.println("");
            }
        }
        if (numberDozens == 1) {
            System.out.println(tram + chuc);
        } else {
            System.out.println(tram + chuc + donvi);
        }
    }
}
