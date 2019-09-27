import java.util.*;
abstract class Shape
{
  int l,b;
  void set()
 {
   Scanner x=new Scanner(System.in);
   System.out.println("Enter 2 values");
   l=x.nextInt();
   b=x.nextInt();
 }
  abstract void printarea();
}
class Rectangle extends Shape
{
  void printarea()
  {super.set();
    System.out.println("Area of Rectangle is "+l*b);
  }
}
class Triangle extends Shape
{
  void printarea()
 {
   super.set();
   System.out.println("Area of Triangle is "+.5*(l*b));
  }
}
class Circle extends Shape
{
  void printarea()
  {
   Scanner x=new Scanner(System.in);
   System.out.println("Enter radius");
   int r=x.nextInt();
   System.out.println("Area of Circle is "+(3.14*r*r));
  }
}
class CDE
{
 public static void main(String ar[])
 {
  Shape r=null;
  Scanner x=new Scanner(System.in);
  int ch1;
  do
  {
   System.out.println("Enter 1 for area of rectangle\nEnter 2 for area of Triangle\nEnter 3 for area of Circle");
   int ch=x.nextInt();
  if(ch==1)
  r=new Rectangle();
  else if(ch==2)
  r=new Triangle();
  else
  r=new Circle();
r.printarea();
  System.out.println("Enter 1 to continue 0 to exit");
  ch1=x.nextInt();
  }while(ch1!=0);
  }
} 
