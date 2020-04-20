package MidtermAnswers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Weather {

    public static void main(String[] args) throws IOException {


        String[] weatherData = getData(); 
        
        // Your code goes here
        double sum = 0;
        int count = 0;
        int count2 = 0;
        double sumHumidity = 0;
        int count3 = 0;
        for(int i = 1; i < weatherData.length; i++)
        {
            //System.out.println(weatherData[i]);
            String[] dataRow = weatherData[i].split(";");
            double tempDaliyMean = Double.parseDouble(dataRow[5]);
            int year = Integer.parseInt(dataRow[0]);
            int month = Integer.parseInt(dataRow[1]);
            int day = Integer.parseInt(dataRow[2]);
            if(year == 2019 && month == 4 && day >= 1 && day <= 4)
            {
                double relativeHumidityDailyMean = Double.parseDouble(dataRow[10]);
                sumHumidity += relativeHumidityDailyMean;
                count3 ++;
            }
            sum += tempDaliyMean;
            count ++;
            if(tempDaliyMean > 45){
                count2++;
            }
        }
        System.out.println("1. the average value in column “Temperature daily min”:" + sum/count    );
        System.out.println("2. # of days the “Temperature daily mean” exceed 45: " + count2 );
        System.out.println("3. the average daily humidity between 04/01/2019 - 04/04/2019: " + sumHumidity/count3 );


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
