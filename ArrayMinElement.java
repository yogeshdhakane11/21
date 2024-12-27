import java.util.Arrays;

public class ArrayMinElement {
    public static void main(String[] args) {
        int []arr = {10,5,11,44,4};

        int minimnum = Arrays.stream(arr).min().getAsInt();
        System.out.println("Minimum value : " + minimnum);

        //approach 1
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Minimum value in the array is: " + min);
    }
}
