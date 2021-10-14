class A
{
public void show(){
System.out.println("In show of A");
}
}

public class FirstProg4
{
public static void main(String args[])
{

System.out.println("Welcome to java I am in main");

new A().show();// invoking instance method using Annonymous object

}

}