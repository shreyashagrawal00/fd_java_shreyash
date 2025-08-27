import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int m = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number: ");
        int n = sc.nextInt();
        int old=n;
        while (n!=0) {
            int r = n%10;
            m=m*10+r;
            n=n/10;
        }
        if( m==old){
            System.out.println("Your Number is Palindrome");
        }
        else{
            System.out.println("Your Number is Not a Palindrome");
        }
    }
}
