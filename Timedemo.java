import java.util.*;
class Time
{
int h,m,s;
Time(int a,int b,int c)
{
h=a;
m=b;
s=c;
}
Time()
{
h=0;
m=0;
s=0;
}
void advance(int a,int b,int c)
{
s=s+c;
m=m+b+(s/60);
s=s%60;
h=h+a+(m/60);
m=m%60;
h=h%24;
}
void current()
{
System.out.println("Enter Time");
Scanner x=new Scanner(System.in);
h=x.nextInt();
m=x.nextInt();
s=x.nextInt();
}
void print()
{
System.out.println(h+":"+m+":"+s);
}
}
class Timedemo
{
public static void main(String a[])
{
Scanner x=new Scanner(System.in);
Time ob=new Time();
  int ch=0;
while(ch!=4)
{
System.out.println("Enter 1 to input time \n Enter 2 to advance time \n Enter 3 to display time \n Enter 4 to exit");
ch=x.nextInt();
switch(ch)
{
case 1:
ob.current();
break;
case 2:
System.out.println("Enter Time");
int h=x.nextInt();
int m=x.nextInt();
int s=x.nextInt();
ob.advance(h,m,s);
break;
case 3:
ob.print();
break;
default:
break;
}
}
}
}


