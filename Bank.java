import java.util.*;
class Account
{
 String n,acc;
 int no;
 double b;
 void get()
 {
  Scanner x=new Scanner(System.in);
  System.out.println("Enter name,type of account,acc. number and balance");
  n=x.next();
  acc=x.next();
  no=x.nextInt();
  b=x.nextDouble();
 }
 void display()
 {
  System.out.println("Name- "+n+" Account- "+acc+" Number "+no+" Balance "+b);
 }
 void deposit(double d)
 {
  b+=d;
 }
 void withdraw(double w)
 {
  b-=w;
 }
 void compute() {}
  void check() {}

}


class Savings extends Account
{
 double rt=5;
 void compute()
 {
  get();
  Scanner x=new Scanner(System.in);
  System.out.println("Enter time");
  int t=x.nextInt();
  double i=(double)b*Math.pow((1+rt)/100,t);
  System.out.println("Interest"+i);
  super.deposit(i);
 }
}
class Current extends Account
{
 void check()
 { 
 get();
 int t=100;
 float minbal=1000;
 if(b<minbal)
 {
  b-=t;
 }
}
}
class Bank
{
 public static void main(String ar[])
 {
  Scanner x=new Scanner(System.in);
  System.out.println("Enter choice 1 for savings and 2 for Current");
  int ch=x.nextInt();
  Account r=null;
  if(ch==1)
  {
   r=new Savings();
   r.compute();
  }
  else
  {
   r=new Current();
   r.check();
  }
  System.out.println("Enter 1 withdraw to  and 2 to deposit");
  int ch1=x.nextInt();
  if(ch==1)
  {
    System.out.println("Enter amount");
    double w=x.nextDouble();
    r.withdraw(w);
  }
  else
  {
   System.out.println("Enter amount");
   double w=x.nextDouble();
   r.deposit(w);
  }
  r.display();
 }
}

