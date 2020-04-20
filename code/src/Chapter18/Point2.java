package Chapter18;


public class Point2<T extends Number> {

    private T x;
    private T y;

    public Point2(T x, T y)
    {
        this.x = x;
        this.y = y;
    }

    public void set(T x, T y)
    {
        this.x = x;
        this.y = y;
    }

    public T getX()
    {
        return this.x;
    }
    public T getY()
    {
        return this.y;
    }

    public String toString()
    {
        return "x:" + this.x + " y:" + this.y;
    }
}

