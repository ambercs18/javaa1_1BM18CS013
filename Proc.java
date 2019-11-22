class Q
{
  int n;
  boolean set=false;
	synchronized int get()
	{
		try
    {
		while(!set)
		wait();
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
		System.out.println("GOT "+n);
		set=false;
		notify();
    return n;
	}
	synchronized void put(int n)
  {
    try
		{
 		while(set)
		wait();
		}
	catch(Exception e)
  {
   System.out.print(e);
	}
	this.n=n;
  set=true;
   System.out.println("Put "+n);
	notify();
	}
}
class Producer implements Runnable
{
	Q q;
	Producer(Q q)
	{
		this.q=q;
		new Thread(this,"Producer").start();
	}
	public void run()
	{
		int i=0;
    while(true)
		q.put(i++);
	}
}
class Consumer implements Runnable
{
 Q q;
 Consumer(Q q)
	{
		this.q=q;
		new Thread(this,"Consumer").start();
	}
	public void run()
	{
		while(true)
		q.get();
	}
}
class Proc
{
  public static void main(String ar[])
 {
 	Q q=new Q();
  new Producer(q);
	new Consumer(q);
 }
}
		

