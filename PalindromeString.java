import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder(str);
        String reverseString = sb.reverse().toString();
        if (str.equals(reverseString))
            System.out.println("Palindrome String");
        else
            System.out.println("Not Palindrome String");
    }
}
