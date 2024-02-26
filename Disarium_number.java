class Disarium_Number{
public static void main(String[]args)
{
int a=517;
int a1=a;
int a2=a;
int sum=0;
int c=0;

while(a1>0)
{
int rem=a1%10;
c++;
a1=a1/10;
}

while(a2>0)
{
int rem=a2%10;
int result=1;

for(int i=1;i<=c;i++)
{
result=result*rem;
}

sum=sum+result;
c--;
a2=a2/10;
}

if(sum==a)
{
System.out.println("the no is Disarium or unhappy number");
}
else
{
System.out.println("the no is not Disarium or unhappy number");
}

}}






