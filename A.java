import java.util.*;
class A
{
public static void main(String ar[])
{
Scanner x=new Scanner(System.in);
System.out.println("Enter no. of students and no. of subjects");
int n=x.nextInt();
int m=x.nextInt();
int m[]=new int[n+2][m+2];
System.out.println("Enter Marks");
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
m[i][j]=x.nextInt();
}
}
for(int i=0;i<n;i++)
{
int s,a=0;
for(int j=0;j<m;j++)
{
s=s+m[i][j];
a=s/m;
m[0][n]=s
m[0][n+1]=a;
}
}
for(int i=0;i<n;i++)
{
int s,a=0;
for(int j=0;j<m;j++)
{
s=s+m[j][i];
a=s/m;
m[n][0]=s;
m[n+1][0]=a;
