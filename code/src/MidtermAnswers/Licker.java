package MidtermAnswers;

public class Licker extends BioWeapon implements Movable{
    private String type = "Human";
    @Override
    public String getType() {
        return this.type;
    }
    @Override
    public void moveUp() {
        System.out.println("Licker move up");
    }
    public void moveDown(){
        System.out.println("Licker move down");
    }
    public void moveLeft(){
        System.out.println("Licker move to the left");
    }
    public void moveRight(){
        System.out.println("Licker move to the right");
    }
}
