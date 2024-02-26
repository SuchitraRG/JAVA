//Automorphic number

class Automorphic_Number{
public static void main(String[]args)
{
int a=75;
int a1=a;
int c=0;
int div=1;

while(a1>0)
{
c++;
a1=a1/10;
}

for(int i=1;i<=c;i++)
{
div=div*10;
}
int rem=a*a%div;

if(rem==a)
{
System.out.println("the no is automorphic");
}
else
{
System.out.println("the no is not automorphic");
}

}}

