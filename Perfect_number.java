class Perfect_Number{
public static void main(String[]args)
{
int a=6;
int sum=0;

for(int i=1;i<a;i++)
{
if(a%i==0)
{
sum=sum+i;
}
}

if(sum==a)
{
System.out.println("the no is perfect number");
}
else
{
System.out.println("the no is not perfect number");
}

}}

