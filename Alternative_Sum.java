// alternative number sum ex- 12345= 1+3+5

class Alternative_Sum{
public static void main(String[]args)
{
int a=12345;
int sum=0;
while(a>0)
{
int rem=a%10;
sum=sum+rem;
a=a/100;
}
System.out.println(sum);
}
}

//output-9