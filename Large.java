class Large
{
  public static void main(String ar[])
  {
    int m=0;
    for(int i=0;i<ar.length;i++)
    {
      if(m<Integer.parseInt(ar[i]))
      m=Integer.parseInt(ar[i]);
      }
   System.out.println("Largest Number- "+m);
   }
}
