package geometry2d;

public class Rectangle implements Figure {
    private double width = 0;
    private double height = 0;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return this.width * this.height;
    }

    public double perimeter() {
        return (double)2.0F * (this.width + this.height);
    }

    public String toString() {
        return "Rectangle (width: " + this.width + ", height: " + this.height + ")";
    }
}
