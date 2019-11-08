import java.util.*;
class Gen<T1,T2>
{
  T1 ob1;
  T2 ob2;
  void display(T1 ob1,T2 ob2)
  {
    System.out.println(ob1+"  "+ob2);
   }
}
public class Ge
{
  public static void main(String args[])
  {
    String s;
    int a;
    Scanner x=new Scanner(System.in);
    System.out.println("Enter a string and a integer");
    s=x.nextLine();
    a=x.nextInt();
    Gen<String,Integer> ob=new Gen<String,Integer>();
    ob.display(s,a);
  }
}

