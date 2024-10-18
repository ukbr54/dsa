package basicMath;

import java.util.Scanner;

public class Palimdrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a digit");
        int digit = scanner.nextInt();
        System.out.println("Is palimdrome: "+Palimdrome.checkPalimdrome(digit));
    }

    private static boolean checkPalimdrome(int n){
        int originalNumber = n;
        int reverseNumber = 0;
        while(n > 0){
            int lastDigit = n % 10;
            n = n / 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
        }
        return originalNumber == reverseNumber;
    }
}
