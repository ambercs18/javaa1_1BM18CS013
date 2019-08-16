import java.util.*;
public class Sum
{
public static void main(String args[])
{
Scanner x=new Scanner(System.in);
System.out.println("Enter rows and columns");
int r=x.nextInt();
int c=x.nextInt();
int ar[][]=new int[r][c];
System.out.println("Enter rows and columns");
int r1=x.nextInt();
int c1=x.nextInt();
int arr[][]=new int[r1][c1];
System.out.println("Enter array elements");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
ar[i][j]=x.nextInt();
}
}
System.out.println("Enter array elements for second matrix");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
arr[i][j]=x.nextInt();
}
}
if(r==r1 && c==c1)
{
System.out.println("Sum of 2-D array is");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
System.out.print((ar[i][j]+arr[i][j])+"\t");
}
System.out.println();
}
System.out.println("Difference of 2-D array is");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
System.out.print((ar[i][j]-arr[i][j])+"\t");
}
System.out.println();
}
}
else
System.out.print("Not Possible");
}
}

