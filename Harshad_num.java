// Harshad number
class Harshad_Num{
public static void main(String[]args)
{
int a=99;
int a1=a;
int sum=0;

while(a1>0)
{
int rem=a1%10;
sum=sum+rem;
a1=a1/10;
}
if(a%sum==0)
{
System.out.println("the no. is harshad number");
}
else
{
System.out.println("the no. is not harshad number");
}

}}