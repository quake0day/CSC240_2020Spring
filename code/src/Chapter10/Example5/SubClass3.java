package Chapter10.Example5;

public class SubClass3 extends SuperClass3
{
    /**
     @param arg An int.
     */
    @Override
    public void showValue(int arg, String df, int sa, double d, String x, int g, int aa, int arg8, int arg9)
    {
        System.out.println("SUBCLASS: " +
                "The int argument was " + arg);
    }

    /**
     @param arg A double.
     */

    public void showValue(double arg)
    {
        System.out.println("SUBCLASS: " +
                "The double argument was " + arg);
    }
}