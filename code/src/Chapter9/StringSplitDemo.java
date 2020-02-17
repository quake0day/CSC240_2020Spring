package Chapter9;

public class StringSplitDemo {
    public static void main(String[] args) {
        // Create a String to tokenize.
        String str = "1,SI,CHEN,100;2,AA,BB,99";
        // Get the tokens from the string.
        String[] tokens = str.split(";");
        // Original String : str ==> 1,SI,CHEN,100;2,AA,BB,99
        // after split: tokens[] ==> ["1,SI,CHEN,100","2,AA,BB,99"]
        // Display each token.
        for(int i = 0; i < tokens.length; i++)
        {
            // tokens[0] ==> "1,SI,CHEN,100"
            // tokens[0].split(",") ==> items[] ==> ["1","SI","CHEN","100"]
            String[] items = tokens[i].split(",");
            for(int j = 0; j < items.length; j++)
            {
                System.out.println(items[j]);
            }
        }
    }
}
