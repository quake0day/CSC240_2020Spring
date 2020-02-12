package Chapter9;

public class StringValueofDemo {
    public static void main(String[] args) {
        boolean b = true;
        char [] letters = { 'a', 'b', 'c', 'd', 'e' };
        double d = 2.4981567;
        int i = 7;
        System.out.println(String.valueOf(b).length());
        System.out.println(String.valueOf(letters));
        System.out.println(String.valueOf(letters, 1, 3));
        System.out.println(String.valueOf(d).length());
        System.out.println(String.valueOf(i));

    }
}
