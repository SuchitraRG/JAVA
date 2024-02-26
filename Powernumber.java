// power of given number

import java.util.Scanner;
class PowerNumber{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the base value:");
int b=sc.nextInt();
System.out.println("enter the exponent value:");
int e=sc.nextInt();

int result=1;
for(int i=1;i<=e;i++)          
{                              
 result=result*b;           
}
System.out.println(result);

}}
