package Chapter10.Exercise;

import java.awt.*;

public class Rectangle extends Shape{
    private Point lowerLeftCorner;
    private Point upperRightCorner;


    public Point getLowerLeftCorner() {
        return lowerLeftCorner;
    }

    public void setLowerLeftCorner(Point lowerLeftCorner) {
        this.lowerLeftCorner = lowerLeftCorner;
    }

    public Point getUpperRightCorner() {
        return upperRightCorner;
    }

    public void setUpperRightCorner(Point upperRightCorner) {
        this.upperRightCorner = upperRightCorner;
    }
}
