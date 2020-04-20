package MidtermAnswers;

public abstract class BioWeapon {
    private int HP = 1;
    public int getHP(){return this.HP;};

    public void setHP(int hp){this.HP = hp;};
    public abstract String getType();
}
