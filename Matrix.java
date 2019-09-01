package vinay;
import java.util.*;
class Matrix
{
int m[][]=new int[2][2];
Matrix()
{
	m[0][0]=0;
	m[0][1]=0;
	m[1][0]=0;
	m[1][1]=0;
}
float det(int a[][])
{
	return ((a[0][0]*a[1][1])-(a[1][0]*a[0][1]));
}
boolean isSingular(int a[][])
{
	if(det(a)==0)
		return true;
	else
		return false;
}
void inverse(int a[][])
{
	if(det(a)!=0)
	{
	int t=a[0][0];
	a[0][0]=a[1][1];
	a[1][1]=t;
	a[0][1]=-a[0][1];
	a[1][0]=-a[1][0];
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
		{
			System.out.print(a[i][j]/det(a)+"\t");
		}
		System.out.println();
		}
	}
	else
		System.out.println("Inverse not possible");
}
}
class Demo
{
	public static void main(String args[])
	{
		int m[][]=new int[2][2];
		Matrix ob=new Matrix();
		Scanner x=new Scanner(System.in);
		System.out.println("Enter 4 elements");

		int a=x.nextInt();
		int b=x.nextInt();
		int c=x.nextInt();
		int d=x.nextInt();
		m[0][0]=a;
		m[0][1]=b;
		m[1][0]=c;
		m[1][1]=c;
		ob.inverse(m);
	}
}
