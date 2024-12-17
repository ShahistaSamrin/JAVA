/* :0,1,1,2,3,5,8,13,21,34,55,89   */
public class Fibonacciseries{
    public static void main(String args[]){
        int n=10,num1=0,num2=1;
        System.out.println("Fibonacci Series:"+num1+","+num2);
        for(int i=0;i<n;i++){
            int num3=num1+num2;
            System.out.print(","+num3);
            num1=num2;num2=num3;

        }
    }
}