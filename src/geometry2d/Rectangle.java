package geometry2d;

import exceptions.HeightException;
import exceptions.WidthException;

public class Rectangle implements Figure {
    private double width = 0;
    private double height = 0;

    public Rectangle(double width, double height) throws  WidthException, HeightException{
        if (width <= 0)
            throw new WidthException();
        this.width = width;
        if (height <= 0)
            throw new HeightException();
        this.height = height;
    }

    public double area() {
        return this.width * this.height;
    }

    public double perimeter() {
        return (double)2 * (this.width + this.height);
    }

    public String toString() {
        return "Rectangle (width: " + this.width + ", height: " + this.height + ")" + ", Perimeter: " + this.perimeter() +", Area: " + this.area() +")";
    }
}
