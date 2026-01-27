import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();

        int sum = 0;
        int temp = number;

        while (temp > 0) {
            sum += temp % 10;  // Extract the last digit
            temp /= 10;        // Remove the last digit
        }

        System.out.println("The sum of the digits is " + sum);
    }
}
