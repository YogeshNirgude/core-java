class A
{
 void m1()

{ 
 System.out.println("welcome to non static method m1");
}
static void m2()
{
 System.out.println("welcome to static method m2");
}
}
 class Firstprog2
{
 public static void main(String args[])
{
 System.out.println("welcome to java FP");

A a1;
a1=new A();

A a2=new A();
a1.m1();
a2.m1();

A.m2();
}
}
