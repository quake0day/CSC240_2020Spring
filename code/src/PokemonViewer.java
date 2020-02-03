
import java.io.IOException;

public class PokemonViewer {
    public static void main(String[] args) throws IOException {
        String ID = "258";
        String rawData = PokemonDataAPI.getData(ID);
        // Extract the name of the Pokemon
        // From the raw data.
        System.out.println(rawData);
        // Hint: use indexOf(), substring() method in the String class
        int startPos = rawData.indexOf("pokemon\":{\"name\":\"");
        int endPos = rawData.indexOf("\",\"url\":\"");
        String name = rawData.substring(startPos + 18, endPos);
        System.out.println(name);

    }

}
