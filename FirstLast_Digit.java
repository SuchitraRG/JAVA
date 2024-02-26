// first and last digit of given number ex-1028 like fd-1,ld-8

package S1;
class FirstLast_Digit
{
public static void main(String[]args)
{
System.out.println(firstAndLastDigit());
}
public static int firstAndLastDigit()
{
int a=1028;
int a1=a;
int c=0;
int div=1;

while(a1>0)
{
c++;
a1=a1/10;
}

for(int i=1;i<=c-1;i++)
{
div=div*10;
}

int last_digit=a/div;
System.out.println(last_digit);
return last_digit;

 int first_digit=a%10;
System.out.println(first_digit);
return first_digit;
}
}
