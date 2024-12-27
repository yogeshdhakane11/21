import java.util.Arrays;

public class ArrayMaxElement {
    public static void main(String[] args) {
        int[] numArray = {10, 20, 40, 30, 15};
        int maximum = Arrays.stream(numArray).max().getAsInt();
        System.out.println("Maximum value in the array is: " + maximum);

        //approach 1
        int max = numArray[0];
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] > max){
                max = numArray[i];
            }
        }
        System.out.println("Maximum value : " + max);
    }
}
