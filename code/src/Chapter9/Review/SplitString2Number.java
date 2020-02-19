package Chapter9.Review;

// Answers for Review Question 4 Ver 1

import java.util.Scanner;

public class SplitString2Number {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please input a number:");
        String userInput = keyboard.nextLine();
        System.out.println(userInput);
        char[] digits = userInput.toCharArray();
        int sum = 0;
        // 0 - 9
        int highest = 0;
        int lowest = 9;
        for(int i = 0; i < digits.length; i++)
        {
            int number = Character.getNumericValue(digits[i]);
            if(number > highest)
                highest = number;
            if(number < lowest)
                lowest = number;
            sum += number;
        }
        System.out.println(sum);
        System.out.println("Highest :" + highest);
        System.out.println("Lowest :" + lowest);
    }
}
