package Chapter10.Example0;

public class DemoInsect
{
    public static void main(String[] args)
    {
        Insect i1 = new Insect();
        i1.setLifespan(39);
        System.out.println(i1.getLifespan());
        BumbleBee b1 = new BumbleBee();
        b1.setLifespan(38);
        System.out.println(b1.getLifespan());
        b1.Sting();
        GrassHopper g1 = new GrassHopper();
        System.out.println(g1.getColor());
    }
}