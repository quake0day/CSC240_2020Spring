package Chapter9;


public class StringBuilderDemo2 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder(
                "We moved from Chicago to Atlanta.");
        System.out.println(str.indexOf("Atlanta"));
        System.out.println(str.indexOf("ta"));
        str.replace(25, 32, "New York");
        System.out.println(str);
    }
}
