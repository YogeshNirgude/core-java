public class FirstProg6
{

int main(){
System.out.println(" I am in main with 0 args");
return 0;
}
int main(int argc){
System.out.println(" I am in main with 1 args");
return 0;
}

public static void main(String args[])
{

System.out.println("Welcome to java I am in main");

FirstProg6 fp= new FirstProg6();
fp.main();
fp.main(100);
System.out.println("I am in main at the last line");
}

}