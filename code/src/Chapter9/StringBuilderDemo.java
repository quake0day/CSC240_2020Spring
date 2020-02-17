package Chapter9;


public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        str.append("We sold ");
        str.append(12);
        str.append(" doughnuts for $");
        str.append(15.95);
        str.insert(0, "QUOTE: ");

        String a = "We sold ";
        String b = String.valueOf(12);
        String c = " doughnuts for $";
        String d = a + b + c;
        System.out.println(d);

        System.out.println(str);

    }
}
