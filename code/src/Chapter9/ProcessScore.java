package Chapter9;


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
            for(int i = 1; i < students.length; i++)
            {
                //System.out.println(students[i]);
                // student[1] = "ANNA,6,6,6,5,6,13,12,4,4.5,11,10,";
                // scores[0] = "ANNA"
                // scores[1] = "6"
                // score[2] = "6"
                //...
                // How to cover student[1] ==> scores[]
                String[] scores = students[i].split(",");
                double summation = 0;
                String firstName = scores[0];
                for(int j = 1; j < scores.length; j++)
                {
                    //System.out.println(scores[j]);
                    summation += Double.parseDouble(scores[j]);
                }
                System.out.println(firstName + " : " + summation);
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
