//Product of given number

class Product_Number{
public static void main(String[]args)
{
int a=1234;
int product=1;

while(a>0)
{
int rem=a%10;
product=product*rem;
 a=a/10;
}
System.out.println(product);
}}