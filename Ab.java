import java.util.*;
public class Ab
{
public static void main(String ar[])
{
Scanner x=new Scanner(System.in);
System.out.println("Enter the coefficients");
int a=x.nextInt();
int b=x.nextInt();
int c=x.nextInt();
int d=b*b-4*a*c;
double r1,r2;
if(d>0)
{
r1=(-b+Math.sqrt(d))/2*a;
r2=(-b-Math.sqrt(d))/2*a;
System.out.print(r1+" "+r2);
}
else if(d==0)
{
r1=-b/2*a;
}
else
System.out.print("Imaginary roots");
}
}
