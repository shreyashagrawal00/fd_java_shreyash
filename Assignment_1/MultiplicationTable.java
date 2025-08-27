import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        System.out.print("Enter any Number For Multiplictaion Table: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=10;i++ ){
           System.out.println(i +"x"+ n + "="+ (i*n));
        }

    }
    
}
