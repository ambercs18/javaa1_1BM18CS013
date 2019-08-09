import java.util.*;
public class Abc
{
public static void main(String ar[])
{
Scanner x=new Scanner(System.in);
System.out.println("Enter the nth number");
int n=x.nextInt();
fib(n);
}
static void  fib(int n)
{
int a=1;
int b=1;
int c=0;
for(int i=0;i<n-1;i++)
{
c=a+b;
a=b;
b=c;
c=a;
}
System.out.print(c);
}
}


