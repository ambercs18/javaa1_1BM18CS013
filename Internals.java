package cie;
import java.util.*;
public class Internals extends Personal
{
 int arr[]=new int[5];
 public void get()
 {
  super.get();
  System.out.println("Enter cie marks");
  Scanner x=new Scanner(System.in);
  for(int i=0;i<5;i++)
  arr[i]=x.nextInt();
 }
 public void show()
 {
  super.show();
  for(int i=0;i<5;i++)
  System.out.println(arr[i]+" ");
  }
}
