package basicMath;

import java.util.Scanner;

public class Gcd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first digit");
        int a = scanner.nextInt();
        System.out.println("Enter second digit");
        int b = scanner.nextInt();
        //Gcd.findGcd_firstMethod(a,b);
        Gcd.findGcd_secondMethodUsingEuclideanAlgorithm(a,b);
    }

    private static void findGcd_firstMethod(int a,int b){
        int gcd = 1;
        int min = Math.min(a, b);
        for(int i=min; i>=1; i--){
            if (a % i == 0 && b % i == 0) {
                gcd = i;
                break;
            }
        }
        System.out.println("GCD of " +a+ " and "+b+ " = "+gcd);
    }

    private static void findGcd_secondMethodUsingEuclideanAlgorithm(int a,int b){
        int n1 = a;
        int n2 = b;
        while(a > 0 && b > 0){
            if(a > b) a = a % b;
            else b = b % a;
        }
        if(a==0) System.out.println("GCD of " +n1+ " and "+n2+ " = "+b);
        else System.out.println("GCD of " +n1+ " and "+n2+ " = "+a);
    }
}
