package basicMath;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the digit: ");
        long digit = scanner.nextLong();
        System.out.println("Reverse number: "+ReverseNumber.reverseBits(digit));
    }

    public static long reverseBits(long n) {
        long reverseNumber = 0;
        while(n > 0){
            long lastDigit = n % 10;
            n = n / 10;
            reverseNumber = (reverseNumber*10) + lastDigit;
        }
        return reverseNumber;
    }
}
