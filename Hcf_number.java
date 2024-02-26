// HCF of given number

import java.util.Scanner;
class Hcf_Number
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the num");
int a= sc.nextInt();
System.out.println("enter the num");
int b= sc.nextInt();

int smallest=a<b?a:b;

int hcf=0;
for(int i=1;i<=smallest;i++)
{
if(a%i==0&&b%i==0)
{
hcf=i;
}
}
System.out.println("the hcf is "+hcf);
}}