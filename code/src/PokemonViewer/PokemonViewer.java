package PokemonViewer;

import java.io.IOException;

public class PokemonViewer {
    public static void main(String[] args) throws IOException {
        PokemonViewerGUI p = new PokemonViewerGUI();
        String ID = "151";
        String rawData = PokemonDataAPI.getData(ID);
        // Extract the name of the Pokemon
        // From the raw data.
        System.out.println(rawData);
        String name = PokemonDataAPI.getPokemonName(ID);
        System.out.println(name);

        String URL = PokemonDataAPI.getPokemonImageURL(ID);
        System.out.println(URL);

        PokemonDataAPI.displayImageFromURL(URL);
    }

}
