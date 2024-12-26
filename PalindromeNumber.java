import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int number = sc.nextInt();
        int OrigigalNumber = number;

        int ReverseNumber=0;
        while (number!= 0){
            int digit = number % 10;
            ReverseNumber = ReverseNumber * 10 + digit;
            number = number /10;
        }
        if (ReverseNumber == OrigigalNumber)
            System.out.println("Palindrome Number");
        else
            System.out.println("Not Palindrome Number");
    }
}
