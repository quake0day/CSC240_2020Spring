package Chapter10.Example0;

public class Insect
{
    private int lifespan;
    private String color;

    public Insect()
    {
            lifespan = 0;
            color = "";
    }
    public void setLifespan(int days)
    {
        lifespan = days;
    }
    public int getLifespan()
    {
        return lifespan;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    public String getColor()
    {
        return color;
    }
}