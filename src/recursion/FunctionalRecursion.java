package recursion;

public class FunctionalRecursion {

    private static int sum(int i){
        if(i < 1) return 0;
        return i + sum(i-1);
    }

    public static void main(String[] args) {
        System.out.println(FunctionalRecursion.sum(3));
    }
}
