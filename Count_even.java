// count of even digit number ex-12345=2
class Count_Even
{
public static void main(String[]args)
{
int a=12345;
int count=0;
while(a>0)
{
int rem=a%10;
a=a/10;

if(rem%2==0)
{
count++;
}

}
System.out.println(count);
}
}