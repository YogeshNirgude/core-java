public class FirstProg5
{
static{
System.out.println("I am in static block 3");
}
static{
System.out.println("I am in static block 1");
}
static{
System.out.println("I am in static block 2");
}

static{
System.out.println("I am in static block 4");
}


{
System.out.println("I am in Non - static block ");
}
public static void main(String args[])
{

System.out.println("Welcome to java I am in main");

FirstProg fp1=new FirstProg();
FirstProg fp2=new FirstProg();
FirstProg fp3=new FirstProg();
FirstProg fp4=new FirstProg();

System.out.println("I am in main at the last line");
}

}