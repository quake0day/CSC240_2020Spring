package Chapter10.Example17;

public class Demo {
    public static void main(String[] args) {
        Foo foo = parameter -> parameter + " from lambda";
        String result = UseFoo.add("Message", foo);

        // output result
        System.out.println(result);
    }
}
