package Chapter9.Review;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

// Review Question 5

public class Weather {

    public static void main(String[] args) throws IOException {


        String[] weatherData = getData(); 
        
        // Your code goes here

    }


    public static String[] getData() throws IOException {

        URL url = new URL("https://cs.wcupa.edu/schen/csc240/weather.csv");
        URLConnection connection = url.openConnection();

        InputStreamReader input = new InputStreamReader(connection.getInputStream());
        BufferedReader buffer = null;
        StringBuilder data = new StringBuilder();

        String line = "";
        try {
            buffer = new BufferedReader(input);

            while ((line = buffer.readLine()) != null) {
                data.append(line + "\n");
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
        return data.toString().split("\n");
    }

}
