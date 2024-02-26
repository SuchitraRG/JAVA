// Reverse number
class ReverseNumber{
public static void main(String[]args)
{
int a=12345;
int reverse=0;

while(a>0)
{
int rem=a%10;

reverse=(reverse*10)+rem;
a=a/10;
}
System.out.println(reverse);
}}