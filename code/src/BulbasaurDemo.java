public class BulbasaurDemo {
    public static void main(String[] args) {
        Bulbasaur b = new Bulbasaur();
        b.setLevel(999);
        System.out.println(b.getLevel());
        System.out.println(b.getName());
        System.out.println(b);
        Bulbasaur b2 = new Bulbasaur();
        b2.setLevel(999);
        System.out.println(b.equals(b2));
        System.out.println(b2.equals(b));
        Bulbasaur b3 = b.copy();
        System.out.println(b3);
    }
}
