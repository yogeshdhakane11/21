import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number 1 : ");
        int number1 = sc.nextInt();
        System.out.println("Enter a Number 2 : ");
        int number2 = sc.nextInt();

        number1 = number1 + number2;
        number2 = number1 - number2;
        number1 = number1 - number2;

        System.out.println("Number 1 is ="+ number1);
        System.out.println("Number 2 is ="+ number2);
    }
}
