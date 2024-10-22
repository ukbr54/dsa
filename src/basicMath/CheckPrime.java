package basicMath;

import java.util.Scanner;

public class CheckPrime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a digit");
        int digit = scanner.nextInt();
        CheckPrime.isPrime(digit);
    }

    private static void isPrime(int n){
        int count = 0;
        for(int i=1; i*i<=n; i++){
            if(n % i == 0){
                count ++;
                if(n/i != i){
                    count ++;
                }
            }
        }
        if(count == 2) {
            System.out.println("The number is prime");
        }else{
            System.out.println("The number is not prime");
        }
    }
}
