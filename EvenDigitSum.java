// sum of all even digit number
class EvenDigitSum{
public static void main(String[]args)
{
int a=12345;
int sum=0;
while(a>0)
{
int rem=a%10;
a=a/10;
if(rem%2==0)
{
sum=sum+rem;
}
}
System.out.println(sum);
}
}
