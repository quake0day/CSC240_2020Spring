package Chapter11;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Example2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please input a number:");
        double a = 0;
        try {
            a = keyboard.nextDouble();
        }
        catch (InputMismatchException e)
        {
            System.out.println("ERROR!! Please input a number!!!!");
        }
        catch (Exception e)
        {
            System.out.println("NOT INPUT MISMATCH EXCEPTION");
        }
        finally
        {
            System.out.println("This is the last part");
        }

        System.out.println(a);
    }
}
