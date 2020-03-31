package HomeworkAnswer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class GasPrices {

    public static void main(String[] args) throws IOException {


        String[] gasData = getData(); // download gas price into an array
        System.out.println("------ Per Year in Buffalo ----- ");

        for(int i = 8; i <= 18; i++) {
            double result = getAverageBuffalo(gasData, i);
            System.out.println(i + " :" + result);
        }

        System.out.println("------ Per Month in NYC ----- ");
        for(int i = 1; i <= 12; i++)
        {
            double result = getAverageMonthNYC(gasData, i);
            System.out.println(i + " : " + result);
        }

        System.out.println("------ Highest Gas Prices in between 08-18 ----- ");


        System.out.println(getHighestPrices(gasData));

        System.out.println("------ Lowest Gas Prices in between 08-18 ----- ");

        System.out.println(getLowestPrices(gasData));

    }

    public static double getLowestPrices(String[] gasData)
    {
        double lowest = Integer.MAX_VALUE;
        for(int i = 1; i < gasData.length; i++)
        {
            String[] dataList = gasData[i].split(",");
            for(int j = 1; j < dataList.length; j++)
            {
                double gasPrice = Double.parseDouble(dataList[j]);
                if(gasPrice < lowest)
                {
                    lowest = gasPrice;
                }
            }
        }
        return lowest;
    }

    public static double getHighestPrices(String[] gasData)
    {
        double highest = Integer.MIN_VALUE; //
        for(int i = 1; i < gasData.length; i++)
        {
            String[] dataList = gasData[i].split(",");
            for(int j = 1; j < dataList.length; j++)
            {
                double gasPrice = Double.parseDouble(dataList[j]);
                if(gasPrice > highest)
                {
                    highest = gasPrice;
                }
            }
        }
        return highest;
    }

    public static double getAverageMonthNYC(String[] gasData, int month)
    {
        double sum = 0;
        double count = 0;
        for(int i = 1; i < gasData.length; i++)
        {
            String[] dataList = gasData[i].split(",");
            String[] dateList = dataList[0].split("/");
            String m = dateList[0];
            int monthInt = Integer.parseInt(m);
            if(monthInt == month) {
                String stringNYCData = dataList[7];
                double NYCData = Double.parseDouble(stringNYCData);
                sum += NYCData; // holding the summation
                count ++; // increase count by 1 for each Buffalo data in that year
            }
        }
        double averageNYC = sum / count;
        return averageNYC;
    }

    public static double getAverageBuffalo(String[] gasData, int years)
    {
        double sum = 0;
        double count = 0;
        for(int i = 1; i < gasData.length; i++)
        {
            String[] dataList = gasData[i].split(",");
            String[] dateList = dataList[0].split("/");
            String year = dateList[2];
            int yearInt = Integer.parseInt(year);
            if(yearInt == years) {
                String stringBuffaloData = dataList[4];
                double buffaloData = Double.parseDouble(stringBuffaloData);
                sum += buffaloData; // holding the summation
                count ++; // increase count by 1 for each Buffalo data in that year
            }
        }
        double averageBuffalo = sum / count;
        //System.out.println(averageBuffalo);
        return averageBuffalo;
    }

    public static String[] getData() throws IOException {

        URL url = new URL("https://cs.wcupa.edu/schen/csc240/Gasoline_Retail_Prices_Weekly_Average_by_Region__Beginning_2008.csv");
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
