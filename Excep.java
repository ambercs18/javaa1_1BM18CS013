import java.util.*;
class AgeException extends Exception
{
 String n;
 AgeException(String s)
 {
  n=s;
  }
 public String toString()
 {
  return n;
  }
}
class Father
{
 int a;
 Father() throws AgeException
 {
  Scanner x=new Scanner(System.in);
  System.out.println("Enter Father's Age");
  a=x.nextInt();
  if(a<0)
  throw new AgeException("Age less than zero");
  }
}
class Son extends Father
{
 int b;
 Son() throws AgeException
 {
  super();
  Scanner x=new Scanner(System.in);
  b=x.nextInt();
  if(a<b)
  throw new AgeException("Father's age less than son's age");
  System.out.println("Father's age- "+a+"Son's age- "+b);
 }
}
class Excep
{
 public static void main(String args[])
 {
  try
  {
   new Son();
   }
  catch(AgeException e)
{
  System.out.println(e);
 }
}
}
 


