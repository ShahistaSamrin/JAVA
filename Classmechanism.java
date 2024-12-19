class Demo
{
    int x,y;
    void assign(int a,int b)
    {
        x=a;
        y=b;
    }
    void display()
    {
        System.out.println("value of x="+x);
        System.out.println("value of y="+y);
    }
    void print()
    {
        System.out.println("x*y="+(x*y));
        System.out.println("x+y="+(x+y));
    }
}
class classmechanism
{
    public static void main(String args[])
    {
        Demo f=new Demo();
        f.assign(3,5);
        f.display();
        f.print();
    }
}

