package _02_loop_java.exercise;

public class Show20Prime {
    static boolean isPrime(int number) {
                if (number<2){
                    return false;
                }else if (number==2){
                    return true;
                }else if (number%2==0){
                    return false;
                }else {
                    for (int i = 3; i <= Math.sqrt(number) ; i+=2) {
                        if(number%i==0){
                            return false;
                        }
                    }
                }
                return true;
    }
    public static void main(String[] args) {
        int n =2;
        int count=0;
        while (count<20){
            if (isPrime(n)){
                System.out.println(n);
                count++;
            }
            n++;
        }
    }
}
