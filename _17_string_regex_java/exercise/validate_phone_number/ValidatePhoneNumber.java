package _17_string_regex_java.exercise.validate_phone_number;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    public static final String REGEX_PHONE_NUMBER ="^(84)[-][0-9]{10}$" ;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap sdt kiem tra: ");
        String phone = sc.nextLine();
        boolean check = Pattern.matches(REGEX_PHONE_NUMBER,phone);
        if (check){
            System.out.println("sdt hop le");
        }else {
            System.out.println("sdt kh hop le");
        }
    }
}
//\d{2}-[0]\d{9}$
