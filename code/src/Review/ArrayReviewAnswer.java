package Review;/*
********************************************
# Array Q1

   **Please do not change any of the existing code**

   This program will download a `tmp.txt` file from a remote server
   and then load the data into an array named `numbers`.

   Please write java code process the array.

********************************************
*/
import java.net.*;
import java.util.Scanner;
import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.charset.*;
import java.util.regex.*;

public class ArrayReviewAnswer
{
    public static void main(String[] args)
    {
        double[] numbers = new double[99999];

      /* download and save tmp.txt from a remote server
         load the data into number array */
        try{
            URL website = new URL("https://www.cs.wcupa.edu/schen/csc142/tmp.txt");
            ReadableByteChannel rbc = Channels.newChannel(website.openStream());
            FileOutputStream fos = new FileOutputStream("tmp.txt");
            fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
            Scanner dataFile = new Scanner(new File("tmp.txt"));
            int count = -1;
            while(dataFile.hasNext()){
                numbers[++count] = Double.parseDouble(dataFile.nextLine());
            }
        }
        catch(Exception ex){
            System.out.println(ex);
            System.out.println("You got an error, Ask Dr. Chen for help");
        }

        /*** Your code goes here ***/
        double sum  = 0;
        for(int i = 0; i < numbers.length; i++)
        {
            sum = sum + numbers[i];
            System.out.println(numbers[i]);
        }
        System.out.println(sum);
        double average = sum / numbers.length;
        System.out.println(average);
        double min = numbers[0];
        double max = numbers[0];
        int min_index = 0;
        int max_index = 0;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] < min)
            {
                min_index = i;
                min = numbers[i];
            }
            if(numbers[i] > max)
            {
                max_index = i;
                max = numbers[i];
            }
        }
        System.out.println("min:" + min);
        System.out.println("max:" + max);
        //       [0, 10, 8, 9, 5]
        // index: 0   1  2  3  4
        System.out.println("min index:" + min_index);
        System.out.println("max index:" + max_index);
        double sum_even = 0;
        for(int i = 0; i < numbers.length; i++)
        {
            if( i % 2 == 0){
                sum_even += numbers[i];
            }
        }
        System.out.println(sum_even);
        // solution 2
//        for(int i = 0; i < numbers.length; i+= 2)
//        {
//            sum_even += numbers[i];
//        }
    }
}

