import see.*;
import cie.*;
import java.util.*;
public class Pack
{
 public static void main(String ar[])
 {
  Externals arr[]=new Externals[2];
  Internals a[]=new Internals[2];
  for(int i=0;i<2;i++)
  {
   a[i]=new Internals();
    a[i].get();
   }
   for(int i=0;i<2;i++)
  {
    arr[i]=new Externals();
    arr[i].get();
   }
  for(int i=0;i<2;i++)
  {
    a[i].show();
   }
   for(int i=0;i<2;i++)
  {
    arr[i].show();
   }
 }
}
   

