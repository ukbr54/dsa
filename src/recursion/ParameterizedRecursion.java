package recursion;

/**
 * find sum of 1 to n
 */
public class ParameterizedRecursion {

    private static int add(int i, int sum){
        if(i < 1) return sum;
       return add(i-1,sum+i);
    }

    public static void main(String[] args) {
        System.out.println(ParameterizedRecursion.add(3, 0));
    }
}
