import java.util.*;
class Customer
{
 private String n;
 private int no,q;
 private float p,tp,d,np;
 Customer()
 {
  n="";
  no=0;
  q=0;
  p=0;
}
 Customer(String name,int num,int quantity,float price)
 {
  name=n;
  no=num;
  q=quantity;
  p=price;
  }
 void input()
 {
  Scanner x=new Scanner(System.in);
  System.out.println("Enter Name,number,quantity and price");
  n=x.nextLine();
  no=x.nextInt();
  q=x.nextInt();
  p=x.nextFloat();
  tp=q*p;
  if(tp>=50000)
  d=25;
  else if(tp>=25000 && tp<=50000)
  d=10;
  else
  d=0;
  np=tp-(tp*(d/100));
  }
 void display()
  {
   System.out.println("Name- "+n+" Number- "+no+" Quantity- "+q+" Total price- "+tp);
  }
}
class De
{
 public static void main(String ar[])
 {
   Scanner x=new Scanner(System.in);
   System.out.println("Enter no. of customers");
   int n=x.nextInt();
   Customer ob=new Customer("AC",23,7,700);
   Customer a[]=new Customer[n]; 
   for(int i=0;i<n;i++)
   {
     a[i]=new Customer();
     a[i].input();
     a[i].display();
    }
  }
} 
 
