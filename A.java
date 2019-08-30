import java.util.*;
class A
{
public static void main(String ar[])
{
Scanner x=new Scanner(System.in);
System.out.println("Enter no. of students and no. of subjects");
int n=x.nextInt();
int m=x.nextInt();
float mr[][]=new float[n+2][m+2];
System.out.println("Enter Marks");
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
mr[i][j]=x.nextFloat();
}
}
for(int i=0;i<n;i++)
{
float s=0;
  float a=0;
for(int j=0;j<m;j++)
{
s=s+mr[i][j];
a=s/m;
}
  mr[i][n]=s;
  mr[i][n+1]=a;
}
for(int i=0;i<n;i++)
{
float s=0;
  float a=0;
for(int j=0;j<m;j++)
{
s=s+mr[j][i];
a=s/m;
}
  mr[n][i]=s;
  mr[n+1][i]=a;
}
  for (float a[]:mr)
  {
    for (float y:a)
    { 
    	if(y!=0)
      System.out.print(y+"\t");
    }
    System.out.println();
  }
}
}
