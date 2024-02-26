// Palindrome number

class PalindromeNum{
public static void main(String[]args)
{
int a=2002;
int a1=a;
int reverse=0;

while(a1>0)
{
int rem=a1%10;
reverse=(reverse*10)+rem;
a1=a1/10;
}
System.out.println(reverse);



if(a==reverse)
{
System.out.println("the number is palindrome");
}
else
{
System.out.println("the number is not a palindrome");
}

}}

