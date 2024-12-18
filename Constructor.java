class Constructor
{
int x;
String name;
void print()
{
System.out.printf("id=%d\nname=%c",x,name);
}
}
class Const
{
public static void main(String args[])
{
Constructor c=new Constructor();
c.print();
}
}