package Chapter9;

public class StringBuilderDemo3 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder(
                "I ate 100 blueberries!");
        // Display the StringBuilder object.
        System.out.println(str);
        // Delete the '0'.
        str.deleteCharAt(8);
        System.out.println(str);
        // Delete "blue".
        str.delete(9, 13);
        // Display the StringBuilder object.
        System.out.println(str);
        // Change the '1' to '5'
        str.setCharAt(6, '5');
        // Display the StringBuilder object.
        System.out.println(str);
    }
}
