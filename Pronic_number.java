// Pronic number
class Pronic_Number{
public static void main(String[]args)
{
int a=6;
int c=0;
for(int i=1;i<=a;i++)
{
if(i*(i+1)==a)
{
c++;
break;
}}

if(c==1)
{
System.out.println("the number is pronic number");
}
else
{
System.out.println("the number is not pronic number");
}

}}

