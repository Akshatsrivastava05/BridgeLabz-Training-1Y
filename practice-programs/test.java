package Interface;
@FunctionalInterface
interface Calculator
{
int add(int a,int b);
}
public class test
{
public static void main(String[]args)
{
Calculator c= (a, b) -> a+b;
System.out.println(c.add(5,3));
}
}