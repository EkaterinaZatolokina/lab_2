package geometry2d;

public class Circle implements Figure{
    private double radius = 0;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }

    public double perimeter() {
        return (Math.PI * 2D) * this.radius;
    }

    public String toString() {
        return "Circle (radius: " + this.radius + ")";
    }
}
