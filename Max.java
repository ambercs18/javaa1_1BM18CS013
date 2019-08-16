import java.util.*;
public class Max
{
public static void main(String args[])
{
Scanner x=new Scanner(System.in);
System.out.println("Enter rows and columns");
int r=x.nextInt();
int c=x.nextInt();
int ar[][]=new int[r][c];
System.out.println("Enter array elements");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
ar[i][j]=x.nextInt();
}
}
for (int a[]:ar)
{
for (int b:a)
{
System.out.print(b+"\t");
}
System.out.println();
}
System.out.println();
int m=0;
for (int a[]:ar)
{
for (int b:a)
{
if(m<b)
{
m=b;
}
}
}
System.out.println("Maximum element is "+m);
}
}

