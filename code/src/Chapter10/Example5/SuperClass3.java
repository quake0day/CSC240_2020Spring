package Chapter10.Example5;

public class SuperClass3
{
    /**
     This method displays an int.
     @param arg An int.
     */

    public void showValue(int arg, String arg2, int arg3, double arg4, String arg5, int arg6, int arg7, int arg8, int arg9)
    {
        System.out.println("SUPERCLASS: " +
                "The int argument was " + arg);
    }

    /**
     This method displays a String.
     @param arg A String.
     */

    public void showValue(String arg)
    {
        System.out.println("SUPERCLASS: " +
                "The String argument was " + arg);
    }
}