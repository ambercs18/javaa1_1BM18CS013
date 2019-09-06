import java.util.*;
class account
{
    String n;int no;float b;
    void input()
    {
      Scanner x=new Scanner(System.in);
      System.out.println("Enter name number and balance");
      n=x.nextLine();
      no=x.nextInt();
      b=x.nextFloat();
     }
    void display()
    {
      System.out.println(" Name- "+n+" Acc. Number- "+no+" Balance- "+b);
      }
}
class savings extends account
{
   float r;
   int t;
   void input()
   { super.input();
     Scanner x=new Scanner(System.in);
     System.out.println("Enter rate and time");
     r=x.nextFloat();
     t=x.nextInt();
     }
   float compute()
   {
     return ((b*r*t)/100);
    }
   void display()
   { 
     super.display();
     System.out.println(" New Balance- "+(b+compute()));
    }
}
class Demon
{
  public static void main(String a[])
  {
    savings ob=new savings();
    ob.input();
    ob.display();
}
} 

