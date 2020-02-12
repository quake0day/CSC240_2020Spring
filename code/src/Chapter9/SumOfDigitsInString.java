package Chapter9;
import java.util.Scanner;

public class SumOfDigitsInString {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please input a number:");
        String userInput = keyboard.nextLine();
        char[] digits = userInput.toCharArray();
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < digits.length; i++)
        {
            // convert into int
            ///int number = digits[i] - '0';
            int number = Integer.parseInt(String.valueOf(digits[i]));
            sum += number;
            if(number > max)
                max = number;
            if(number < min)
                min = number;
        }
        System.out.println(sum);
        System.out.println(max);
        System.out.println(min);
    }
}
