package Chapter10.Example2;

/**
 This program demonstrates the order in which
 superclass and subclass constructors are called.
 */

public class ConstructorDemo1
{
    public static void main(String[] args)
    {

        SubClass1 obj = new SubClass1(9999);
        System.out.println(obj.a);
    }
}