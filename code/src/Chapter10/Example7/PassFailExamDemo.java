package Chapter10.Example7;

import java.util.Scanner;

/**
 This program demonstrates the PassFailExam class.
 */

public class PassFailExamDemo
{
    public static void main(String[] args)
    {
        PassFailExam pfe1 = new PassFailExam(10, 1, 5);
        System.out.println(pfe1.getGrade());

    }
}