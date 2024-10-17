package basicMath;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a digit: ");
        int digit = scanner.nextInt();
        scanner.close();
        System.out.println("Count the digit "+CountDigit.count(digit));
        System.out.println("Count the digit using log: "+CountDigit.countUsingLog(digit));
    }

    private static int count(int n){
        int count = 0;
        while(n > 0){
            int lastDigit = n % 10;
            n = n / 10;
            count++;
        }
        return count;
    }

    private static int countUsingLog(int n){
        double value = Double.parseDouble(String.valueOf(n));
        double v = Math.log10(value);
        int cnt = Integer.parseInt(Double.toString(v));
        return cnt;
    }
}
