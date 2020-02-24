package Chapter10.Exericise3;

public class Fish extends Animal implements Food {
    public String foodname;
    public Fish(){
        setName();
    }
    @Override
    public void setName() {
        foodname = "Fish";
    }

    @Override
    public String getName() {
        return foodname;
    }
}
