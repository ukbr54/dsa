package basicMath;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * 36 divides by 1,2,3,4,6,9,12,18,36
 */
public class PrintAllDivisors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a digit");
        int digit = scanner.nextInt();
        PrintAllDivisors.printAllDivisor(digit);
        System.out.println();
        System.out.println("============================");
        PrintAllDivisors.printAllDivisorUsingSquareRoot(digit);
    }
    private static void printAllDivisor(int n){
        for(int i=1; i<=n; i++){
            if(n % i == 0){
                System.out.print(i+" ");
            }
        }
    }

    private static void printAllDivisorUsingSquareRoot(int n){
        List<Integer> result = new ArrayList<>();
        for(int i=1; i*i<=n; i++){
            if(n % i == 0){
                result.add(i);
                if(n/i != i){
                    result.add(n/i);
                }
            }
        }
        result.sort(Comparator.naturalOrder());
        System.out.println(result);
    }
}
