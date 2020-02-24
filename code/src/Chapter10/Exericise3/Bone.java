package Chapter10.Exericise3;

public class Bone implements Food {
    public String foodname = "";
    public Bone(){
        setName();
    }
    @Override
    public void setName() {
        foodname = "Bone";
    }
    @Override
    public String getName() {
        return foodname;
    }
}
