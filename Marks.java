import java.util.*;
class Student
{
  String u,n;
  int s;
  void get()
  {
   Scanner x=new Scanner(System.in);
   n=x.nextLine();
   u=x.next();
   s=x.nextInt();
  }
 void show()
 {
  System.out.println("Name- "+n+" USN- "+u+" Sem.- "+s);
 }
}
class Test extends Student
{
  int m[3];
  int [c];
  void get()
  {
    Scanner x=new Scanner(System.in);
   super.get();
   System.out.println("Enter marks and credit of 3 subjects");
   for(int i=0;i<=2;i++)
   {
    m[i]=x.nextInt();
    c[i]=x.nextInt();
   }
 }
 void show()
 {
  super.show();
  for(int i=0;i<3;i++)
  System.out.println(m[i]);
 }
}
class Exam extends Test
{
 int ms[3];
 void get()
 {
  super.get();
  System.out.println("Enter SIE marks");
  for(int i=0;i<=2;i++)
   {
    ms[i]=x.nextInt();
   } 
  }
 void show()
 {
  super.show();
  for(int i=0;i<3;i++)
  System.out.println(ms[i]);
 }
}
class Result extends Exam
{
 float sgpa;
 int grade(int a,int b)
 {
  for(int i=0;i<3;i++)
  {
   if(a+b<=100 && a+b>=90)
   return 10;
   else if(a+b<=90 && a+b>=75)
   return 9;
   else if(a+b<=75 && a+b>=40)
   return 8;
   else
   return 0;
   }
 }
 void compute()
 { 

  int sum;
  get();
  for(int i=0;i<3;i++)
  {
   sum+=c[i];
   sgpa=grade(m[i],ms[i])*c[i];
  }
 sgpa=sgpa/sum;
  }
 void show()
 {
  super.show()
  System.out.println("SGPA- "+sgpa);
  }
}
