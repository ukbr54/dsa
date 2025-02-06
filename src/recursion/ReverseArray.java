package recursion;

public class ReverseArray {

    private static void printReverseArray(int[] arr,int i){
        if(i == arr.length) return;
        printReverseArray(arr,i+1);
        System.out.print(arr[i]+" ");
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        printReverseArray(arr,0);
    }
}
