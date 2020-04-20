package MidtermAnswers;

public class BioWeaponDemo {
    public static void main(String[] args) {
        ZombieDog zd1 = new ZombieDog();
        Licker l1 = new Licker();
        spin(zd1);
        spin(l1);
    }

    // Your code goes here.
    // spin()
    public static void spin(Movable z)
    {
        z.moveUp();
        z.moveRight();
        z.moveLeft();
        z.moveDown();
    }

}
