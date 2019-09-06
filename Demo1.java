import java.util.*;
class Vehicle
{
  String model;String color;int y;static int total=0;
  Vehicle(String m,String c,int y)
  {
    model=m; 
    color=c;
    this.y=y;
    total++;
    }
  void display()
  {
   System.out.println("Model- "+model+" Colour- "+color+" Time- "+y);
   }
  static void output()
  {
    System.out.println("Total number- "+total);
}
}
class Demo1
{
  public static void main(String ar[])
  {
   Scanner x=new Scanner(System.in);
   System.out.println("Enter no. of cars");
   int n=x.nextInt();
   Vehicle a[]=new Vehicle[n];
   for(int i=0;i<n;i++)
   {
    System.out.println("Enter model,color,time");
    String m=x.next();
    String c=x.next();
    int t=x.nextInt(); 
    a[i]=new Vehicle(m,c,t);
    a[i].display();
    }
  Vehicle.output();
   }
}
    
    
