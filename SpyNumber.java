//Spy Number
class SpyNumber
{
public static void main(String[]args)
{
int a=1124;
int sum=0;
int product=1;
while(a>0)
{
int rem=a%10;
sum=sum+rem;
product=product*rem;
a=a/10;
}
System.out.println(sum);
System.out.println(product);

if(sum==product)
{
System.out.println("the number is Spy Number");
}
else
{
System.out.println("the number is not spy number");
}
}}

