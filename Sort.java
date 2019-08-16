import java.util.*;
public class Sort
{
public static void main(String ar[])
{
Scanner x=new Scanner(System.in);
System.out.println("Enter size");
int s=x.nextInt();
int a[]=new int[s];
System.out.println("Enter elements");
for(int i=0;i<s;i++)
{
a[i]=x.nextInt();
}
System.out.println("Unsorted array");
for(int i=0;i<s;i++)
{
System.out.print(a[i]+" ");
}
System.out.println();
System.out.println("Sorted array");
for(int i=0;i<s;i++)
{
for(int j=i+1;j<s;j++)
{
if(a[i]>a[j])
{
int t=a[i];
a[i]=a[j];
a[j]=t;
}
}
}
for(int i=0;i<s;i++)
{
System.out.print(a[i]+" ");
}
}
}
