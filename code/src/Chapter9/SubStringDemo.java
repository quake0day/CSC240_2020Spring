package Chapter9;
public class SubStringDemo
{
    public static void main(String[] args)
    {
        String str = "Four score and seven years ago";
        if(str.startsWith("Four"))
        {
            System.out.println("The string starts with Four");
        }
        else
        {
            System.out.println("The string does not start with Four");
        }
    }
}

