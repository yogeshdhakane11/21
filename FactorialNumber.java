import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();

        int fact=1;
        for (int i = 2; i <=number; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + number + " is = " + fact);
    }
}
