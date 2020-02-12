package Chapter9;


public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();

        str.append("We sold ");
        str.append(12);
        str.append(" doughnuts for $");
        str.append(15.95);
        str.insert(0, "QUOTE: ");
/*        String a = "We sold ";
        String b = a + 12;
        System.out.println(b);
        String c = b + " doughnuts for $";
        String d = c + 15.95;
*/
        System.out.println(str);

    }
}
