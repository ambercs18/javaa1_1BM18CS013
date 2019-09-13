import java.util.*;
class Person
{
  String n,add;
  int age;
  void input()
  {
    Scanner x=new Scanner(System.in);
    System.out.println("Enter name,address and age");
    n=x.nextLine();
    add=x.nextLine();
    age=x.nextInt(); 
  }
  void display()
  {
    System.out.println(" Name- "+n+" Address- "+add+" Age- "+age);
  }
}
class Student extends Person
{
  int roll,sem;
  void input()
  {
    super.input();
    Scanner x=new Scanner(System.in);
    System.out.println("Enter roll no. and semester no.");
    roll=x.nextInt();
    sem=x.nextInt();
  }
  void display()
  {
    super.display();
    System.out.println(" Roll no.- "+roll+" Semester- "+sem);
   }
}
class Exam extends Student
{
  int m1,m2;
 void input()
 {
   super.input();
   Scanner x=new Scanner(System.in);
   System.out.println("Enter marks");
   m1=x.nextInt();
   m2=x.nextInt();
  }
  void display()
  { super.display();
    System.out.println(" Marks are- "+m1+" "+m2);
   }
  float avg()
  {
    return (float)((m1+m2)/2); 
  }
}
class D
{
 public static void main(String ar[])
 {
   Scanner x=new Scanner(System.in);
   System.out.println("Enter no. of student");
   int n=x.nextInt();
   Exam arr[]=new Exam[n];
   int i,j;
   float m=0;
   float a[]=new float[n]; 
   Person ref;
   for(i=0;i<n;i++)
   {
     arr[i]=new Exam();
     arr[i].input();
     a[i]=arr[i].avg();
    }
   int p=0;
  for(j=0;j<n;j++)
  {
    if(m<a[j])
    {
    m=a[j];
    p=j;
    }
   }
   System.out.println(" Topper is-");
  arr[p].display();
 }
}
    
       
