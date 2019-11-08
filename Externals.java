package see;
import cie.*;
import java.util.*;
public class Externals extends Personal
{
 int ar[]=new int[5];
 public void get()
 {
  Scanner x=new Scanner(System.in);
  System.out.println("Enter see marks");
  for(int i=0;i<5;i++)
  ar[i]=x.nextInt();
  }
  public void show()
  {
   for(int i=0;i<5;i++)
   System.out.println(ar[i]+" ");
   }
}
