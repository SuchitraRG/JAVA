class Tech_Number{
public static void main(String[]args)
{
int a=2025;
int a1=a;
int c=0;
int div=1;
int sum=0;

while(a1>0)
{
c++;
a1=a1/10;
}

if(c%2==0)
{
for(int i=1;i<=c/2;i++)
{
div=div*10;
}
}

int rem=a%div;
int quo=a/div;
sum=rem+quo;
int result=sum*sum;

if(result==a)
{
System.out.println("the number is Tech number");
}
else
{
System.out.println("the number is not a Tech number");
}

}}




