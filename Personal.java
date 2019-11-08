package cie;
import java.util.*;
public class Personal
{
 String u,n;
 int s;
 public void get()
 {
  
  Scanner x=new Scanner(System.in);
  System.out.println("Enter usn,name and sem");
  u=x.nextLine();
  n=x.nextLine();
  s=x.nextInt();
  
  }
 public void show()
 { 
  System.out.println("USN- "+u+"Name- "+n+"Sem- "+s);
 }
}

