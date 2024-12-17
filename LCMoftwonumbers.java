import java.util.Scanner;

class LCMoftwomunbers{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first number:");
        int n1=s.nextInt();
        System.out.println("Enter second number:");
        int n2=s.nextInt();
        int lcm=(n1>n2)?n1:n2;
        while (true) {
            if (lcm%n1==0 && lcm%n2==0) {
                System.out.println("LCM: " + lcm);
                break;
            }
            lcm++;
        }
    }
}