import java.util.*;
class Emp {
	int no;
	String name;
	float basic,da,it,net;
	void input()

	{
		Scanner x=new Scanner(System.in);
		System.out.println("Enter employee number,Name and basic pay");
		no=x.nextInt();
		name=x.next();
		basic=x.nextFloat();
	}
	void calculate()
	{
		da=(3*basic)/4;
		it=(3*basic)/10;
		net=basic+da-it;
	}
	void display()
	{
		System.out.println("Name of Employee is "+name+"\n Employee Number is "+no+"\n Net Salary = "+net);

	}
}
public class EmpDemo
{
	public static void main(String a[])
	{
		Emp ob=new Emp();
		ob.input();
		ob.calculate();
		ob.display();
	}
}
