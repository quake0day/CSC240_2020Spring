package Chapter10.Example9;

import java.util.Scanner;

public class Example {
    public static void main(final String[] args) {
        //Shape myShape = new Square(8);
        //myShape.show();
        Square s1 = new Square(8);
    }
}

abstract class Shape {
    private String name;

    public Shape(final String name) {
        this.name = name;
    }

    public abstract void show();
}

abstract class Rectangle extends Shape {
    private int length;
    private int width;

    public Rectangle(final int length, final int width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }
}

class Square extends Rectangle {
    private int edge;

    public Square(final int edge) {
        super(edge, edge);
        this.edge = edge;
    }

    @Override
    public void show() {
        System.out.println("A square with edge length " + this.edge);
    }
}