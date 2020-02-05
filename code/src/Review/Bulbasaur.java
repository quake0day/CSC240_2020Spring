package Review;

public class Bulbasaur {
    private int id = 1;
    private int level = 1;

    public Bulbasaur()
    {
        id = 1;
        level = 1;
    }
    public void setLevel(int lv)
    {
        level = lv;
        if(level < 16)
        {
            id = 1;
        }
        else if(level >= 16 && level <= 31)
        {
            id = 2;
        }
        else if(level >= 32)
        {
            id = 3;
        }
    }
    public int getLevel()
    {
        return level;
    }
    public String getName()
    {
        if(id == 1)
        {
            return "Bulbasaur";
        }
        else if(id == 2)
        {
            return "Ivysaur";
        }
        else if(id == 3)
        {
            return "Venusaur";
        }
        return "";
    }
    public int getID()
    {
        return id;
    }
    public String toString()
    {
        String result = "Level:" + this.level + " ID: " + this.id;
        return result;
    }
    public boolean equals(Bulbasaur bbs)
    {
        // compare the level and id
        if(this.level == bbs.getLevel() && this.id == bbs.getID())
            return true;
        return false;
    }
    public Bulbasaur copy()
    {
        Bulbasaur temp = new Bulbasaur();
        temp.setLevel(this.level);
        return temp;
    }
}
