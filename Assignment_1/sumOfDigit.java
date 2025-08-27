import java.util.Scanner;

public class sumOfDigit {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number: ");
        int n = sc.nextInt();
        
        while (n!=0) {
            int r = n % 10;
            sum +=r;
            n=n/10;
        }
        

        System.out.println("Your Sum of Digits is: "+ sum);
   }
    
}
