import java.util.*;
class Point
{
private double x,y;
Point()
{
x=0;
y=0;
}
Point(double a,double b)
{
x=a;
y=b;
}
Point(Point ob)
{
x=ob.x;
y=ob.y;
}
double distance(Point ob)
{
double d=Math.sqrt(Math.pow((x-ob.x),2)+Math.pow((y-ob.y),2));
return d;
}
}
class Pointdemo
{
public static void main(String ar[])
{
System.out.println("Enter 2 co-ordinates");
Scanner sc=new Scanner(System.in);
double x1=sc.nextDouble();
double y1=sc.nextDouble();
double x2=sc.nextDouble();
double y2=sc.nextDouble();
Point ob=new Point(x1,y1);
Point ob1=new Point(ob);
Point ob3=new Point(x2,y2);
System.out.println("Distance is- "+ob1.distance(ob3));
}
}
