package Chapter18;
import java.awt.*;
import java.util.ArrayList;

class ColoredPoint <T extends Number> extends Point<T>
{   private Color color;
    public ColoredPoint(T x, T y, Color c)
    {
        super(x, y);
        color = c;
    }

    public Color getColor() { return color;}     // Two subclass methods
}
