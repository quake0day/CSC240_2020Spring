package Chapter9.Review;

// Answers for Review Question 2

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;


public class ProcessScore {

        public static void main(String[] args) throws IOException  {


            String scoreData = getData(); // download student score file
            System.out.println(scoreData); // output string

            // Your task
            // calculate the total score of each student
            // and output Name : total score

            // Step 1: Split the string
            String[] students = scoreData.split("#");
            for(int i = 0; i < students.length; i++)
            {
               String[] testScores = students[i].split(",");
               double sumScore = 0;
               for(int j = 1; j < testScores.length; j++)
               {
                   //System.out.println(testScores[j]);
                   double tempScore = Double.parseDouble(testScores[j]);
                   sumScore += tempScore;
               }
                System.out.println(testScores[0] +":" + sumScore);
            }

        }


    public static String getData() throws IOException {

        URL url = new URL("https://cs.wcupa.edu/schen/csc240/data.csv");
        URLConnection connection = url.openConnection();

        InputStreamReader input = new InputStreamReader(connection.getInputStream());
        BufferedReader buffer = null;
        StringBuilder data = new StringBuilder();

        String line = "";
        try {
            buffer = new BufferedReader(input);

            while ((line = buffer.readLine()) != null) {
                data.append(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (buffer != null) {
                try {
                    buffer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return data.toString();
    }

}
