class Same_Number{
public static void main(String[]args)
{
int a=12345;
int reverse=0;

while(a>0)
{
int rem=a%10;
reverse=reverse*10+rem;
a=a/10;
}
System.out.println(reverse);
while(reverse>0)
{
int rem1=reverse%10;
System.out.println("exact num:"+rem1);
reverse=reverse/10;
}
System.out.println(reverse);
}}