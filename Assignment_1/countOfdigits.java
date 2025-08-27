import java.util.Scanner;

public class countOfdigits {
    public static void main(String[] args) {
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number: ");
        int n = sc.nextInt();
        
        if (n==0){
            count = 1;
        } else {
            while (n != 0) {
                n = n / 10;
                count++;
            }
        }
        
        System.out.println("Your Count of Digits is: "+ count);
   }
    
}
