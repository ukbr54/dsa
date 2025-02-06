package recursion;

import java.util.Scanner;

/**
 * Print linearly from 1 to N
 */
public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int digit = scanner.nextInt();
        Problem2.printLinearNumber(1,digit);
        Problem2.printNumberInReverse(digit,digit);
    }

    private static void  printLinearNumber(int i,int n){
        if(i>n) return;
        System.out.println(i);
        printLinearNumber(i+1,n);
    }

    private static void printNumberInReverse(int i,int n){
        if(i<1)return;
        System.out.println(i);
        printNumberInReverse(i-1,n);
    }
}
