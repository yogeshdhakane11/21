import java.util.Scanner;

public class FibbonaciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();

        int first, second, next;
        first = 0;
        second = 1;
        System.out.print(first + " "+ second + " ");

        for (int i = 0; i <number ; i++) {
            next = first + second;
            first = second;
            second = next;
            System.out.print(next + " ");
        }
    }
}
