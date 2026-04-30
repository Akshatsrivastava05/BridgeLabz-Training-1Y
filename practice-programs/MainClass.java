public interface InterfaceExample
{
void show();
}
public class interfacechildclass implements InterfaceExample
{
@Override
public void show()
{
System.out.println("Hi");
}
}
public class MainClass
{
public static void main(String[]args)
{
interfacechildclass ch=new interfacechildclass();
ch.show();
}
}