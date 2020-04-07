package Chapter11;


import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class MultipleError {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please type a interger here: ");
            int num = scanner.nextInt();
            System.out.println("The user input integer is: " + num);

        } catch (InputMismatchException e) {
            System.err.println("Input Mismatch");

        } catch (NoSuchElementException e) {
            System.err.println("No Such Element");

        }  catch (IllegalStateException e) {
            System.err.println("Illegal State");
        }
    }
}