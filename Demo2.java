import java.util.*;
class Book
{
String name,author;
double price;
int pg;
Book()
{
name="";
author="";
pg=0;
price=0;
}
void set(Book ob)
{
Scanner x=new Scanner(System.in);
System.out.println("Enter details of Book ");
ob.name=x.nextLine();
ob.author=x.nextLine();
ob.pg=x.nextInt();
ob.price=x.nextDouble();
}
void get(Book ob)
{
System.out.println();
System.out.println("The details are \n"+" Name- "+ob.name+"\n Author Name- "+ob.author+"\n Page no. "+ob.pg+"\n Price- "+ob.price);
}
public String toString()
{
String s="Name- "+name+" Author- "+author+" Price- "+price+" Pages- "+pg;
System.out.println();
return s;
}
}
class Demo2
{
public static void main(String ar[])
{
Scanner x=new Scanner(System.in);
System.out.println("Enter no. of Books");
int n=x.nextInt();
Book ob=new Book();
Book ob2=new Book();
Book arr[]=new Book[n];
for(int i=0;i<n;i++)
{
arr[i]=new Book();
ob.set(arr[i]);
}
for(int i=0;i<n;i++)
{
ob.get(arr[i]);
}
System.out.println(ob2);
}
}
/*Enter no. of Books
2
Enter details of Book 
Inception
Rohit Shetty
677
9000
Enter details of Book
Let us C
Karhadkar
67
9000

The details are 
 Name- Inception
 Author Name- Rohit Shetty
 Page no. 677
 Price- 9000.0

The details are 
 Name- Let us C
 Author Name- Karhadkar
 Page no. 67
 Price- 9000.0

Name-  Author-  Price- 0.0 Pages- 0
*/


