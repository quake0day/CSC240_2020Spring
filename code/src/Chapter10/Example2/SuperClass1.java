package Chapter10.Example2;

public class SuperClass1
{
    /**
     Constructor
     */
    public int a;

    public SuperClass1()
    {
        a = 0;
        System.out.println("This is non-arg " +
                "superclass constructor.");
    }

    public SuperClass1(int k)
    {
        a = k;
        System.out.println("This is with-int-arg  " +
                "superclass constructor.");
    }

}