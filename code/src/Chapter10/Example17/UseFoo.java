package Chapter10.Example17;

public class UseFoo {
    // add() takes the Foo interface as a parameter:
    public static String add(String string, Foo foo) {
        return foo.method(string);
    }
}
