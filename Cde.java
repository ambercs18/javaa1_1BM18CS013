import java.util.*;
interface Stack
{
 void push(int e);
 int pop();
 void display();
}
class Dyno implements Stack
{ 
  int t,s;
  int ar[];
  Dyno()
  {
   Scanner x=new Scanner(System.in);
   System.out.println("Enter size");
   s=x.nextInt();
   ar=new int[s];
   t=-1;
   }
 public void push(int e)
 {
  if(t==s-1)
  {
   s*=2;
   int st[]=new int[s];
   for(int i=0;i<ar.length;i++)
   {
    st[i]=ar[i];
   }
  ar=st;
  ar[++t]=e;
  }
 else
 ar[++t]=e;
 }
public int pop()
{
 int x;
 if(t==-1)
 {
  System.out.println("Stack Underflow");
  return -9999;
 }
 else
 {
  x=ar[t];
  t-=1;
  return x;
 }
}
public void display()
{
 if(t!=-1)
 {
 for(int i=t;i>=0;i--)
 System.out.print(ar[i]+" ");
 }
else
System.out.println("Stack Empty");
}
}
class Cde
{
 public static void main(String ar[])
 {
   Stack r=new Dyno();
   int ch1;
   Scanner x=new Scanner(System.in);
   do
   {
    System.out.println("Enter 1 to push\nEnter 2 to pop\nEnter 3 to display");
    int ch=x.nextInt();
    if(ch==1)
    {
     System.out.println("Enter element to push");
     int e=x.nextInt();
     r.push(e);
    }
   else if(ch==2)
   {
    System.out.println("Popped element is "+r.pop());
   }
   else
   r.display();
   System.out.println("Enter 1 to continue and 0 to exit");
   ch1=x.nextInt();
   }while(ch1!=0);
  }
}
    
