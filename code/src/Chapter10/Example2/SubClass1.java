package Chapter10.Example2;

public class SubClass1 extends SuperClass1
{
    /**
     Constructor
     */

    public SubClass1(int k)
    {
        super(999);
        a = k;
        System.out.println("This is the " +
                "subclass constructor.");
    }
}