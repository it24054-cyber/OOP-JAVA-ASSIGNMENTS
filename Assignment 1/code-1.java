import java.util.Scanner;

class HelloWorld {

public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a = ");
        double a = sc.nextDouble();

        System.out.print("Enter b = ");
        double b = sc.nextDouble();

        System.out.println("Addition = " + add(a, b));
        System.out.println("Subtraction = " + subtract(a, b));
        System.out.println("Multiplication = " + multiply(a, b));
        System.out.println("Division = " + divide(a, b));

        sc.close();
    }
}
