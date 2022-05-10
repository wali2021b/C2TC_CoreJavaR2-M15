package com.tns.interfaces;
interface In1
{
int a = 10;
static void display()
{
System.out.println("Static Method value = "+a);
}
}
class A{
	static int a=11;
}
public class Main 
{
public static void main (String[] args)
{
In1.display();
System.out.println("value Is :"+In1.a);
System.out.println("value Is :"+A.a);
}
}