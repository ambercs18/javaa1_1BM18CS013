import java.util.*;
class Rectangle
{
int l,b;
void input()
{
Scanner x=new Scanner(System.in);
System.out.println("Enter 2 inputs");
l=x.nextInt();
b=x.nextInt();
}
int area()
{
return l*b;
}
}
class Demo
{
public static void main(String ar[])
{
Rectangle a=new Rectangle();
Rectangle b=new Rectangle();
a.input();
System.out.println("Area is "+a.area());
b.input();
System.out.println("Area is "+b.area());
}
}


