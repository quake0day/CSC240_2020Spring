package Chapter9;

public class StringSplitDemo {
    public static void main(String[] args) {
        // Create a String to tokenize.
        String str = "1,SI,CHEN,100;2,AA,BB,99";
        // Get the tokens from the string.
        String[] tokens = str.split(";");
        // Display each token.
        for(int i = 0; i < tokens.length; i++)
        {
            String[] items = tokens[i].split(",");
            for(String e : items)
            {
                System.out.println(e);
            }
        }
    }
}
