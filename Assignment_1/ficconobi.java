import java.util.Scanner;

public class ficconobi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many terms you want: ");
        int n = scanner.nextInt();

        int first = 0, second = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }

        scanner.close();
    }
}
