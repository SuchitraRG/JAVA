// count of digit ex-12345 =5

class Count_Number{
public static void main(String[]args)
{
int count=0;
int a=12345;
while(a>0)
{
int rem=a%10;
count++;
a=a/10;
}
System.out.println(count);
}
}
