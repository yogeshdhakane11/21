import java.util.Scanner;

public class EvenOddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int number = sc.nextInt();

        if (number % 2 == 0)
            System.out.println("Number is Even");
        else
            System.out.println("Number is Odd");
    }
}
