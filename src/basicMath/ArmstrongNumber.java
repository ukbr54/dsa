package basicMath;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a digit");
        int digit = scanner.nextInt();
        System.out.println("Is Armstrong number: "+ArmstrongNumber.checkArmstrongNumber(digit));
    }

    private static boolean checkArmstrongNumber(int n){
        int count = 0;
        int a = n;
        while(a>0){
            count++;
            a=a/10;
        }
        System.out.println(count);
        double originalNumber = n;
        double sum = 0;
        while(n > 0){
            int lastDigit = n % 10;
            n = n / 10;
            sum = sum + Math.pow(Double.parseDouble(String.valueOf(lastDigit)),Double.parseDouble(String.valueOf(count)));
        }
       return originalNumber == sum;
    }
}
