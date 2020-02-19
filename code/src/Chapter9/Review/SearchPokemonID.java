package Chapter9.Review;

// Answers for Review Question 3

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import java.util.Scanner;

public class SearchPokemonID {

    public static void main(String[] args) throws IOException {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please input a word:");
        String searchWord = keyboard.nextLine();
        searchWord = "\"" + searchWord; // add extra " quotation marks at front
        //System.out.println(searchWord);
        String[] pokemonName = getData(); // download pokemon name into an array

        // Please write a program, ask the user to enter a name or
        // the first few characters of a name of the Pokemon to search for in the array.
        // The program should display all of the names that match the user’s input and their corresponding ID.
        // e.g. User Input --> Mac
        // Output:
            // 66: "Machop"
            // 67: "Machoke"
            // 68: "Machamp"
        // Your code goes here
        for(int i = 1; i < pokemonName.length; i++)
        {
            //System.out.println(pokemonName[i]);
            if(pokemonName[i].toLowerCase().startsWith(searchWord.toLowerCase()))
            {
                System.out.println(i + " : " +pokemonName[i]);
            }
        }

    }


    public static String[] getData() throws IOException {

        URL url = new URL("https://cs.wcupa.edu/schen/csc240/pokemonName.csv");
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
        return data.toString().split(",");
    }

}
