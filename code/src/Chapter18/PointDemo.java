package Chapter18;

public class PointDemo {
    public static void main(String[] args) {
        Point<String> pString = new Point<>("Si", "Chen");
        System.out.println(pString);
        pString.set("CSC", "240");
        System.out.println(pString);
        System.out.println(pString.getX());
        System.out.println(pString.getY());

        Point<Integer> pInt = new Point<>(4, 3);
        System.out.println(pInt);
        pInt.set(5, 6);
        System.out.println(pInt);
        System.out.println(pInt.getX());
        System.out.println(pInt.getY());

        Bulbasaur b1 = new Bulbasaur();
        b1.setLevel(9999);
        Bulbasaur b2 = new Bulbasaur();
        b2.setLevel(15);
        Point<Bulbasaur> pBulb = new Point<>(b1, b2);
        System.out.println(pBulb.getX().getName());
        System.out.println(pBulb.getY().getLevel());

        // raw type
        Point randomPoint = new Point("Si Chen", 123);
        System.out.println(randomPoint);
        System.out.println(randomPoint.getX());
        System.out.println(randomPoint.getY());
        String name = (String)randomPoint.getX();
        int a = (Integer) randomPoint.getY();
        System.out.println(name);
        System.out.println(a);


        Point<Number> pNumber = new Point<>(5.0, 6.0);
        double result = sqLength(pNumber);
        // 5*5 + 6*6 = 25 + 36 = 61
        System.out.println(result);
        double result2 = sqLength(pInt);
        // 5*5 + 6*6 = 25 + 36 = 61
        System.out.println(result2);

       //sqLength(pString);
    }

    public static double sqLength(Point<? extends Number> p)
    {
        Number a = (Number)p.getX();
        Number b = (Number)p.getY();
        double x = a.doubleValue();
        double y = b.doubleValue();
        return x*x + y*y;
    }
}
