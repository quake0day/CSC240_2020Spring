package Chapter10.Example10;

/**
 This program demonstrates the CompSciStudent class.
 */

public class Demo
{
    public static void main(String[] args)
    {
        // Create a CompSciStudent object.
        CompSciStudent csStudent =
                new CompSciStudent("Si Chen",
                        "89999999", 2012);

        // Store values for math, CS, and gen ed hours.
        csStudent.setMathHours(12);
        csStudent.setCsHours(20);
        csStudent.setGenEdHours(40);

        // Display the student's data.
        System.out.println(csStudent);

        // Display the number of remaining hours.
        System.out.println("Hours remaining: " +
                csStudent.getRemainingHours());
    }
}