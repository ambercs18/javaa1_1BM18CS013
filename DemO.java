import java.util.*;
 class Student
{
String usn,name;
int no;
int marks[],credit[];
float sgpa;
void input()
{
Scanner x=new Scanner(System.in);
System.out.println("Enter Name and USN ");
name=x.nextLine();
usn=x.nextLine();
System.out.println("Enter no. of subject");
no=x.nextInt();
marks=new int[no];
credit=new int[no];
System.out.println("Enter credits of "+ no + " subjects");
for(int i=0;i<no;i++)
{
credit[i]=x.nextInt();
}
System.out.println("Enter Marks of "+ no +" subjects");
for(int i=0;i<no;i++)
{
marks[i]=x.nextInt();
}
}
int Grade(int m)
{
if(m>=90 && m<=100)
return 10;
else if(m>=75 && m<90)
return 9;
else if(m>=60 && m<75)
return 8;
else if(m>=45 && m<60)
return 7;
else
return 0;
}
void calculate()
{ float t=0;float s=0;
for(int i=0;i<no;i++)
{
t+=(Grade(marks[i]))*credit[i];
s=s+credit[i];
}
sgpa=(t/s);
}
void display()
{
System.out.println("Name of Student is "+name);
System.out.println("USN of Student is "+usn);
System.out.println("SGPA of Student is "+sgpa);
}
}
class DemO
{
public static void main(String ar[])
{
Student ob=new Student();
ob.input();
ob.calculate();
ob.display();
}
}
