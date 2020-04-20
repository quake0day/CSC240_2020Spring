package MidtermAnswers;

public class ZombieDog extends BioWeapon implements Canine, Movable {

    private String type = "Canine";
    public String getType()
    {
        return this.type;
    }

    @Override
    public void moveUp() {
        System.out.println("Zombie Dog move up");
    }
    public void moveDown(){
        System.out.println("Zombie Dog move down");
    }
    public void moveLeft(){
        System.out.println("Zombie Dog move to the left");
    }
    public void moveRight(){
        System.out.println("Zombie Dog move to the right");
    }
    public void bark()
    {
        System.out.println("WOOF!!!");
    }
}
