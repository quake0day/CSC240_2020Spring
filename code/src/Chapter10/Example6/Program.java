package Chapter10.Example6;

public class Program {
    public static void main(final String[] args) {
        Rectangle myShape;
        System.out.println("Show Rectangle:");
        myShape = new Rectangle(10, 8);
        myShape.show();

        System.out.println();
        System.out.println("Show Square:");
        myShape = new Square(6);
        myShape.show();
    }
}

class Rectangle {
    private final int length;
    private final int width;

    public Rectangle(final int length, final int width) {
        this.length = length;
        this.width = width;
    }

    public void show() {
        System.out.println("A rectangle with length "
                + this.length
                + " and width "
                + this.width);
    }
}

class Square extends Rectangle {
    private int edge;

    public Square(final int edge) {
        super(edge, edge);
    }

    // Overriding the show method in the Rectangle class.
    @Override
    public void show() {
        super.show();
        System.out.println("-- and is a square");
    }
}