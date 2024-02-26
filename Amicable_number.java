import java.util.Scanner;
class Amicable_Number{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the first number");
int a=sc.nextInt();
System.out.println("enter the second number");
int b=sc.nextInt();

int sum1=0;
int sum2=0;

for(int i=1;i<a;i++)
{
if(a%i==0)
{
sum1=sum1+i;
}
}

for(int j=1;j<b;j++)
{
if(b%j==0)
{
sum2=sum2+j;
}
}
if(a==sum2 &&b==sum1)
{
System.out.println("the number is amicable number");
}
else
{
System.out.println("the number is not amicable number");
}

}}


