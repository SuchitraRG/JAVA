// Prime palindrome number
import java.util.Scanner;
class Prime_Palindrome
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the num");
int a=sc.nextInt();
System.out.println("enter the num");
int b=sc.nextInt();

int c=0;
int reverse=0;

if(a==0||a==1)
{
System.out.println("the num is not prime");
}
else
{
for(int i=2;i<=a;i++)
{
if(a%i==0)
{
c++;
break;
}}
if(c==0)
{
System.out.println("the num is prime");
}
else
{
System.out.println("the num is not prime");
}}


while(b>0)
{
int rem=b%10;
reverse=reverse*10+rem;
b=b/10;
}
System.out.println(reverse);

if(a==reverse)
{
System.out.println("the num is prime palindrome");
}
else
{
System.out.println("the num is not prime palindrome");
}
}}


