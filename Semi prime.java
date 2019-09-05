public class Program
{
    public static void main(String[] args) {
		int n=12;
int f=0;
for(int i=2;i<=n/2;i++)
{
if(checks(i)==1 && checks(n-i)==1)
{
f=1;
break;
}
else
continue;
}
if(f==1)
System.out.println("yesss");
else
System.out.println("nnnnnn");
}
static int checks(int m)
{
int ar[]=new int[100];
int c=0;
int f=0;
int x=1;
    for(int i=2;i<=m/2;i++)
    {
        if(m%i==0)
        {
            ar[c]=i;
            c++;
        }
    }
    for(int i=0;i<ar.length;i++)
    {
        if(prime(ar[i])==1)
        {
             x*=ar[i];
            if(x==m)
            {
            f=1;
            break;
            }
            
        }
    }
    if(f==1)
    return 1;
    else
    return 0;
}
static int prime(int n)
{
int c=0;
for(int i=2;i<=n/2;i++)
{
    if(n%i==0)
    c++;
}
if(c==0)
return 1;
else
return 0;
    
}
}

