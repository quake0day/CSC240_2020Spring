package Chapter18;

public class AutoBoxing {
    public static void main(String[] args) {
        Integer a = new Integer(5);
        System.out.println(a.hashCode());
        int b = a;
        Integer c = new Integer(8);
        Point<Integer> pInt = new Point<>(a, c);
        int d = 5;
        int e = 8;
        Point<Integer> pInt2 = new Point<>(d, e);
    }
}
