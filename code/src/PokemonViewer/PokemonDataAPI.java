package PokemonViewer;

import java.net.*;
import java.io.*;
import java.nio.charset.Charset;
import javax.swing.*;

public class PokemonDataAPI {


    public static String getData(String id) {

        /* download and save tmp.txt from a remote server
         load the data into number array */
        String data = "";
        try{
            URLConnection connection = new URL("https://pokeapi.co/api/v2/pokemon-form/" + id).openConnection();
            connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");
            connection.connect();
            BufferedReader r  = new BufferedReader(new InputStreamReader(connection.getInputStream(), Charset.forName("UTF-8")));

            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = r.readLine()) != null) {
                sb.append(line);
            }
            //System.out.println(sb.toString());
            data = sb.toString();
        }
        catch(Exception ex){
            System.out.println(ex);
            System.out.println("You got an error, Ask Dr. Chen for help");
        }
        return data;
    }

    public static void saveImage(String imageUrl, String destinationFile) throws IOException {
        URL url = new URL(imageUrl);
        InputStream is = url.openStream();
        OutputStream os = new FileOutputStream(destinationFile);

        byte[] b = new byte[2048];
        int length;

        while ((length = is.read(b)) != -1) {
            os.write(b, 0, length);
        }

        is.close();
        os.close();
    }

    // get pokemon name from ID
    public static String getPokemonName(String ID)
    {
        String rawData = getData(ID);
        int startPos = rawData.indexOf("\"pokemon\":{\"name\":\"");
        int endPos = rawData.indexOf("\",\"url\":\"");
        String name = rawData.substring(startPos + 19, endPos);
        return name;
    }

    // get pokemon icon url from ID
    // front shiny version
    public static String getPokemonImageURL(String ID)
    {
        String rawData = getData(ID);
        int startPos = rawData.indexOf("\"front_default\":\"");
        int endPos = rawData.indexOf("\",\"front_shiny\"");
        String URL = rawData.substring(startPos + 17, endPos);
        return URL;
    }

    public static void displayImageFromURL(String URL) throws IOException
    {
        String destinationFile = "tmp.png";
        saveImage(URL, destinationFile);
        JFrame frame = new JFrame();
        ImageIcon icon = new ImageIcon("tmp.png");
        frame.add(new JLabel(icon));
        frame.pack();
        frame.setVisible(true);
    }



}
