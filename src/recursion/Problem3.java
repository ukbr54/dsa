package recursion;

/**
 * Print linearly from 1 to N using Backtracking
 * Print N to 1 using Backtracking
 */

public class Problem3 {

    private static void printLinearUsingBacktracking(int i, int n){
        if(i < 1) return;
        printLinearUsingBacktracking(i-1,n);
        System.out.println(i);
    }

    private static void printReverseUsingBacktracking(int i, int n){
        if(i > n) return;
        printReverseUsingBacktracking(i+1,n);
        System.out.println(i);
    }

    public static void main(String[] args) {
        Problem3.printLinearUsingBacktracking(3,3);
        System.out.println("=================");
        Problem3.printReverseUsingBacktracking(1,3);
    }
}
