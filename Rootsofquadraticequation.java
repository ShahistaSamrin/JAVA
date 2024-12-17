class Rootsofquadraticequation{
    public static void main(String args[]){
        double a=2,b=4,c=5.6,r1,r2;
        double discriminant=b*b-4*a*c;
        if(discriminant>0)
        {
            System.out.println("roots are real and distinct");
            r1=-b+Math.sqrt(discriminant)/(2*a);
            r2=-b-Math.sqrt(discriminant)/(2*a);
            System.out.println("r1=%.2f\n r2=%.2f",r1,r2);
        }
        else if(discriminant==0)
        {
            System.out.println("roots are real and equal");
            r1=r2=-b/(2*a);
            System.out.println("r1=r2=%.2f",r1);
        }
        else{
            System.out.println("roots are complex and distinct");
            double real=-b/(2*a);
            double imaginary=Math.sqrt(discriminant)/(2*a);
            System.out.println("r1=%.2f+%.2f*i,"real,imaginary);
            System.out.println("\nr2=%.2f-%.2f*i,"real,imaginary);
        }
    }
}