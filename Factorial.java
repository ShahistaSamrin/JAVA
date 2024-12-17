/*  Enter a number:
    5
    Factorial of 5 is:120  */
import java.util.Scanner;
public class Factorial{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=s.nextInt();
        long factorial=1;
        for (int i=1;i<=n;i++) {
            factorial*=i;
        }
        System.out.println("Factorial: " + factorial);
    }
}