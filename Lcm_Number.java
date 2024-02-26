// LCM of given number

import java.util.Scanner;
class Lcm_Number
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the num");
int a=sc.nextInt();
System.out.println("enter the num");
int b=sc.nextInt();

int largest=a>b?a:b;

while(true)
{
if(largest%a==0&&largest%b==0)
{
System.out.println("the Lcm num is"+largest);
break;
}}
largest++;
}}