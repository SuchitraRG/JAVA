// prime number
class primenumber{
public static void main(String[]args)
{
int a=5;
int c=0;

if(a==0||a==1)
{
System.out.println("the number is not prime");
}
else
{
 
for(int i=2;i<a;i++)
{
if(a%i==0)
{
c++;

break;
}
}

if(c==0)
{
System.out.println("the number is prime");
}
else
{
System.out.println("the number is  not prime");
}

}

}}






