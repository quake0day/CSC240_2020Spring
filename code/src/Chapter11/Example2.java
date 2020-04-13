package Chapter11;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Example2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please input a number:");
        double a = 0;
        double b = 0;
        double c = 0;
        try {
            a = keyboard.nextDouble();
            c = a / b;
        }
        catch (InputMismatchException e)
        {
            System.out.println("Error input");
        }
        catch (Exception e)
        {
            System.out.println("Exception captured!! ");
        }
        System.out.println(c);
    }
}
