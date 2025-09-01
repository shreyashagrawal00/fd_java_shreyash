import java.util.Scanner;

public class strong {
     static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num = num / 10;
        }

        if (sum == original) {
            System.out.println(original + " is a Strong number.");
        } else {
            System.out.println(original + " is not a Strong number.");
        }

        scanner.close();
    }
    
}
