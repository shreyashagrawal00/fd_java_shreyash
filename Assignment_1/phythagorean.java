import java.util.Scanner;

public class phythagorean {
    public class pythagorentriplet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        System.out.print("Enter third number: ");
        int c = scanner.nextInt();

        
        int max = Math.max(a, Math.max(b, c));
        int x, y;

        if (max == a) {
            x = b;
            y = c;
        } else if (max == b) {
            x = a;
            y = c;
        } else {
            x = a;
            y = b;
        }

    
        if (max * max == x * x + y * y) {
            System.out.println("It is a Pythagorean triplet.");
        } else {
            System.out.println("It is not a Pythagorean triplet.");
        }

        scanner.close();
    }
}
