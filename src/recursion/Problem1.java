package recursion;

import java.util.Scanner;

/**
 *  Print name N times using Recursion
 */
public class Problem1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to print the name");
        int digit = scanner.nextInt();
        Problem1.printName(1,digit);
    }

    private static void printName(int i, int n){
        if(i>n) return;
        System.out.println("Thanos");
        printName(i+1,n);
    }
}
